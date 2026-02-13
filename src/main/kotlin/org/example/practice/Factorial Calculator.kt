package org.example.practice

fun main() {
    var res = 1

    for (n in 1..5){
        res *= n
        println(res)
    }
    println(res)
}