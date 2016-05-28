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
