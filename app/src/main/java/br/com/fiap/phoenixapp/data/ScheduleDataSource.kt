package br.com.fiap.phoenixapp.data

import android.content.Context
import br.com.fiap.phoenixapp.R
import br.com.fiap.phoenixapp.models.Schedule
import br.com.fiap.phoenixapp.utils.SelectedFilters

class ScheduleDataSource {
    fun loadFakeScheduling(context: Context, filters: SelectedFilters? = null): List<Schedule> {
        val listSchedule = listOf(
            Schedule(R.string.receita, R.string.amanha_19),
            Schedule(R.string.despesas, R.string.amanha_21)
        )

        return if(filters!=null) {
            listSchedule.filter{ context.resources.getString(it.typeReportId)==filters.relatorios }
        } else { listSchedule }
    }
}