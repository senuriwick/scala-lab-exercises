import scala.io.StdIn

object Main extends App {
    print("Enter deposit amount : ")
    val deposit = StdIn.readDouble()

    val actual = interestFunc(deposit)
    println("Actual interest amount = " + actual)

}

def interestFunc(d:Double):Double = d match {
    case d if d < 0 => 0
    case d if d < 20000 => d*0.02
    case d if d < 200000 => d*0.04
    case d if d < 2000000 => d*0.035
    case d if d >= 2000000 => d*01.065
}