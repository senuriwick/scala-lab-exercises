import scala.io.StdIn

object main extends App {
    print("Enter deposit amount : ")
    val deposit = StdIn.readDouble()
    val interestAmount = calculateInterest(deposit)
    println(s"The interest earned on Rs. $deposit deposit is Rs. $interestAmount")
}

val calculateInterest: Double => Double = (depositAmount: Double) => {
  if (depositAmount <= 20000) {
    depositAmount * 0.02
  } else if (depositAmount <= 200000) {
    depositAmount * 0.04
  } else if (depositAmount <= 2000000) {
    depositAmount * 0.035
  } else {
    depositAmount * 0.065
  }
}
