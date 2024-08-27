import scala.io.StdIn

object main extends App {
    print("Enter an integer: ")
    val i = StdIn.readInt()
    
    if(isEven(i)) {
        print("Your number is even")
    }
    else {
        print("Your number is odd")
    }
}

def isEven(n : Int) : Boolean = n match {
    case n if(n == 0) => true
    case n if(n == 1) => false
    case _ => isEven(n - 2)
}
