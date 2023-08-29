package com.example.tshort.ui.dashboard.OnBoard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.tshort.R
import com.example.tshort.databinding.ActivityOnBoardBinding
import com.example.tshort.ui.SignUpActivity
import com.example.tshort.ui.signin.SignInActivity

class OnBoardActivity : AppCompatActivity() {

    var adapter:SlideViewPagerAdapter?=null
    private lateinit var binding: ActivityOnBoardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOnBoardBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter= SlideViewPagerAdapter(this )

        binding.viewpager.setAdapter(adapter)

        intializeUi()


    }

    private fun intializeUi() {

    binding.viewpager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener    {

    override fun onPageScrollStateChanged(state: Int) {

    }

    override fun onPageScrolled(
        position: Int,
        positionOffset: Float,
        positionOffsetPixels: Int
    ) {

    }

    override fun onPageSelected(position: Int) {

        if(binding.viewpager.currentItem==0){

            binding.ind1.setImageResource(R.drawable.selected_view_pager)
            binding.ind2.setImageResource(R.drawable.un_selected_view_pager)
            binding.ind3.setImageResource(R.drawable.un_selected_view_pager)

        }else if(binding.viewpager.currentItem==1){


            binding.ind1.setImageResource(R.drawable.un_selected_view_pager)
            binding.ind2.setImageResource(R.drawable.selected_view_pager)
            binding.ind3.setImageResource(R.drawable.un_selected_view_pager)


        }else{
            binding.ind1.setImageResource(R.drawable.un_selected_view_pager)
            binding.ind2.setImageResource(R.drawable.un_selected_view_pager)
            binding.ind3.setImageResource(R.drawable.selected_view_pager)

        }

    }

})

        binding.button.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignIN.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }

    }
}