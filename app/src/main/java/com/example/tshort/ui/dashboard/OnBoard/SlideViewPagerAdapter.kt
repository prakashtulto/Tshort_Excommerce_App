package com.example.tshort.ui.dashboard.OnBoard

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.viewpager.widget.PagerAdapter
import com.example.tshort.R

class SlideViewPagerAdapter(var context: Context) :PagerAdapter(){

    override fun getCount(): Int {
        return 3
    }



    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view===`object`
    }

    @SuppressLint("ResourceType")
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
      val layoutInflater =context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view:View=layoutInflater.inflate(R.layout.swap_screen,container,false)
          val logo=view.findViewById<ImageView>(R.id.img)
             val title = view.findViewById<TextView>(R.id.title)
               val desc = view.findViewById<TextView>(R.id.desc)



        when(position){

            0->{

                logo.setImageResource(R.drawable.tshirt1)

                title.text="SHOP"
                desc.text="Tshort is a popular and trendy clothing brand known for its high-quality t-shirts that combine comfort, style, and versatility."
            }

            1->{

                logo.setImageResource(R.drawable.delivery)

                title.text="Delivery Ontime"
                 desc.text="Trust Tshort's commitment to punctuality, so you can confidently shop online and receive your trendy apparel without any delay."

            }

            2->{

                logo.setImageResource(R.drawable.app)

                title.text="Download Fast"
               desc.text="Enhance your shopping experience with the user-friendly Tshort app, available for download now on iOS and Android devices. "

            }

        }

          container.addView(view)
           return  view


    }


    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {

        container.removeView(`object`as View)
    }

}