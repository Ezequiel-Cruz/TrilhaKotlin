package br.com.digioneback.testes

import br.com.digioneback.Funcionario
import br.com.digioneback.Pessoa
import java.math.BigDecimal

fun main() {
    var pessoa = Pessoa("Arthur", "111.111.111-11")

    println(pessoa.nome)
    println(pessoa.cpf)

    var arthur = Funcionario(pessoa.nome, pessoa.cpf, BigDecimal.valueOf(12536.36))

    println(arthur.nome)
    println(arthur.cpf)
    println(arthur.salario)

}