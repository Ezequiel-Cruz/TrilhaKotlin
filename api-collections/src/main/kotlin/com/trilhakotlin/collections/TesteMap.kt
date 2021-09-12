package com.trilhakotlin.collections

fun main() {
    val pair: Pair<String, Double> = Pair("João", 1000.0)
    val map1= mapOf(pair)

    map1.forEach { t, u -> println("Chave: $t =  Valor: $u") }
    println("---------------------------")

    val map2 = mapOf(
        "Pedro" to 2000.50,
        "Maria" to 2631.80
    )

    map2.forEach { t, u -> println("Chave: $t = Valor: $u") }
}