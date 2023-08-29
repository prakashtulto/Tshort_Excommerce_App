package com.example.tshort.ui.signin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tshort.R
import com.example.tshort.databinding.ActivitySignInBinding
import com.example.tshort.ui.SignUpActivity
import com.example.tshort.ui.dashboard.DashboardActivity
import com.example.tshort.ui.sentotp.SendOtpActivity

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
    }

    private fun initialize() {
        binding.textView6.setOnClickListener{
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }

        binding.tvFPassword.setOnClickListener{
            val intent = Intent(this, SendOtpActivity::class.java)
            startActivity(intent)
        }

        binding.button.setOnClickListener{
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }


    }
}