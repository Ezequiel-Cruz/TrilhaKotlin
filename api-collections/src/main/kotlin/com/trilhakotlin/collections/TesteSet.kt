package com.trilhakotlin.collections

fun main() {
    val joao = Funcionario("João Pedro", 9500.0, "PJ")
    val miguel = Funcionario("Miguel", 2800.0, "CLT")
    val marta = Funcionario("Marta Silva", 3500.0,"CLT")
    val fernando = Funcionario("Fernando", 1500.0,"PJ")
    val marcos = Funcionario("Marcos", 2000.0,"PJ")
    val maria = Funcionario("Maria", 3550.0,"PJ")

    val funcionarios1 = setOf(joao, miguel, marta)
    val funcionarios2 = setOf(fernando, marcos, maria)

    val resultadoUnion = funcionarios1.union(funcionarios2)
    resultadoUnion.forEach { println(it)}

    println("------------------")
    val funcionarios3 = setOf(joao, miguel, marta, maria)
    val resultSubstract = funcionarios3.subtract(funcionarios2)
    resultSubstract.forEach { println(it)}

    println("------------------")
    val resultIntersect = funcionarios3.intersect(funcionarios2)
    resultIntersect.forEach { println(it)}

}