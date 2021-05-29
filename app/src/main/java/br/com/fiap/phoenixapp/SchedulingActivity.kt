package br.com.fiap.phoenixapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.phoenixapp.databinding.ActivityAgendamentoBinding
import br.com.fiap.phoenixapp.utils.SelectedFilters
import br.com.fiap.phoenixapp.utils.createAdapters

class SchedulingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgendamentoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendamentoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadFilters()

        binding.btSchedulingWithFilters.setOnClickListener {
            val selectedFilters = SelectedFilters (
                binding.snPrefeituras.selectedItem.toString(),
                binding.snRelatorios.selectedItem.toString()
            )

            val intent = Intent(this, DetailSchedulingActivity::class.java)
                    .putExtra("selectedFilters", selectedFilters)
            startActivity(intent)
        }

        binding.btSchedulingNoFilters.setOnClickListener {
            val intent = Intent(this, DetailSchedulingActivity::class.java)
            startActivity(intent)
        }
    }

    private fun loadFilters() {
        val filter = createAdapters(this)
        binding.snPrefeituras.adapter = filter["prefeituras"]
        binding.snRelatorios.adapter = filter["relatorios"]

    }
}