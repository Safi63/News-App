package com.example.api_integration

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val surah : List<Surah>):RecyclerView.Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val  inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txtTitle.text = surah[position].title
        holder.txtDescription.text = surah[position].description
        var color = "#CCCCCC"
        if (position %2 == 0){
            color = "#EEEEEE"
        }
        holder.container.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return surah.size
    }

    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView ){

        var txtTitle = itemView.findViewById<TextView>(R.id.title)
        var txtDescription = itemView.findViewById<TextView>(R.id.description)
        var container = itemView.findViewById<LinearLayout>(R.id.container)
    }

}

