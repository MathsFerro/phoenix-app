package br.com.fiap.phoenixapp.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.phoenixapp.models.Schedule

class SchedulingAdapter(val context: Context, val dataset: List<Schedule>): RecyclerView.Adapter<SchedulingAdapter.ShcedulingViewHolder>() {

    class ShcedulingViewHolder(private val view: View): RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShcedulingViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ShcedulingViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = dataset.size

}