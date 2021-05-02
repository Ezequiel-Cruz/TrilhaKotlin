package br.com.digioneback.testes

import br.com.digioneback.Funcionario
import br.com.digioneback.Gerente

fun main() {
    var gerente = Gerente("Maria da Silva", "111.111.111-11ss", 5000.0)
    ImprimeRelatorioFuncionario.imprime(gerente)
}
