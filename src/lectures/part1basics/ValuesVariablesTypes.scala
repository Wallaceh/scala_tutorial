package lectures.part1basics

object ValuesVariablesTypes extends App {

  // Values
  val foo: Int = 956
  println(foo)

  //  vals are immutable
  //  type definition is optional

  val bar: String = "Blah blah"
  val bool: Boolean = true
  val singleQuotesHere: Char = 'a'
  val tiny: Short = 4613 // 4 bits
  val tank: Long = 456123789L // 8 bits
  val boat: Float = 2.0f // needs the f or its a double
  val dub: Double = 3.14

  // Variables
  // mutable

  var foo2: Int = 4

  foo2 = 5
  // side effects in the next chapter

}
