package org.example.kotlinorg

import org.example.lists
import kotlin.random.Random

fun main() {
    val firstResult = Random.nextInt(6)
    val secondResult = Random.nextInt(2)

    val check = if (firstResult == secondResult) "You win :)" else "You lose :("
    println(check)


    val button = "B"

    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "there is no such Button"
        }
    )


    ////  LOOPS


    for (i in 1..5) {
        println(i)
    }
    val lst = listOf("Chocolate", "plain cake", "venila cake")

    for (cake in lst) {
        println("Yummy it's a $cake")
    }


    // While LOOP

    var cakeEaten = 1
    var backed = 1

    while (cakeEaten <= 3) {
        println(" $cakeEaten cake eaten")
        cakeEaten++
    }
    do {
        println("$backed cake backed")
        backed++
    } while (backed < cakeEaten)
}