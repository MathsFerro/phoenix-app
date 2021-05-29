package br.com.fiap.phoenixapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import br.com.fiap.phoenixapp.adapter.SchedulingAdapter
import br.com.fiap.phoenixapp.data.ScheduleDataSource
import br.com.fiap.phoenixapp.databinding.ActivityDetailSchedulingBinding
import br.com.fiap.phoenixapp.utils.SelectedFilters

class DetailSchedulingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailSchedulingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailSchedulingBinding.inflate(layoutInflater)

        val selectedFilters = intent.extras?.getParcelable<SelectedFilters>("selectedFilters")
        val data = ScheduleDataSource().loadFakeScheduling(this, selectedFilters)
        selectedFilters?.prefeitura?.let {
            binding.tvPrefeitura.visibility = View.VISIBLE
            binding.tvPrefeitura.text = selectedFilters.prefeitura
        }


        binding.recyclerListSchedule.adapter = SchedulingAdapter(this, data)

        setContentView(binding.root)
    }
}