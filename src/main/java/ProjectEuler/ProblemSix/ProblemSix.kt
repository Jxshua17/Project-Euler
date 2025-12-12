package ProjectEuler.ProblemSix


fun main() {
    var j = 0
    var k = 0

    for (i in 1..100){
        j += i
    }

    for (i in 1..100){
        k += square(i)
    }

    val l = square(j) - k
    println("Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is $l")
}

fun square(x: Int): Int {
    return x * x
}