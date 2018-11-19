package io.github.isuzuki

import io.circe.Decoder
import io.circe.parser._
import io.circe.generic.semiauto._

object CustomSemiAutoSample extends App {
  implicit val customItemDecoder: Decoder[CustomItem] = deriveDecoder
  implicit val categoryDecoder: Decoder[Category] = deriveDecoder
  implicit val subCategoryDecoder: Decoder[SubCategory] = deriveDecoder

  println(decode[CustomItem](jsonStr))
}
