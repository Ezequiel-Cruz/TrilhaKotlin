package br.com.digioneback

class Pessoa {
    var nome: String = "Arthur"
    var cpf: String = "111.111.111-11"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    var pessoas = Pessoa()

    println(pessoas.pessoaInfo())
}