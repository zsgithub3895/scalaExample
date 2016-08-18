package com.dt.scala.oop

object HelloOOP {
  
  def main(args: Array[String]){
    val p = new Person()
    println(p.name)
     println(p.privateAge2)
  }
  
}

class Person{
  private var privateAge = 0
  val name = "scala"
  def age = privateAge
  var privateAge2 = 100
}
