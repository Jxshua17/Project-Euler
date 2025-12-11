package ProjectEuler.ProblemTwo

fun main(){

    var a = 1
    println(a)

    var b = 2
    println(b)

    var c = a + b
    println(c)

    var j = b //the number that will be the sum of all the even numbers in the sequence.

    while (a < 4000000 && b < 4000000 && c < 4000000){

        a = b + c //add the previous two terms in the fibonacci sequence.
        println("a: $a") //i want the number displayed in the console basically

        if (a >= 4000000) {
            break
        }

        if (a % 2 == 0){ //checks if the new value is an even number and then adds it to j. i could use a function here. maybe?
            j += a
        }

        b = c + a
        println("b: $b")
        if (b >= 4000000) {
            break
        }
        if (b % 2 == 0){
            j += b
        }

        c = b + a
        println("c: $c")
        if (c >= 4000000) {
            break
        }
        if (c % 2 == 0){
            j += c
        }
        println("i just want to make sure this isn't getting called")
    }

    println("the sum is $j")
}