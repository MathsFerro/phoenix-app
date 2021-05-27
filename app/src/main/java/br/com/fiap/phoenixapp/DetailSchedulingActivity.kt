package br.com.fiap.phoenixapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.fiap.phoenixapp.adapter.SchedulingAdapter
import br.com.fiap.phoenixapp.data.ScheduleDataSource
import br.com.fiap.phoenixapp.databinding.ActivityDetailSchedulingBinding

class DetailSchedulingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailSchedulingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailSchedulingBinding.inflate(layoutInflater)

        val data = ScheduleDataSource().loadFakeScheduling()
        binding.recyclerListSchedule.adapter = SchedulingAdapter(this, data)

        setContentView(binding.root)
    }
}