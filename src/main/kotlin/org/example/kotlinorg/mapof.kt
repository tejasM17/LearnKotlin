package org.example.kotlinorg

fun main() {
    val num2word = mutableMapOf(1 to "none", 2 to "two", 3 to "three")
    val n = 2
    println("$n is spelt as ${num2word[n]}")
}