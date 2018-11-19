package io.github.isuzuki

import io.circe.Decoder

case class CustomItem (
  id: Int,
  name: CustomItem.ItemName,
  category: Category
)

object CustomItem {
  implicit val itemNameDecoder: Decoder[ItemName] = Decoder[String].map(ItemName)

  case class ItemName(name: String) extends AnyVal
}
