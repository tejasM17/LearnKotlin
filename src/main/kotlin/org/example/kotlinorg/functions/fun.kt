package org.example.kotlinorg.functions
import kotlin.math.PI
import kotlin.math.sqrt

fun hello() {
    println("hello bro")
}

// Write your code here
fun circleArea(r: Int): Double {
    return PI * sqrt(r.toDouble())

}

// toSeconds
fun toSeconds(h: Int = 0, m: Int = 0, s: Int = 0): Int {
    return ((h*60+m)*60)+s
}

// Pass to another function

fun passtoAnotherfun() {
    val numbers = listOf(1, -2, 3, -4, 5, -6)

    val positives = numbers.filter ({ x -> x > 0 })

    val negatives = numbers.filter({ x: Int -> x < 0 })

    println(positives)

    println(negatives)
}

fun mapped() {
    val num = listOf(1,2,-4,8,7)
    val doubled = num.map { x -> x*2 }
    val tripeld = num.map { x -> x*3 }

    println(doubled)
    println(tripeld)
}

val upercaseStr: (String) -> String = {s -> s.uppercase()}



fun main() {
    println(hello())
    println(circleArea(2))
    println(toSeconds(0,1,25))

    // Lambda functions

    val uppercaseStr = {text: String -> text.uppercase()}
    println(uppercaseStr("My name is tejas m"))

    passtoAnotherfun()
    mapped()

    println(upercaseStr("hello world"))
    println(listOf(1, 4, 3).fold(1, { x, item -> x * item })) // 6

}
