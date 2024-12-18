package com.ctseducare.kotlin.k05_metodosestaticos

class IMC {

  companion object {
    fun calcularIndice(peso: Double, altura: Double): Double {
      return peso / (altura * altura)
    }

    fun retornarClassificacao(imc: Double): String {
      return if (imc <= 18.5)
        "Magro"
      else if (imc <= 24.0)
        "Normal"
      else if (imc <= 29.9)
        "Pré-obeso"
      else
        "Obeso"
    }
  }

}

fun main() {
  val peso = 78.0
  val altura = 1.67

  val imc = IMC.calcularIndice(peso, altura)
  val classificacao = IMC.retornarClassificacao(imc)

  println("IMC: %.2f".format(imc))
  println("Classificacao: $classificacao")
}
