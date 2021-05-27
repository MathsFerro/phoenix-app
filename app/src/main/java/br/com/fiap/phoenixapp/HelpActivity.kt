package br.com.fiap.phoenixapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.phoenixapp.adapter.HelpAdapter
import br.com.fiap.phoenixapp.data.HelpDataSource
import br.com.fiap.phoenixapp.databinding.ActivityHelpBinding

class HelpActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHelpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelpBinding.inflate(layoutInflater)


        val data = HelpDataSource().loadFakeHelp()
        binding.rvDuvidas.adapter = HelpAdapter(this, data)

        setContentView(binding.root)
    }
}