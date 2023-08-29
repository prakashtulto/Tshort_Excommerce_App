package com.example.tshort.ui.dashboard.dashboardfrag

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tshort.R
import com.example.tshort.databinding.FragmentDashBinding
import com.example.tshort.ui.dashboard.DashboardActivity
import com.example.tshort.ui.dashboard.Home.Adapter.DishesAdapter
import com.example.tshort.ui.dashboard.Home.CatagoryModel
import com.example.tshort.ui.dashboard.Order.OrderActivity


class DashFragment : Fragment(),DishesAdapter.DishesAdapterListener {
    private lateinit var binding: FragmentDashBinding
    val dishdataList: ArrayList<CatagoryModel> = ArrayList<CatagoryModel>()
    private var dishesAdapter: DishesAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDashBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpAdapter()
        changAppBarColor()
    }

    fun  changAppBarColor(){
        (activity as DashboardActivity).changeAppbarColor("DashFragment")
    }

    private fun setUpAdapter() {
        dishdataList.clear()
        dishdataList.add(CatagoryModel(R.drawable.jeans1,"Fried mutton","$150.48"))
        dishdataList.add(CatagoryModel(R.drawable.jeans2,"Mashed Potato","$200.19"))
        dishdataList.add(CatagoryModel(R.drawable.jeans3,"Lasgana","$150.00"))
        dishdataList.add(CatagoryModel(R.drawable.jeans4,"Fried mutton","$150.02"))
        dishdataList.add(CatagoryModel(R.drawable.jeans5,"Fried mutton","$150.45"))
        dishdataList.add(CatagoryModel(R.drawable.jeans6,"Fried mutton","$150.00"))
        binding.rvDishes.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL,false)
        dishesAdapter = DishesAdapter(dishdataList, requireContext())
        binding.rvDishes.adapter = dishesAdapter
        dishesAdapter!!.DishesAdapterListenerNew(this)
    }

    override fun onItemClick() {
        val intent = Intent(requireContext(), OrderActivity::class.java)
        startActivity(intent)
    }

}