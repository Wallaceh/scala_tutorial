package lectures.part1basics

object Functions extends App {

  def aFunction(a: String, b: Int): String  = {
    a + " " + b
  }

  println(aFunction("Yo", 68))

  def aRepeatedFunction(a: String, b: Int): String = {
    if (b == 1) a
    else a + aRepeatedFunction(a, b - 1)
  }

  println(aRepeatedFunction("Loopy", 3))

}

