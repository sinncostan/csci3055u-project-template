// Standard Library Example
// Uses Data Structures from Maps, Arrays, and Lists

object StandardLibExamples extends App { //Initializing the class

  import scala.collection.mutable.Map

  val age = Map("Bob" -> 20, "Rob" -> 30, "Billy" -> 40)
  age += ("Hob" -> 999)
  age.remove("Bob")
  age("Billy") = 90

  println("Updated People: " + age.mkString(", "))
  // => Ages: Hob -> 999, Billy -> 90, Rob -> 30

  import scala.collection.mutable.ArrayBuffer

  val array = ArrayBuffer("Billy", "Joe", "Thanos")
  array += "Jeremy"

  println("Updated Array: " + array.mkString(", "))
  // => Billy, Joe, Thanos, Jeremy

  import scala.collection.mutable.ListBuffer

  val list = ListBuffer("Billy", "Joe", "Thanos")
  list += "Ladidadida"

  println("Updated List: " + list.mkString(", "))
  // => Billy, Joe, Thanos, Ladidadida
}