package es.elv.kobold
import NWN._
import Implicits._
import scala.collection._
import scala.util.parsing.combinator._
import scala.io.Source

object TwoDA {
	private val log = Kobold.logger()

	private val twodaPath = new java.io.File(Kobold.config.getString("twoda_path"))

	class TwoDAParser extends JavaTokenParsers {
		private val log = Kobold.logger()

		override val whiteSpace = """[ \t]+""".r

		private var _columns: List[String] = _
		private var currentRow = -1

		def header = "2DA V2.0" ~ eol

		def table(table: String): Parser[Table] = header ~ columns ~ rep(row) ^^
		{ case header ~ cols ~ rows => Table(table, cols, rows)}

		def columns: Parser[List[String]] = rep1(cell) ~ eol ^^
			{ case cells ~ eol => { _columns = cells ; cells.map(_ toLowerCase)} }

		def row: Parser[Row] = rowNum ~ rep(cell) ~ eol ^^ {
			case row ~ cells ~ eol => {
				var cx = cells
				while (cx.size < _columns.size) cx = "" :: cx
				if (cx.size > _columns.size)  cx = cx.dropRight(cx.size - _columns.size)
				currentRow += 1
				Row(currentRow, _columns, cx)
			}
		}

		def cell: Parser[String] = (stringLiteral | regex("""[^\s]+""".r)) ^^ {
			case "****" => ""
			case a => a
		}

		def rowNum: Parser[String] = wholeNumber

		def newlines = rep1("\r" | "\n")
		def eol = opt(regex(whiteSpace)) ~ (newlines | regex("$".r))

		def p(n: String, t: String): Option[Table] = {
			parse(table(n), t) match {
				case Success(what, _) => Some(what)
				case Error(msg, _) => {
					log.error("Error reading TwoDA table " + n + ": " + msg)
					None
				}
				case Failure(msg, _) => {
					log.error("Error reading TwoDA table " + n + ": " + msg)
					None
				}
			}
		}
	}

	case class Row(val id: Int, val columns: Seq[String], val cells: Seq[String]) {
		require(columns.size == cells.size)

		def apply(column: Int) =
			if (column >= cells.size) "" else cells(column)

		def apply(column: String) = {
			val idx = columns.indexOf(column)
			if (idx != -1) cells(idx) else ""
		}

		def size = columns.size
	}


	case class Table(val name: String, val columns: Seq[String], val rows: Seq[Row]) {
		rows.foreach(row =>
			require(row.size == columns.size, "cell missing/too much in row " + rows.indexOf(row) + " = " + row.toString)
		)

		def apply(column: Int, row: Int): String = {
			if (column >= columns.size)
				return ""

			if (row >= rows.size)
				return ""

			rows(row)(column)
		}

		def apply(column: String, row: Int): String = {
			val col = columns.indexOf(column.toLowerCase)
			if (col == -1)
				""
			else
				apply(col, row)
		}
	}

	def apply(table: String) = {
		val t = table.toLowerCase
		if (!cache.contains(t)) {
			log.info("Caching table " + t)
			val io = Source.fromFile(new java.io.File(twodaPath + "/" + t + ".2da")).getLines.mkString("")
			val parser = new TwoDAParser
			cache(t) = parser.p(t, io) match {
				case Some(tx) => tx
				case None => Table(t, List(), List())
			}
		}

		cache(t)
	}

	def precacheAllTables {
		val reg = """^(.+?).2da$""".r
		for (f <- twodaPath.listFiles)
			f.getName match {
				case reg(a) => apply(a)
				case _ =>
			}
	}

	private val cache: mutable.Map[String, Table] = mutable.Map()
}
