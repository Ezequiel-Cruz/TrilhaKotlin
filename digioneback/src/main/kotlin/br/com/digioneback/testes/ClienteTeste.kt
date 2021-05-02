package br.com.digioneback.testes

import br.com.digioneback.Cliente
import br.com.digioneback.TipoCliente

fun main() {
    val cliente = Cliente("Marcos da Silva", "111.111.111-11", TipoCliente.PF, "senha123")

    println(cliente)

    AutenticacaoTeste().autentica(cliente)
}