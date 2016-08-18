package com.dt.scala.hello
import scala.collection.mutable.ArrayBuffer
object scalaExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(662); 
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
val a = Array("[","-","]");System.out.println("""a  : Array[String] = """ + $show(a ));$skip(21); 
val b = Array(2,5,2);System.out.println("""b  : Array[Int] = """ + $show(b ));$skip(21); 
val pairs = a.zip(b);System.out.println("""pairs  : Array[(String, Int)] = """ + $show(pairs ));$skip(40); 

for((x,y) <- pairs) Console.print(x*y);$skip(6); val res$0 = 
pairs;System.out.println("""res0: Array[(String, Int)] = """ + $show(res$0))}
}
