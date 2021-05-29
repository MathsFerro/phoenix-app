package br.com.fiap.phoenixapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.fiap.phoenixapp.R
import br.com.fiap.phoenixapp.models.Help

class HelpAdapter(val context: Context, val dataset: List<Help>):
        RecyclerView.Adapter<HelpAdapter.HelpViewHolder>() {

    class HelpViewHolder(val view: View): RecyclerView.ViewHolder(view) {
        val tvTitleHelp: TextView = view.findViewById(R.id.tvTitleHelp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HelpViewHolder {
        val adapterHolder = LayoutInflater.from(parent.context).inflate(R.layout.item_help, parent, false)
        return HelpViewHolder(adapterHolder)
    }

    override fun onBindViewHolder(holder: HelpViewHolder, position: Int) {
        val item = dataset[position]
        holder.tvTitleHelp.text = context.resources.getString(item.titleId)
    }

    override fun getItemCount(): Int = dataset.size


}