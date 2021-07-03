package com.example.viewbindinganddatabinding.uitil

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.viewbindinganddatabinding.R
import com.example.viewbindinganddatabinding.model.Fruits.FruitsData
import kotlinx.android.synthetic.main.item_fruits.view.*

class FruitsAdapter(private val fruitsList: List<FruitsData>): RecyclerView.Adapter<FruitsAdapter.FruitsViewHolder>(){
    inner class FruitsViewHolder(v:View):RecyclerView.ViewHolder(v){
        var fruitsName = v.findViewById<TextView>(R.id.fruitName)
        var fruitsCal = v.findViewById<TextView>(R.id.fruitCal)
        var fruitsImg  = v.findViewById<ImageView>(R.id.fruitImg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
         val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.item_fruits,parent, false)
        return FruitsViewHolder(v)
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
      val fruitsLists = fruitsList[position]
            holder.fruitsName.text = fruitsLists.fruitsName
            holder.fruitsCal.text = fruitsLists.fruitInfo
            holder.fruitsImg.setImageResource(fruitsLists.fruitsImg)
    }

    override fun getItemCount(): Int {
       return fruitsList.size
    }
}