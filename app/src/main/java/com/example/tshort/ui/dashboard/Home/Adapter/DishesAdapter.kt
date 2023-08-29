package com.example.tshort.ui.dashboard.Home.Adapter

import android.content.Context
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.tshort.R
import com.example.tshort.ui.dashboard.Home.CatagoryModel

class DishesAdapter(
    val result: ArrayList<CatagoryModel>,
    val context: Context,
) : RecyclerView.Adapter<DishesAdapterViewHolder>() {
    lateinit var goalsAdapterListener: DishesAdapterListener

    interface DishesAdapterListener {
        fun onItemClick()
    }
    fun DishesAdapterListenerNew(dishesAdapterListener: DishesAdapterListener) {
        this.goalsAdapterListener = dishesAdapterListener
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DishesAdapterViewHolder {
        return DishesAdapterViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.shirt_item,
                p0,
                false
            )
        )
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onBindViewHolder(holder: DishesAdapterViewHolder, position: Int) {
        val item = result[position]
        holder.imageView2.setImageResource(item.image)
        holder.dishesName.text = item.shirtName
        holder.dishesPrice.text = item.ShirtPrice
        holder.itemView.setOnClickListener {
            goalsAdapterListener.onItemClick()

        }
    }

    override fun getItemCount(): Int {
        return result.size
    }
}
class DishesAdapterViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val dishesPrice = view.findViewById(R.id.shritprice) as TextView
    val dishesName = view.findViewById(R.id.shirtname) as TextView
    val imageView2 = view.findViewById(R.id.imageView4) as ImageView
}