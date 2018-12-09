# _CSCI 3055U Final Project_

- _Sinthooran Ravinathan_
- _sinthooran.ravinathan@uoit.net_

## About Scala

> _The language of choice is Scala_
>
> - History
>
>Scala is a modern programming language which shares features of both object-oriented and functional programming. Scala is an object-oriented programming language in the way that all values are objects, and is decribed by classes and traits. Scala is also a functional in the way that every function is also a value and scala provides lightweight syntax for defining functions. Also allows functions to be nested and supports higher-ordered functions with its pattern-matching support. It also run alongside the Java Runtime Environment (JRE), and shares many similar features and processes such as Java.
  
> - Some interesting features
>
>The many interesting features that scala inclues Type Immutability, Lazy computation, Case classes and Pattern Matching, String interpolation, Higher order functions, Traits, and even the Rich Collection set. With these features you can make use of scala for its unique coding style. Some features are especially interesting such as the Rich Set of Collection which contains classes and traits to collect all forms of data, and the Collections can be mutable or immutable. With it you can use it to your own preference along with the other features.

## About the syntax

> _Basic Syntax of Scala_

*Vals*

```scala
val x = 1 //Initialized with only one binding
    //x = 3 //Will not work since val is bound to one binding

    => 1

```

*Vars*

```scala
var y = 1 //Initialized with a binding
    y = 3 //bindings can be updated

    // => 3
```

*Println Statement*

```scala
println("Final Project")
    // => Final Project

println("The Result of x + y = " + (x + y)) //From the above val and var
    // => The Result of x + y = 3
```

*Arrays*

```scala
val array = Array(1,3,5,7,9) //Simple Array Initialization
    println("Last element in this array is: " + array(4))
    // => 9

var arrayStr = Array("Ken", "Randy") //Arrays Using Strings
    println("Original_Array: " + arrayStr.mkString(", "))
    // => Ken, Randy

var arrayElement = arrayStr :+ "Jarek" //Appending the new Element for the Array
    println("Updated_Array: " + arrayElement.mkString(", ")
    // => Ken, Randy, Jarek
```

*Lists*

```scala
val list = List(1,3,5,7,9) //Initialized List
    println("Last element in this list is: " + list(4))
    // => 9

var list = List("Ken", "Randy") //Initialized Immutable List
    println("Original_List: " + list.mkString(", "))
    // => Ken, Randy

var list2 = "Jarek" :: list //Appends the list with the new Element
    println("Updated_List: " + list2.mkString(", "))
    // => Jarek, Ken, Randy
```

*Maps*

```scala
val map = Map("Bob" -> 20, "Rob" -> 30, "Billy" -> 40) //Immutable Map Initizlization
    println("Ages: " + map.mkString(", "))
    //=> Ages: Bob -> 20, Rob -> 30, Billy -> 40

val bobAge: Int = map("Bob") //Grabs values using keys
    println("Bob's Age: " + bobAge)
    //=> Bob's Age: 20
```

*While Loops(Conditionals)*

```scala
var z = 10
while(z <= 10 && z > 0 ) { //While Loop with condition
    z -= 1
    println(z)
}
```

*For Loops(Conditionals)*

```scala
for(i <- 0 to 10) //Basic For Loop
   println(i)

val mapArr = Map("Bob" -> 20, "Rob" -> 30, "Billy" -> 40)
for(forMap <- mapArr) { //For loop with iterating through a map
    println(forMap)
}
```

## About the tools

> _To Run Scala_.
  * To Compile and Execute a Scala file, you need to hava the Java RunTime Environment and also Scala installed.
  * For Java, you can install it by installing the Java Development Kit (JDK), and for Scala you can get the latest vesrion on the Scala website.  
     * To install the latest version of Java, in your terminal you can type `sudo apt install openjdk-11-jdk`
     * To intall the latest version of Scala, you can either:
        * Visit the scala website for the download (link is https://www.scala-lang.org/download/) and download the deb file
        * Or can use the link and wget command `wget https://www.scala-lang.org/download/` and then install using `sudo dpkg -i scala-X.XX.X.deb`
  
  
   * Once everything is Installed to Run the Scala File.
      * Type `scalac nameOfFile.scala` in the terminal in the correct Directory
        * This will compile the file
      * Then Type `scala nameOfFile` in the terminal
        * This will execute the file
      * By doing this it Should be able to run the File and see Results
  >
  
> _Another Option for Running Scala is with SBT_.
   * Another option is to install the Scala Build Tool (SBT) which makes a complete scala project 
      * To Download visit https://www.scala-lang.org/download/and find the download sbt or visit https://www.scala-sbt.org/ for a direct download
      * To Install SBT:
        * Follow the commands given to you in linux (Windows and Mac may be different)
        * After those instructions have been followed try `sudo apt-get install sbt` to install sbt
      * To create an SBT Project you would want to type `sbt new scala/hello-world.g8`
        * This is a github template which is a good way to start off a project
        * Much similar to Leinigen's Project Creation for Clojure
      * If you are using SBT, you can run the command in the terminal at the root of the project directory with:
      * First type "sbt" to run the project and then "run" to run the scala file
      
```scala
hello-world
  |-- build.sbt
  |-- project
  |   |-- build.properties
  |-- src
      |-- main
      |   |-- scala
      |           |-- Main.scala
      |-- test
          |-- scala
                  |-- Main.scala  
```
 >

## About the standard library

> _Give some examples of the functions and data structures
> offered by the standard library_.

*Mutable Maps*

```scala
import scala.collection.mutable.Map

val age = Map("Bob" -> 20, "Rob" -> 30, "Billy" -> 40)
  age += ("Hob" -> 999)
  age.remove("Bob")
  age("Billy") = 90

  println("Ages: " + age.mkString(", "))
  // => Ages: Hob -> 999, Billy -> 90, Rob -> 30

```

*Mutable ArrayBuffers* 
```scala
import scala.collection.mutable.ArrayBuffer

val array = ArrayBuffer("Billy", "Joe", "Thanos")
  array += "Jeremy"

  println(array.mkString(", "))
  // => Billy, Joe, Thanos, Jeremy
```

## About open source library

> _Describe at least one contribution by the open source
community written in the language._
  * Kantan CSV (would visit https://github.com/nrinaudo/kantan.csv for more information)
      * Is a CSV Handling Library in Scala
      * helps by treating the csv data as a simple iterator
      * Was created to help people using this data exchange format due to it being unpopular as of the moment
      * Must use sbt buile file when using this library
      * Current version is "0.5.0", which can be added to the sbt build file
      * Also comes with a Default Parser
>

 ```scala
 //What to include whenusing this library
import java.io.File
import kantan.csv._         // All kantan.csv types.
import kantan.csv.ops._     // Enriches types with useful methods.
import kantan.csv.generic._ // Automatic derivation of codecs.
```

# Analysis of the language

> _Organize your report according to the project description
document_.

> 1) The style of programming supported by the language: functional vs procedural
programming

> The support for Scala is much similar to Clojure asit is right now, but they differ in the sense that Scala also is Object-Oriented since it is sharing many functionalities from that of Java. Manty would say Clojure on one of the best hybrid languages since you can cross between Object-Oriented and Functional Programming to solve problems.


