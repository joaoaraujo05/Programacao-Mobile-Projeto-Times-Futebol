package com.unaerp.projeto_futebol

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.unaerp.projeto_futebol.databinding.ActivityDetalhesBinding

class DetalhesActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_TIME_ID = "extra_time_id"
    }

    private lateinit var binding: ActivityDetalhesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityDetalhesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        if (savedInstanceState == null) {
            val id = intent.getIntExtra(EXTRA_TIME_ID, -1)

            supportFragmentManager.beginTransaction()
                .replace(R.id.main, DetalhesFragment.newInstance(id))
                .commit()
        }
    }
}