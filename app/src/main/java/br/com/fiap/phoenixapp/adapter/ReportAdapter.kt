package br.com.fiap.phoenixapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.phoenixapp.R
import br.com.fiap.phoenixapp.models.Report

class ReportAdapter(val context: Context, val data: List<Report>):
        RecyclerView.Adapter<ReportAdapter.ReportViewHolder>() {

    class ReportViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val tvReport: TextView = view.findViewById(R.id.tvReport)
        val tvDate: TextView = view.findViewById(R.id.tvDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReportViewHolder {
        val adapterHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_report, parent, false)
        return ReportAdapter.ReportViewHolder(adapterHolder)
    }

    override fun onBindViewHolder(holder: ReportViewHolder, position: Int) {
        val item = data[position]
        holder.tvReport.text = context.resources.getString(item.typeReportId)
        holder.tvDate.text = context.resources.getString(item.dtNextSchedulingId)
    }

    override fun getItemCount(): Int = data.size

}