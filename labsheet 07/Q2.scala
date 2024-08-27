import scala.math.pow

object main extends App {
    val list = List(1, 2, 3, 4, 5)
    print(calculateSquare(list))
}

def calculateSquare(numbers : List[Int]) : List[Int] = {
    return numbers.map(num => pow(num, 2).toInt)
}