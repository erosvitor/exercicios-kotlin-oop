package com.ctseducare.kotlin.k02_construtores_sobrecarga

import java.time.LocalDate
import java.time.format.DateTimeFormatter

class Calendario(dataStr: String) {

  private var dia = 0
  private var mes = 0
  private var ano = 0
  private var diaSemana = 0

  init {
    val data = LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"))
    this.dia = data.dayOfMonth
    this.mes = data.month.value
    this.ano = data.year
    this.diaSemana = data.dayOfWeek.value
  }

  fun mesPorExtenso(): String {
    val meses = arrayOf("janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro")
    return meses[this.mes-1]
  }

  private fun diaSemanaPorExtenso(): String {
    var nomeDiaSemana = ""
    when (this.diaSemana) {
        1 -> nomeDiaSemana = "Segunda-feira"
        2 -> nomeDiaSemana = "Terça-feira"
        3 -> nomeDiaSemana = "Quarta-feira"
        4 -> nomeDiaSemana = "Quinta-feira"
        5 -> nomeDiaSemana = "Sexta-feira"
        6 -> nomeDiaSemana = "Sabado"
        7 -> nomeDiaSemana = "Domingo"
    }
    return nomeDiaSemana
  }

  fun dataPorExtenso(): String {
    val nomeDiaSemana = this.diaSemanaPorExtenso()
    val nomeMes = this.mesPorExtenso()
    return String.format("%s, %d de %s de %d", nomeDiaSemana, this.dia, nomeMes, this.ano)
  }

}

fun main() {

  val cal = Calendario("17/12/2024")
  println(cal.mesPorExtenso())
  println(cal.dataPorExtenso())

}

