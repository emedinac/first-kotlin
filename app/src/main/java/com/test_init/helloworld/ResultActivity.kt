package com.test_init.helloworld

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.test_init.helloworld.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBack.setOnClickListener { onBackPressed() }
        getAndShowName()
    }

    @SuppressLint("SetTextI18n")
    fun getAndShowName() {
        val bundle = intent.extras
        val name = bundle?.getString("INTENT_NAME", "DEBUG: issue detected!")
        binding.tvGreeting.text = "Welcome $name !!!"
    }
}