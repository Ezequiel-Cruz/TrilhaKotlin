package com.trilhakotlin.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 15000.0, 5236.0, 1500.50, 2400.0, 2600.0, 2250.0)

    for (salario in salarios){
        println(salario)
    }

    println("----------------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")

    val salariosMaiorQue2500 =  salarios.filter { it > 2500.0 }

    println("----------------------")
    println("Salários maiores que R$ 2500,00")
    println("----------------------")
    salariosMaiorQue2500.forEach {
        println(it)
    }

    println("----------------------")
    println("Salários entre que R$ 2500,00")
    println("----------------------")

    println(salarios.count { it in 1000.0..5000.0 })

    println("----------------------")
    println(salarios.find { it == 2250.0 })
    println("----------------------")
    println(salarios.find { it == 500.0 })

    println("----------------------")
    println(salarios.any { it == 2250.0 })
    println(salarios.any { it == 500.0 })

}