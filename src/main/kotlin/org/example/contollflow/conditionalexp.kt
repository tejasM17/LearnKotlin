package org.example.contollflow

fun main() {

    val d: Int

    val check = false
    if (check) {
        d = 1
    } else {
        d = 2
    }
    println(d)

    val a = 4
    val b = 2
    println(if (a < b) true else false)

    val res = when (a * b + 2) {
        10 -> "num is 10"
        8 -> "yes num is 8"
        else -> "none"
    }
    println(res)

    val trafficLightState = "Yellow" // This can be "Green", "Yellow", or "Red"

    val trafficAction = when {
        trafficLightState == "Green" -> "Go"
        trafficLightState == "Yellow" -> "Slow down"
        trafficLightState == "Red" -> "Stop"
        else -> "Malfunction"
    }

    println(trafficAction)






}