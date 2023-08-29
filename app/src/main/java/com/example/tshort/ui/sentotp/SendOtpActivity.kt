package com.example.tshort.ui.sentotp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tshort.R
import com.example.tshort.databinding.ActivitySendOtpBinding
import com.example.tshort.ui.verify.VerificationActivity

class SendOtpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySendOtpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySendOtpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }
    private fun initialize() {
        binding.button.setOnClickListener{
            val intent = Intent(this, VerificationActivity::class.java)
            startActivity(intent)
        }
    }
}