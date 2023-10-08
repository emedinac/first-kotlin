package com.test_init.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.test_init.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnShowName.setOnClickListener { checkValue() }
    }

    fun checkValue() {
        if (binding.etName.text.isNotEmpty()) {
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", binding.etName.text.toString())
            startActivity(intent)
        } else {
            showErrorName()
        }
    }

    fun showErrorName() {
        Toast.makeText(this, "user name must not be empty", Toast.LENGTH_SHORT).show()
    }
}