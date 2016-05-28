import scala.math._

def break(num: Int, num2: Int): Int = {
  return num + num2
}
println(break(9,1))

val Tau = Pi*2
println(s"Happy $Tau Day")

var randomNumber = 2 + 2
println(s"random number: $randomNumber")

printf("Now you have %.16f problems.", Math.nextAfter(2.0, 3))

var range = 1 to 10
println(range)

var alphabet = 'a' to 'z'
println(alphabet)

var skipSome = 1 until 50 by 4
println(skipSome.toList)

val neg = -10
val pos = neg.abs
println(s"Here's the negative: $neg")
println(s"Here's the positive: $pos")

val max = pos.max(100)
val min = pos.min(-100)
println(s"Here's the negative: $max")
println(s"Here's the positive: $min")

var reverseThis = "Alex".reverse
println(reverseThis)

val toInt = "90234857".toInt
println(toInt)

val timesTwo = range.map(_ * 2)
println(timesTwo)

val stringNums = ("1", "2", "3")
println(stringNums)
