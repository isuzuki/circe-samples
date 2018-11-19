package io.github

import scala.io.Source

package object isuzuki {
  lazy val jsonStr = Source.fromResource("basic.json").mkString
}
