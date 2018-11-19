package io.github.isuzuki

import io.circe._
import io.circe.generic.semiauto._
import io.circe.parser._

object SemiAutoSample extends App {
  implicit val decodeItem: Decoder[Item] = deriveDecoder
  implicit val decodeCategory: Decoder[Category] = deriveDecoder
  implicit val decodeSubCategory: Decoder[SubCategory] = deriveDecoder

  println(decode[Item](jsonStr))
}
