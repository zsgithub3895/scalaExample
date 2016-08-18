package com.dt.scala.hello

object ForFuction {
  
  def main(args: Array[String]): Unit = {
    //println(combine("I like Spark"))
    println(connected(1,2,3,4))
  }
  def addA(x : Int) = x+100
  val add = (x: Int) => x+200
  def combine(content: String,left: String="[",right: String="]") = left+content+right
  def connected(args: Int*) = {
    var result = 0
    for(arg <- args) result += arg
    result
  }
  
}