package io.github.isuzuki

import io.circe.Decoder
import io.circe.parser._
import io.circe.generic.auto._

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
  implicit val detailDecoder: Decoder[Detail] = Decoder[String].map { s =>
    Detail(decode[Map[String, String]](s).right.get)
  }

  case class Detail(value: Map[String, String]) extends AnyVal
}
