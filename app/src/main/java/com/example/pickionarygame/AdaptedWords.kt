package com.example.pickionarygame

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdaptedWords(val array: ArrayList<Words>) : RecyclerView.Adapter<AdaptedWords.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val vista= LayoutInflater.from(parent.context).inflate(R.layout.card, parent, false)
        return ViewHolder(vista)
    }

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = array[position].title
        holder.description.text = array[position].description
        holder.xp.text = array[position].xp.toString()+"@strings/nivel"
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val title: TextView = itemView.findViewById(R.id.textTitleAchievement) as TextView
        val description: TextView = itemView.findViewById(R.id.textDescription) as TextView
        val xp: TextView = itemView.findViewById(R.id.textXP) as TextView

    }

}