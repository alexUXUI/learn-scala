val HOCFunc = (func: Int => Int, number: Int) => func(number)
val sayNumber = (number: Int) => number

println(HOCFunc(sayNumber, 1111))
