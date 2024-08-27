import scala.io.StdIn;

object main extends App {
    println("Enter a list of temperatures in Celsius separated by spaces: ")
    val input = StdIn.readLine()
    val temperatures = input.split(" ").map(_.toDouble).toList

    val avgFahrenheit = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $avgFahrenheit")
}

def calculateAverage(temperatures: List[Double]) : Double = {
    val fahreneitTemperatures = temperatures.map(celsius => (celsius * 9/5) + 32)
    val avgFahrenheit = fahreneitTemperatures.reduce(_ + _) / fahreneitTemperatures.length
    avgFahrenheit
}







