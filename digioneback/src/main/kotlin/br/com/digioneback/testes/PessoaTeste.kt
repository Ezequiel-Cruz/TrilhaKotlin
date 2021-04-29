package br.com.digioneback.testes

import br.com.digioneback.Pessoa

fun main() {
    var info = Pessoa("Arthur", "111.111.111-11")

    println(info.nome)
    println(info.cpf)
}