package org.example

// orderd and allow duplicates
fun lists() {
    val lists = listOf("string", 123, false)
    println(lists)
    println("size = ${lists.size}")
    println(" contains 123? :  ${lists.contains(123)}")
    println("Index of 'string' : ${lists.indexOf("string")}")
    println(lists[2])


    val mutableList = mutableListOf("abcd", 23, true, listOf(1, 2, 3, 4))
    println("before adding : $mutableList")
    mutableList.add("BMW")
    println("After adding : $mutableList")

}

// unorders and unique
fun sets() {
    val readOnlyfruits = setOf("apple", "apple", "orange", "banana")
    println(readOnlyfruits)

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    fruit.add("dragonfruit")
    println(fruit)

    fruit.remove("dragonfruit")
    println(fruit)
}

fun map() {
    val phonebook = mapOf(
        "Alice" to "555-1234",
        "Bob" to "555-5678",
        "Charlie" to "555-9012"
    )

    for ((name, value) in phonebook) {
        println("name : $name, phone : $value")
    }

    val readOnlymap = mapOf("apple" to 100, "banana" to 120, "cherry" to "555")
    println("readOnly map : $readOnlymap")
    val map: MutableMap<String, Int> = mutableMapOf("apple" to 100, "banana" to 120, "charlie" to 50)
    println("before : $map")
    map["noob"] = 600
    println("After : $map")

    map.remove("apple")
    println("before : $map")
    println("number of elements = ${map.count()}")


    println(map.containsKey("apple"))
    println("${map.keys} = ${map.values}")

    println("banana" in map.keys)
    println(200 in map.values)
}


fun main() {
    lists()
    sets()
    map()
}