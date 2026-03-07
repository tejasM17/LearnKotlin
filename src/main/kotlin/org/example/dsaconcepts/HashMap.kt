package org.example.dsaconcepts

fun basicHashTableExample() {
    val map = HashMap<String, Int>()

    map["apple"] = 3
    map["banana"] = 5
    map["orange"] = 2

    println("Apple count: ${map["apple"]}")
    println("Banana count: ${map["banana"]}")
}

fun main() {
    basicHashTableExample()
}