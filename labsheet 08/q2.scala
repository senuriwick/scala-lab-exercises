import scala.io.StdIn

object PatternMatchingExample extends App {
  print("Enter an integer : ")
  val input = StdIn.readInt()

  input match {
    case x if x < 0 =>
      println("Negative")
    case 0 =>
      println("Zero")
    case x if x % 2 == 0 =>
      println("Even number is given")
    case _ =>
      println("Odd number is given")
  }
}
