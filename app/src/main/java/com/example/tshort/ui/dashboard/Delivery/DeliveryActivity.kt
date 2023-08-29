package com.example.tshort.ui.dashboard.Delivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tshort.R
import com.example.tshort.databinding.ActivityDeliveryBinding

class DeliveryActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDeliveryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeliveryBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}