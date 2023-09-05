package com.example.a1dars

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a1dars.databinding.ActivityLoginBinding
import kotlin.properties.Delegates

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var bool=binding.kirishBtn.isEnabled
        Log.d("AAA", bool.toString())
        binding.eslabQolKirish.setOnClickListener {
            bool=true
        }
        binding.kirishBtn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
        binding.royhatdanOtishKirish.setOnClickListener {
            val intent = Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
        }
    }
}