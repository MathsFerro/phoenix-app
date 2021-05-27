package br.com.fiap.phoenixapp.data

import br.com.fiap.phoenixapp.R
import br.com.fiap.phoenixapp.models.Help

class HelpDataSource {
    fun loadFakeHelp(): List<Help> {
        return listOf(
            Help(R.string.como_usar_o_aplicativo),
            Help(R.string.como_solicitar_uma_melhoria),
            Help(R.string.como_ter_acesso_ao_aplicativo_web),
            Help(R.string.como_solicitar_uma_nova_logica_de_comparacao),
        )
    }
}