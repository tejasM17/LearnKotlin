package org.example.kotlinorg.functions

fun greet(a: Double,b: Int) {
    println(a + b)
}

fun main() {
    greet(2.245, 6)
    val uppercase = {println(greet(2.2, 4))}
    uppercase()
}