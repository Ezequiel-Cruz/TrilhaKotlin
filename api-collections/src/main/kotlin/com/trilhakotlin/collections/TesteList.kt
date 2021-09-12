package com.trilhakotlin.collections

fun main() {

    val joao = Funcionario("João Pedro", 9500.0, "PJ")
    val miguel = Funcionario("Miguel", 2800.0, "CLT")
    val marta = Funcionario("Marta Silva", 3500.0,"CLT")
    val fernando = Funcionario("Fernando", 1500.0,"PJ")
    val marcos = Funcionario("Marcos", 2000.0,"PJ")
    val maria = Funcionario("Maria", 3550.0,"PJ")

    val funcionarios = listOf(joao, miguel, marta, fernando, marcos, maria)

    funcionarios.forEach {
        println(it)
    }

    println("------------------")
    println(funcionarios.find { it.nome == "Marta Silva" })

    println("------------------")
    funcionarios
        .sortedBy { it.salario }
        .forEach{ println(it) }

    println("------------------")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{ println(it) }

}
