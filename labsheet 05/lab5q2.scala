import scala.io.StdIn

object main extends App {
    print("Enter an integer: ")
    val i = StdIn.readInt()
    
    if(i < 1) print("Invalid!")
    else {
        primeSeq(i)
    }
}

def prime(p:Int, n:Int = 2) : Boolean  = {
    if(p <= 2) p == 2 
    else if (p % n == 0) false
    else if (n*n > p) true
    else prime(p, n+1)
}

def primeSeq(i: Int): Unit = {
  if (i > 2) primeSeq(i - 1)
  if (prime(i) && i != 1) println(i)
}
