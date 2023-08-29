package com.example.tshort.ui.dashboard.Home.Adapter

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.tshort.R


class CatagoryAdapter(
    val result: ArrayList<String>,
    val context: Context,
) : RecyclerView.Adapter<CatagoryAdapterViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CatagoryAdapterViewHolder {
        return CatagoryAdapterViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.catagory_item,
                p0,
                false
            )
        )
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: CatagoryAdapterViewHolder, position: Int) {
        val item = result[position]
        holder.tv_header1.text = item

    }

    override fun getItemCount(): Int {
        return result.size
    }
}
class CatagoryAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val tv_header1 = view.findViewById(R.id.textView3) as TextView


}