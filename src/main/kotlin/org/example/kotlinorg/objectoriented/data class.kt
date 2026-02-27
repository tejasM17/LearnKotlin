package org.example.kotlinorg.objectoriented

import sun.jvm.hotspot.debugger.Address
import javax.naming.Name

// printing as a string

data class User(val name: String, var id : Int) {

}

data class Employee(var name: String, var salary: Int){

}

data class Person(val name: Name, val address: Address, val ownsAPet: Boolean = true)
// Write your code here
    data class Name(val first: String, val last: String)
    data class Address(val street: String, val city: City)
    data class City(val name: String, val countryCode: String)


fun main() {
    val user = User("Ranga", 19)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Alex", 1)
    println("thirdUser == secondUser: ${thirdUser == secondUser}")
    println(user.name)

    val emp = Employee("Nubude", 20)
    println(emp)
    emp.salary += 20
    println(emp)
}