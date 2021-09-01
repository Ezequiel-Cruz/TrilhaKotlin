package com.trilhakotlin.collections

fun main() {
    val values = IntArray(5)

    values [0] = 1
    values [1] = 7
    values [2] = 9
    values [3] = 4
    values [4] = 2

    for (valor in values) {
        println(valor)
    }

    println("----------------------")

    values.forEach {
        println(it)
    }

    println("----------------------")

    for (index in values.indices) {
        println(values[index])
    }

    println("----------------------")
    values.sort()
    for (valor in values) {
        println(valor)
    }

}