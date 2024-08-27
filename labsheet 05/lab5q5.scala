import scala.io.StdIn

object main extends App {
    print("Enter an integer: ")
    val i = StdIn.readInt()
    print("Sum of all even numbers less than " + i + " = " + sumofEven(i) )
}

def sumofEven(n : Int, i : Int = 2) : Int = i match {
        case x if(n <= x) => return 0
        case x => return x + sumofEven(n, x+2)
}