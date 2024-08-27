import scala.main

object main extends App {
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(_ > 1)
    print(filterPrime(list))
}

def prime(p:Int, n:Int = 2) : Boolean  = {
    if(p <= 2) p == 2 
    else if (p % n == 0) false
    else if (n*n > p) true
    else prime(p, n+1)
}

def filterPrime(numbers : List[Int]) : List[Int] = {
    numbers.filter(num => prime(num))
}
