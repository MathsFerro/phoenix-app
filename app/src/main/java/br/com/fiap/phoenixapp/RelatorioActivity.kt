package br.com.fiap.phoenixapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.phoenixapp.databinding.ActivityRelatorioBinding
import br.com.fiap.phoenixapp.utils.createAdapters

class RelatorioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRelatorioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRelatorioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val filter = createAdapters(this)

        binding.snFilterPrefeitura.adapter = filter["prefeituras"]
        binding.snFilterRelatorio.adapter = filter["relatorios"]
    }
}