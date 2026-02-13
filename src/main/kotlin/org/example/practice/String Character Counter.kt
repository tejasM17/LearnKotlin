package org.example.practice

fun main() {
    val str = "am tejas m"

    for (c in str.indices) {
        println(" index = $c char = ${ str[c] }")
    }
}