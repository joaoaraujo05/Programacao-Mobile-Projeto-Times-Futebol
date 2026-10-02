package com.unaerp.projeto_futebol.model

import androidx.annotation.DrawableRes
import java.util.Locale

data class Time(
    val id: Int,
    val nome: String,
    val cidade: String,
    val anoFundacao: Int,
    val estadio: String,
    val escudo: Int?
)
