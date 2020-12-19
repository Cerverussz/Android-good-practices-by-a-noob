package com.devdanielleguizamon.piloto01.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.devdanielleguizamon.piloto01.databinding.ActivitySplashBinding
import com.devdanielleguizamon.piloto01.presentation.extensions.onTextChange

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txvTitleSplash.text = TEXT

        binding.editText.onTextChange {

        }
    }

    companion object {
        private const val TEXT = "First test with ViewBinding"
    }
}