package br.com.digioneback

data class Banco(
    val nome: String,
    val numero: Int
) {
    fun info() ="$nome e $numero"
}
