package com.ctseducare.kotlin.k05_metodosestaticos

class Juros {
  companion object {
    fun jurosSimples(capital: Double, taxa: Double, periodo: Int): Double {
      return capital * (taxa / 100) * periodo
    }

    fun jurosCompostos(capital: Double, taxa: Double, periodo: Int): Double {
      return capital * Math.pow(1 + (taxa/100), periodo.toDouble())
    }
  }
}

fun main() {
  val jurosSimples = Juros.jurosSimples(1000.0, 10.0, 1)
  println("Juros simples: $jurosSimples")

  val jurosCompostos = Juros.jurosCompostos(1000.0, 10.0, 1)
  println("Juros compostos: $jurosCompostos")
}

