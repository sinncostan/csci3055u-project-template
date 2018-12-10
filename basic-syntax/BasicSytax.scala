//Basic Syntax

//Values

//Basics of Scala in a Real World App

object BasicSyntax extends App { //Initializing the class
  println("Hello, World!" + "\n") //The printline statment

  val x = 1 //val is a symbol which can only be bound once
  //x = 2 //if this was use it will result with an error since val cannot have updated bidings
  println("x = " + x)

  var y = 1 //var is a symbol that can have update bindings
  y = 2
  println("y = " + y)

  println("The Result of x + y = " + (x + y) + "\n") //println with combining string and int values


  val simpleArray = Array(1,2,3,4) //Initializing an Array
  println("Last element in this array is: " + simpleArray(3))
  //=> Last element in this array is: 4


  val simpleList = List(1,2,3,4) //Initializing a List
  println("Third element in this list is: " + simpleList(2) + "\n")
  //=> Third element in this list is: 3


  var array = Array("Ken", "Randy") //Arrays Using Strings
  println("Original_Array: " + array.mkString(", "))
  //=> Original_Array: Ken, Randy

  var array2 = array :+ "Jarek" //Adding the new Element for the Array
  println("Updated_Array: " + array2.mkString(", ") + "\n")
  //=> Updated_Array: Ken, Randy, Jarek

  var list = List("Ken", "Randy") //Initialized Immutable List
  println("Original_List: " + list.mkString(", "))
  //=> Original_List: Ken, Randy

  var list2 = "Jarek" :: list //Appends the list with the new Element
  println("Updated_List: " + list2.mkString(", "))
  //=> Updated_List: Jarek, Ken, Randy


  val map = Map("Bob" -> 20, "Rob" -> 30, "Billy" -> 40) //Map Initizlization
  println("Ages: " + map.mkString(", "))
  //=> Ages: Bob -> 20, Rob -> 30, Billy -> 40

  val bobAge: Int = map("Bob")
  println("Bob's Age: " + bobAge)
  //=> Bob's Age: 20


  var z = 10
  while(z <= 10 && z > 0 ) { //While Loop with condition
    z -= 1
    println(z)
  }

  for(i <- 0 to 10) //Basic For Loop
    println(i)

  val mapArr = Map("Bob" -> 20, "Rob" -> 30, "Billy" -> 40)
  for(forMap <- mapArr) { //For loop with iterating through a map
    println(forMap)
  }

}