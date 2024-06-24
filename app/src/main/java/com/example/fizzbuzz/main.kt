package com.example.fizzbuzz

fun determineFizzBuzz(num: Int): String {
    val msgsToPrint = mutableListOf<String>()

    if (num % 3 == 0) {
        msgsToPrint.add("Fizz")
    }
    if (num % 5 == 0) {
        msgsToPrint.add("Buzz")
    }
    if (num % 7 == 0) {
        msgsToPrint.add("Bang")
    }
    if (num % 11 == 0) {
        msgsToPrint.clear()
        msgsToPrint.add("Bong")
    }
    if (num % 13 == 0) {
        var indexOfFirstB = msgsToPrint.indexOfFirst { it.startsWith("B") }
        if (indexOfFirstB == -1) {
            indexOfFirstB = 0
        }
        msgsToPrint.add(indexOfFirstB, "Fezz")
    }
    if (num % 17 == 0) {
        msgsToPrint.reverse()
    }

    if (msgsToPrint.isEmpty()) {
        msgsToPrint.add(num.toString())
    }

    return msgsToPrint.joinToString("")
}

fun fizzBuzz(max: Int) {
    for (num in 1..max) {
        val msgToPrint = determineFizzBuzz(num)
        println(msgToPrint)
    }
}

fun main() {
    fizzBuzz(255)
}