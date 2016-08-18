package com.dt.scala.hello

import scala.io.Source
object TupleOps {

  def main(args: Array[String]): Unit = {
    arrayOperation
  }

  def mapOperation() {
    val ages = Map("Rocky" -> 27, "Spark" -> 2)
      for ((k, v) <- ages) {
        println(k + "--" + v);
      }
  }

  def tripleOperation() {
    val triple = (100, "Scala", "Spark")
    println(triple._1);
    println(triple._2);
    println(triple._3);
  }

  def arrayOperation() {
    val array = Array(1, 2, 3, 4, 5);
    for (i <- array) {
      println(i);
    }
  }

  def fileOperation() {
    //val file =Source.fromFile("F:\\lience.txt")
    val file = Source.fromURL("http://spark.apache.org/")
    for (line <- file.getLines) {
      println(line);
    }
  }

}