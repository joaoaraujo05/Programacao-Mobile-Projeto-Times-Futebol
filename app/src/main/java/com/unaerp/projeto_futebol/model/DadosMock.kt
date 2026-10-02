package com.unaerp.projeto_futebol.model

import com.unaerp.projeto_futebol.R

val listaTimes = listOf(
    Time(1,"Flamengo","Rio de Janeiro",1895,"Maracanã", R.drawable.escudo_flamengo),
    Time(2,"São Paulo","São Paulo",1930,"Morumbi", R.drawable.escudo_sp),
    Time(3, "Palmeiras", "São Paulo", 1914, "Allianz Parque", R.drawable.escudo_palmeiras),
    Time(4, "Corinthians", "São Paulo", 1910, "Neo Química Arena", R.drawable.escudo_corinthians),
    Time(5, "Grêmio", "Porto Alegre", 1903, "Arena do Grêmio", R.drawable.ic_escudo_padrao),
    Time(6, "Cruzeiro", "Belo Horizonte", 1921, "Mineirão", R.drawable.escudo_cruzeiro)
)

fun buscarTimePorId(id: Int): Time? {
    return listaTimes.find { it.id == id }
}