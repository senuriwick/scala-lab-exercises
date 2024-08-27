import scala.io.StdIn

object main extends App {
    print("Enter an integer: ")
    val i = StdIn.readInt()
    print("Sum = " + sum(i) )
}

def sum(n:Int) : Int = n match {
    case n if (n == 0) => return 0
    case _ => return (n + sum(n-1))
}
