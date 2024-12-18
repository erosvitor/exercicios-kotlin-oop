package com.ctseducare.kotlin.k01_classes

class Funcionario {

  var nome = ""
  var cargo = ""
  var valorHora = 0.0f

  fun calcularSalario(horasTrabalhadas: Int): Float {
    return this.valorHora * horasTrabalhadas
  }

}

fun main() {

  val func = Funcionario()
  func.nome = "Fulano"
  func.cargo = "Vendedor"
  func.valorHora = 14.50f

  val horasTrabalhadas = 30
  val salario = func.calcularSalario(horasTrabalhadas)

  println("O salário é: $salario")

}
