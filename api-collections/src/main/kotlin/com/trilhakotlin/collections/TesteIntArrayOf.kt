package com.trilhakotlin.collections

fun main() {
    val values = intArrayOf(2,4,1,6,8,19,3)

    values.sort()
    values.forEach {
        println(it)
    }

}