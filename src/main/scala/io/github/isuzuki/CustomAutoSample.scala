package io.github.isuzuki

import io.circe.generic.auto._
import io.circe.parser._

object CustomAutoSample extends App {
  println(decode[CustomItem](jsonStr))
}
