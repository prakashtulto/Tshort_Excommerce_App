package com.example.tshort.ui.dashboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.tshort.R
import com.example.tshort.databinding.ActivityDashboardBinding
import com.example.tshort.ui.dashboard.Home.HomeFragment
import com.example.tshort.ui.dashboard.Profile.ProfileFragment
import com.example.tshort.ui.dashboard.cart.CartFragment
import com.example.tshort.ui.dashboard.dashboardfrag.DashFragment
import com.google.android.material.navigation.NavigationBarView


class DashboardActivity : AppCompatActivity() {
    private lateinit var binding:ActivityDashboardBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDashboardBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intializeUi()
    }

    fun changeAppbarColor(frag: String){

        when (frag){
            "DashFragment" ->{
                binding.menuIconImage.setText("Home")
            }
            "HomeFragment"->{
                binding.menuIconImage.setText("Menu")
            }
            "CartFragment"->{
                binding.menuIconImage.setText("My Cart")
            }
            "ProfileFragment"->{
                binding.menuIconImage.setText("Profile")

            }

        }
    }


    private fun intializeUi() {
        loadFragment(DashFragment())
        binding.bottomNav.setOnItemSelectedListener(NavigationBarView.OnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    loadFragment(DashFragment())
                }
                R.id.menu -> {
                    loadFragment(HomeFragment())
                }
                R.id.cart -> {
                    loadFragment(CartFragment())
                }

                R.id.profile -> {
                    loadFragment(ProfileFragment())
                }
            }
            true
        })
    }

    private  fun loadFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

}