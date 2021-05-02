package br.com.digioneback.testes

import br.com.digioneback.Analista
import br.com.digioneback.Funcionario

fun main() {
    var analista = Analista("Arthur da Costa", "111.111.111-11ss", 2000.0)
    ImprimeRelatorioFuncionario.imprime(analista)
}
