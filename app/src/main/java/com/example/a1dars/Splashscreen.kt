package com.example.a1dars

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a1dars.databinding.ActivityLoginBinding
import com.example.a1dars.databinding.ActivitySplashscreenBinding

@SuppressLint("CustomSplashScreen")
class Splashscreen : AppCompatActivity() {
    lateinit var binding: ActivitySplashscreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivitySplashscreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.kirishBtn.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
        binding.royhatdanOtishTxt.setOnClickListener {
            val intent=Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
        }

    }
}