package com.trilhakotlin.collections

fun main() {
    val joao = Funcionario("João Pedro", 9500.0, "PJ")
    val miguel = Funcionario("Miguel", 2800.0, "CLT")
    val marta = Funcionario("Marta Silva", 3500.0,"CLT")
    val fernando = Funcionario("Fernando", 1500.0,"PJ")
    val marcos = Funcionario("Marcos", 2000.0,"PJ")
    val maria = Funcionario("Maria", 3550.0,"PJ")

    println("-------------List-----------------")
    val funcionarios = mutableListOf(joao, miguel)
    funcionarios.forEach { println(it) }

    println("Contratação de Marta")
    println("--------------------------")
    funcionarios.add(marta)

    funcionarios.forEach { println(it) }

    println("Demissão de João Pedro")
    println("------------------------------")
    funcionarios.remove(joao)

    funcionarios.forEach { println(it) }

    println("-------------Set-----------------")
    val funcionariosSet = mutableListOf(joao)
    funcionariosSet.forEach { println(it) }

    println("Contratação de Marta, Miguel, Marcos")
    println("--------------------------")
    funcionariosSet.add(marta)
    funcionariosSet.add(miguel)
    funcionariosSet.add(marcos)
    funcionariosSet.add(fernando)
    funcionariosSet.add(maria)

    funcionariosSet.forEach { println(it) }

    println("Demissão de João")
    println("------------------------------")
    funcionariosSet.remove(joao)

    funcionariosSet.forEach { println(it) }
}