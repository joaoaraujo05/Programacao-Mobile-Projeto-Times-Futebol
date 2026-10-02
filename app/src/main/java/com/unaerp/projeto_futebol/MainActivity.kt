package com.unaerp.projeto_futebol

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.unaerp.projeto_futebol.databinding.ActivityMainBinding
import com.unaerp.projeto_futebol.model.listaTimes

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvTimes.layoutManager = LinearLayoutManager(this)
        binding.rvTimes.adapter = TimeAdapter(listaTimes) { time ->
            val intent = Intent(this, DetalhesActivity::class.java)
            intent.putExtra(DetalhesActivity.EXTRA_TIME_ID, time.id)
            startActivity(intent)
        }

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}