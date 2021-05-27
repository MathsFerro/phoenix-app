package br.com.fiap.phoenixapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.phoenixapp.databinding.ActivityAgendamentoBinding
import br.com.fiap.phoenixapp.utils.createAdapters

class SchedulingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAgendamentoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAgendamentoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val filter = createAdapters(this)

        binding.snPrefeituras.adapter = filter["prefeituras"]
        binding.snRelatorios.adapter = filter["relatorios"]
    }
}