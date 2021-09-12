package com.trilhakotlin.collections

fun main() {
    val salarios = arrayOf(
        "2000".toBigDecimal(),
        "5000".toBigDecimal(),
        "4000".toBigDecimal()
    )

    println("-----------Total de Salários---------------------")
    println(salarios.somatoria())

    println("------------Média Salárial---------------------")
    println(salarios.media())
}