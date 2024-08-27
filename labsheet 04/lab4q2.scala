import scala.io.StdIn

object Main extends App {
    print("Enter an integer : ")
    val num = StdIn.readInt()
    print(output(num))
}

def output(x : Int) = x match {
    case x if x <= 0 => "Negative/Zero is input"
    case x if x % 2 != 0 => "Odd number is given"
    case x if x % 2 == 0 => "Even number is given"
    case _ => "Invalid input"
}