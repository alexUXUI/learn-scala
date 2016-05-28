def divide(a:Int, b:Int) = {
  a % b
}

println(divide(12,4))

def sayHello(name: String) = { // method
  println(s"Hello $name")
}

sayHello("Alex")

def greeting = (person: String) => { // anon func
  println(s"Greetings $person")
}

greeting("Alex")

val tuples = ("alex", 26, "37")
println(tuples._2)

val tupledUp = ("yo", "lets", "inception", ("here", "we", "go"))
println(tupledUp._4._2)

var swappingVals = ("white", "tiger")
def swappage(word: String, word2: String) = (word, word2)
var swapped = swappage("honey", "badger")
println(swapped)

var (a,b,c) = (1,2,3)
println((s"a $a, b $b c $c"))

var sum = 0
for ( i <- 2 until 4) {
  sum += i
}
println(sum)

println((0 until 5).sum)
