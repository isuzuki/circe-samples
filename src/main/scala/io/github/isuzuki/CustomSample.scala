package io.github.isuzuki

import io.circe.Decoder
import io.circe.generic.auto._
import io.circe.parser._

object CustomSample extends App {
  println(decode[CustomItem](jsonStr))
}

case class CustomItem (
  id: Int,
  name: CustomItem.ItemName,
  category: Category
)

object CustomItem {
  implicit val itemNameDecoder: Decoder[ItemName] = Decoder[String].map(ItemName)

  case class ItemName(name: String) extends AnyVal
}
