package br.com.fiap.phoenixapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.phoenixapp.databinding.ActivityInitialBinding

class InitialActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInitialBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInitialBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //val user = intent.extras?.getParcelable<User>("user")

        //binding.tvNameUserLogged.text = user?.name ?: "undefined"

        binding.btRelatorio.setOnClickListener { startActivity(Intent(this, RelatorioActivity::class.java)) }
        binding.btAgendamento.setOnClickListener { startActivity(Intent(this, SchedulingActivity::class.java)) }
        binding.btHelp.setOnClickListener { startActivity(Intent(this, HelpActivity::class.java)) }

    }

}