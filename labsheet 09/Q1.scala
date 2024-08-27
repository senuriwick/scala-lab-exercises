class Rational(n: Int, d: Int) {
  require(d != 0, "Denominator must be nonzero")

  private val gcdVal = gcd(n.abs, d.abs)
  val numer: Int = n / gcdVal
  val denom: Int = d / gcdVal

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational = new Rational(-numer, denom)

  override def toString: String = s"$numer / $denom"
}

object Rational {
  def apply(n: Int, d: Int): Rational = new Rational(n, d)
}

// Example usage
object main extends App {
    val x = Rational(3, 4)
    val negX = x.neg
    println(negX)
}
