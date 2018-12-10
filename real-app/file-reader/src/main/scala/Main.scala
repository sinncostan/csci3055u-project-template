//Basics of Scala in a Real App

import scala.io._ //Need for File I/O

object Main {
  def main(args: Array[String]) { //Main Method
    print("Enter your TextFile: " )
    val inputFile = StdIn.readLine() //Used to Input the TestApp or any file in the same directory (or project directory) 

  val readLines = Source.fromFile(inputFile).mkString; //returns content from the file as String using mkString
  println("\nResults: " + readLines) //Prints the contents of the file
  }
}