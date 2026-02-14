package org.example.practice

fun repeateN(a: Int, action: ()-> Unit) {
    for (i in 1..a){
        action()
    }
}

fun main() {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5
    val urls = actions.map { actions -> "$prefix/$id/$actions"}
        println(urls)

    repeateN(5) {
        println("hello")
    }

}