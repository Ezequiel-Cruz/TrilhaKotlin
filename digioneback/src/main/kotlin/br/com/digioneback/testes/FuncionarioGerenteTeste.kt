package br.com.digioneback.testes

import br.com.digioneback.Gerente

fun main() {
    var gerente = Gerente("Maria da Silva", "111.111.111-11ss", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(gerente)

    AutenticacaoTeste().autentica(gerente)
}
