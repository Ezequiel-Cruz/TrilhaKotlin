package br.com.digioneback.testes

import br.com.digioneback.TipoCliente

fun main() {
    TipoCliente.values().forEach {
        println("${it.name} - ${it.descricao}")
    }
}