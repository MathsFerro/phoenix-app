package br.com.fiap.phoenixapp.data

import android.content.Context
import br.com.fiap.phoenixapp.R
import br.com.fiap.phoenixapp.models.Report
import br.com.fiap.phoenixapp.utils.SelectedFilters

class ReportDataSource {
    fun loadFakeReports(context: Context, filters: SelectedFilters? = null): List<Report> {
        val listSchedule = listOf(
            Report(R.string.receita, R.string.date_20210529),
            Report(R.string.receita, R.string.date_20210329),
            Report(R.string.despesas, R.string.date_20210429)
        )

        return if(filters!=null) {
            listSchedule.filter{ context.resources.getString(it.typeReportId)==filters.relatorios }
        } else { listSchedule }
    }
}