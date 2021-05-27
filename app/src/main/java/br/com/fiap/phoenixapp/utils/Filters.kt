package br.com.fiap.phoenixapp.utils

import android.content.Context
import android.widget.ArrayAdapter

fun createAdapters(context: Context): MutableMap<String, ArrayAdapter<String>> {
    val prefeituras: List<String> = listOf("Guarulhos", "Campinas")
    val relatorios: List<String> = listOf("Receita", "Despesas")

    val prefeiturasAdapter = ArrayAdapter(context, br.com.fiap.phoenixapp.R.layout.support_simple_spinner_dropdown_item, prefeituras)
    val relatoriosAdapter = ArrayAdapter(context, android.R.layout.simple_spinner_item, relatorios)

    prefeiturasAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
    relatoriosAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

    return mutableMapOf<String, ArrayAdapter<String>>(
        "prefeituras" to prefeiturasAdapter,
        "relatorios" to relatoriosAdapter
    )
}

