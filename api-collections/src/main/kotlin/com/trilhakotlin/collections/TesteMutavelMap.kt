package com.trilhakotlin.collections

fun main() {
    val joao = Funcionario("João Pedro", 9500.0, "PJ")
    val miguel = Funcionario("Miguel", 2800.0, "CLT")
    val marta = Funcionario("Marta Silva", 3500.0,"CLT")
    val fernando = Funcionario("Fernando", 1500.0,"PJ")
    val marcos = Funcionario("Marcos", 2000.0,"PJ")
    val maria = Funcionario("Maria", 3550.0,"PJ")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(maria.nome, maria)
    repositorio.create(fernando.nome, fernando)
    repositorio.create(marta.nome, marta)
    repositorio.create(miguel.nome, miguel)
    repositorio.create(marcos.nome, marcos)

    println(repositorio.findById(fernando.nome))

    println("------------Todos-------------------------")
    repositorio.findAll().forEach { println(it) }

    println("---------Remove Maria------------------")
    repositorio.remove(maria.nome)

    println("------------Todos-------------------------")
    repositorio.findAll().forEach { println(it) }
}