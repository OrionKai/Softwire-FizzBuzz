package com.example.fizzbuzz

fun fizzBuzz(num: Int): String {
    val result = mutableListOf<String>()

    if (num % 3 == 0) {
        result.add("Fizz")
    }
    if (num % 5 == 0) {
        result.add("Buzz")
    }
    if (num % 7 == 0) {
        result.add("Bang")
    }
    if (num % 11 == 0) {
        result.clear()
        result.add("Bong")
    }
    if (num % 13 == 0) {
        var indexOfFirstB = result.indexOfFirst { it.startsWith("B") }
        if (indexOfFirstB == -1) {
            indexOfFirstB = 0
        }
        result.add(indexOfFirstB, "Fezz")
    }
    if (num % 17 == 0) {
        result.reverse()
    }

    if (result.isEmpty()) {
        result.add(num.toString())
    }

    return result.joinToString("")
}

fun main() {
    for (num in 1..255) {
        println(fizzBuzz(num))
    }
}