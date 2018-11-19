package io.github.isuzuki

import io.circe.generic.auto._
import io.circe.parser._

import scala.io.Source

object AutoSample extends App {
  val jsonStr = Source.fromResource("basic.json").mkString
  println(decode[Item](jsonStr))
}
