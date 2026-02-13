package org.example


fun main() {

    val a : Int =1234
    val b: String = "Log messaage "
    val c = 3.145678
    val d: Long = 10000_112_2134_34
    val e = true
    val f: Char = '\n'

    println()

    var customer: Int = 10
    println(customer)

    customer = 8
    println(customer)

    customer = customer.plus(3) //11
    println(customer)

    customer += 7
    println(customer) //18

    customer -= 2
    println(customer) // 16

    customer *= 3
    println(customer) //48

    customer /= 2
    println(customer) //24

    customer %= 4
    println(customer) //0


    val word : Char = 'a' //single
    println(word)

    val stringing : String = "Hello worls am tejas M"
    val age: Int = 19
    val info = stringing.plus("am $age yr old")

    println(stringing + 777)
    println("Forloop")
    for (c in stringing) {
        println(c.uppercase())
    }
    println(info)

    val isEnabled : Boolean = false

    println("isEnabled ? ${ !isEnabled }")


}