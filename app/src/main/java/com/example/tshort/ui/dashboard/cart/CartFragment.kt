package com.example.tshort.ui.dashboard.cart

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tshort.R
import com.example.tshort.databinding.FragmentCartBinding
import com.example.tshort.ui.dashboard.DashboardActivity
import com.example.tshort.ui.dashboard.Delivery.DeliveryActivity


class CartFragment : Fragment() {
    private lateinit var binding: FragmentCartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentCartBinding.inflate(layoutInflater)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initalize()
    }

    private fun initalize() {
        changAppBarColor()
        binding.button.setOnClickListener {
            val intent = Intent(context, DeliveryActivity::class.java)
            startActivity(intent)
        }
    }

    fun  changAppBarColor(){
        (activity as DashboardActivity).changeAppbarColor("CartFragment")
    }

}