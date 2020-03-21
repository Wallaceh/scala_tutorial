package lectures.part1basics

object Expressions extends App {

  val x = 1 + 2
  println(x)

  println(2 + 3 * 4)

  // equals is ==. Boolean return. != is not equal. bang flips the boolean. very standard stuff

  var aVariable = 2

  // -=, *=, blah are all side effects. Only works on var. not val

  // Instructions (DO) vs Expressions (evaluate to a Value)

  // If expression

  val aCondition = true

  val aConditionValue = if(aCondition) 5 else 3 // If expression

  // loops arent used much in scala (like while loops, blah). They are a construct of imperative programming

  // everything in scala is an expression

  val aWeirdValue = (aVariable = 3) // returns (). Unit type returns that

  // code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "Hello" else "goodbye"
  }

  // variables defined in a block arent visible outside. Also expected


}
