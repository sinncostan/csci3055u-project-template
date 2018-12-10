import scala.io._ //Need for fileio

object FileReader {
  def main(args: Array[String]) { //Main Method
    print("Enter your TextFile: " )
    val inputFile = StdIn.readLine() //Used to Input the TestApp or any file in the same directory 

  val readLines = Source.fromFile(line).mkString; //returns content from the file as String using mkString
  println(readLines) //Prints the contents of the file
  }
}