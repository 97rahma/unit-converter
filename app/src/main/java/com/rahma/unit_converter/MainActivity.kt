package com.rahma.unit_converter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rahma.unit_converter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.button.setOnClickListener {
            val convert = binding.edittext.text.toString().toDouble()
            binding.textView.text = (convert * 100).toString()+"cm"
        } } }