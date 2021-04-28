package br.com.digioneback

class Pessoa {
    var nome: String = "Arthur"
    var cpf: String = "111.111.111-11"

    inner class Endenreco {
        var rua: String = "Rua das flores"
    }
}

fun main() {
    var pessoas = Pessoa()

    println(pessoas.nome)
    println(pessoas.cpf)

    println(pessoas.Endenreco().rua)
}