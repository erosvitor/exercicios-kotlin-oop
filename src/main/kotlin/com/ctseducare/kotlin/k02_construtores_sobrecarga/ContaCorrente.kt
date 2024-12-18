package com.ctseducare.kotlin.k02_construtores_sobrecarga

class ContaCorrente(private var numero: String, private var saldo: Double, private var limite: Int) {

  fun depositar(valor: Double) {
    this.saldo += valor
  }

  fun sacar(valor: Double): Boolean {
    if (this.saldo >= valor) {
      this.saldo -= valor
      return true
    } else {
      return false
    }
  }

  fun consultarSaldo(): Double {
    return this.saldo
  }

}

fun main() {

  val conta1 = ContaCorrente("0101-02", 5000.0, 1000)
  conta1.depositar(1000.0)
  conta1.sacar(570.0)

  println(conta1.consultarSaldo())

}
