package io.github.isuzuki

import cats.syntax.either._
import io.circe.Decoder
import io.circe.generic.auto._
import io.circe.parser._

import scala.io.Source

object NestedSample extends App {
  val jsonStr = Source.fromResource("nested.json").mkString
  println(decode[NestedItem](jsonStr))
}

case class NestedItem (
  id: Int,
  name: String,
  detail: NestedItem.Detail
)

object NestedItem {
  implicit val detailDecoder: Decoder[Detail] = Decoder[String].emap { s =>
    decode[Map[String, String]](s).map(Detail).leftMap(_.getMessage)
  }

  case class Detail(value: Map[String, String]) extends AnyVal
}
