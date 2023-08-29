package com.example.tshort.ui.dashboard.Home

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tshort.R
import com.example.tshort.databinding.FragmentHomeBinding
import com.example.tshort.ui.dashboard.DashboardActivity
import com.example.tshort.ui.dashboard.Home.Adapter.CatagoryAdapter
import com.example.tshort.ui.dashboard.Home.Adapter.DishesAdapter
import com.example.tshort.ui.dashboard.Order.OrderActivity


class HomeFragment : Fragment(), DishesAdapter.DishesAdapterListener {
    private lateinit var binding: FragmentHomeBinding
    val dataList: ArrayList<String> = ArrayList<String>()
    private var catagoryAdapter: CatagoryAdapter? = null
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
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpAdapter()
        changAppBarColor()
    }

    fun  changAppBarColor(){
        (activity as DashboardActivity).changeAppbarColor("HomeFragment")
    }


    private fun setUpAdapter() {
        dataList.clear()
        dataList.add("All")
        dataList.add("Featured")
        dataList.add("Top of week")
        dataList.add("soup")
        dataList.add("Sea Food")
        binding.rvCatagory.layoutManager = LinearLayoutManager(context,
            LinearLayoutManager.HORIZONTAL,false)
        catagoryAdapter = CatagoryAdapter(dataList, requireContext())
        binding.rvCatagory.adapter = catagoryAdapter


        dishdataList.clear()
        dishdataList.add(CatagoryModel(R.drawable.tshirt1,"Dope Tshirt","₹1000"))
        dishdataList.add(CatagoryModel(R.drawable.tshirt2,"castlevie","₹3455"))
        dishdataList.add(CatagoryModel(R.drawable.tshirt3,"cardTshirt","₹2222"))
        dishdataList.add(CatagoryModel(R.drawable.tshirt4,"Suntshirt","₹3214"))
        dishdataList.add(CatagoryModel(R.drawable.tshirt5,"California","₹1232"))
        dishdataList.add(CatagoryModel(R.drawable.tshirt2,"DopeLoe","₹4343"))
        binding.rvDishes.layoutManager = GridLayoutManager(context,2)
        dishesAdapter = DishesAdapter(dishdataList, requireContext())
        binding.rvDishes.adapter = dishesAdapter
        dishesAdapter!!.DishesAdapterListenerNew(this)
    }

    override fun onItemClick() {
        val intent = Intent(requireContext(), OrderActivity::class.java)
        startActivity(intent)
    }


}