package com.example.tshort.ui.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.tshort.R
import com.example.tshort.databinding.ActivitySplashBinding
import com.example.tshort.ui.dashboard.OnBoard.OnBoardActivity

class SplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

          showspalsh()

    }

    private fun showspalsh() {
        Handler().postDelayed(Runnable {
            run {
                val intent = Intent(this, OnBoardActivity::class.java)
                startActivity(intent)
                finish()
            }
        },2500)
    }


}