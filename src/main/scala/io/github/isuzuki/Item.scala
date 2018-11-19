package io.github.isuzuki

case class Item(
  id: Int,
  name: String,
  category: Category
)

case class Category (
  id: Int,
  `type`: String,
  name: String,
  subcategory: Option[SubCategory]
)

case class SubCategory (
  id: Int,
  name: String
)
