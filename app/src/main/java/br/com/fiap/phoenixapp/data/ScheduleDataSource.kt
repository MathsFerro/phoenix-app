package br.com.fiap.phoenixapp.data

import br.com.fiap.phoenixapp.R
import br.com.fiap.phoenixapp.models.Schedule

class ScheduleDataSource {
    fun loadFakeScheduling(): List<Schedule> {
        return listOf(
            Schedule(R.string.receita, R.string.amanha_19),
            Schedule(R.string.despesa, R.string.amanha_21)
        )
    }
}