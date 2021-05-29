package br.com.fiap.phoenixapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.phoenixapp.R
import br.com.fiap.phoenixapp.models.Schedule

class SchedulingAdapter(val context: Context, val dataset: List<Schedule>):
        RecyclerView.Adapter<SchedulingAdapter.SchedulingViewHolder>() {

    class SchedulingViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val tvTypeRelatorio: TextView = view.findViewById(R.id.tvReport)
        val tvExecution: TextView = view.findViewById(R.id.tvDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SchedulingViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_scheduling, parent,false)
        return SchedulingViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onBindViewHolder(holder: SchedulingViewHolder, position: Int) {
        val item = dataset[position]
        holder.tvTypeRelatorio.text = context.resources.getString(item.typeReportId)
        holder.tvExecution.text = context.resources.getString(item.dtNextSchedulingId)
    }

}