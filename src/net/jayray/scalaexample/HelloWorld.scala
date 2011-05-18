package net.jayray.scalaexample

object HelloWorld {
  def main(args: Array[String]) {
    println("Hello, world!")
    for (value: String <- args) {
      println("value:" + value);
    }
  }
} 