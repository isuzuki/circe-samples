package io.github.isuzuki

import io.circe.generic.auto._
import io.circe.parser._

object AutoSample extends App {
  println(decode[Item](jsonStr))
}
