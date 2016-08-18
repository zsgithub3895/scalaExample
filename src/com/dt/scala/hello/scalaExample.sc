package com.dt.scala.hello
import scala.collection.mutable.ArrayBuffer
object scalaExample {
 /**
  println("Welcome to the Scala worksheet")
  val array = Array("hello","Tom","world",100)
  for(a <- array) println(a)
   val nums = new Array[Int](10)
   val b = ArrayBuffer[Int]()
   b+= 4
   b += (1,2,3,5)
   b ++= Array(6,7)
   b.trimEnd(2)
   b
   b.insert(2, 100)
   b
   b.remove(2)
   b
	 b.toArray
	 
	 val matrix = Array.ofDim[Double](3,4)
	 matrix(1)(1)=100
	 matrix
		val triangle = new Array[Array[Int]](10)
		 for(i <- 0 until triangle.length)
		         triangle(i) = new Array[Int](i+1)
		         triangle
		         */
val a = Array("[","-","]")                        //> a  : Array[String] = Array([, -, ])
val b = Array(2,5,2)                              //> b  : Array[Int] = Array(2, 5, 2)
val pairs = a.zip(b)                              //> pairs  : Array[(String, Int)] = Array(([,2), (-,5), (],2))

for((x,y) <- pairs) Console.print(x*y)            //> [[-----]]
pairs                                             //> res0: Array[(String, Int)] = Array(([,2), (-,5), (],2))
}