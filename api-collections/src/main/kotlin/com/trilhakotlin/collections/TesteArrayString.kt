package com.trilhakotlin.collections

fun main() {
    val nomes = arrayOf("Arthur", "Lima", "Augusto","Maria")

    nomes.sort()
    nomes.forEach {
        println(it)
    }

    val nomes2 = Array(3) {""}

    nomes2[0] = "Zorro"
    nomes2[1] = "Batima"
    nomes2[2] = "SpiderMan"

    nomes2.forEach {
        println(it)
    }
}

