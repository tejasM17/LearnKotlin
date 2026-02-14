package org.example.practice

fun main() {
    val slice = 8
    var i = 0
    while (i < slice) {
        println("There is only $i pizza alice")
        i++
    }
    println("There are $i slices of pizza. Hooray! We have a whole pizza! :D")

    var a = 0

    do {
        println("There are $a slice of pizza")
        a++
    } while (a < 8)
    println("There are $a slices of pizza. Hooray! We have a whole pizza! :D")

}