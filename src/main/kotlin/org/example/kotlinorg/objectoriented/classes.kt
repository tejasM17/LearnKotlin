package org.example.kotlinorg.objectoriented

class contacts(val id: Int, var email: String = "example@gmail.com") {
    fun cont(){
        println("id: $id, email: $email")
    }

}

fun main() {
    val contact1 = contacts(1,"abcd@gmail.com")
    contact1.cont()
}