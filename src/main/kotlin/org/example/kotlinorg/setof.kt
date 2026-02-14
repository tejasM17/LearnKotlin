package org.example.kotlinorg

fun main() {
    val SUPPORTED = setOf("http", "https","ftp")
    val Requested = "smtp"
    val isSupported = Requested.uppercase() in SUPPORTED

    println("Supprot for $Requested : $isSupported")
}