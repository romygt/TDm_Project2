package com.example.tp4_exo1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.Shapeable

class Myadapter(private val newslist:ArrayList<News>) : RecyclerView.Adapter<Myadapter.MyViewHolder>(){



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
        return MyViewHolder(itemView)
    }



    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
      val currentItem =newslist[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text=currentItem.heading
        holder.etat.text=currentItem.etat
        holder.pourcentage.text=currentItem.pourcentage
        holder.wilaya.text=currentItem.wilaya
        holder.kilometrage.text=currentItem.kilometrage
        holder.duree.text=currentItem.duration

    }



    override fun getItemCount(): Int {
     return newslist.size
    }



    class MyViewHolder(itamView : View) : RecyclerView.ViewHolder(itamView){
        val titleImage : ShapeableImageView = itemView.findViewById(R.id.title_image)
        val tvHeading : TextView = itemView.findViewById(R.id.tvHeading)
        val etat :  TextView = itemView.findViewById(R.id.etat)
        val pourcentage :  TextView = itemView.findViewById(R.id.pourcentage)
        val wilaya :  TextView = itemView.findViewById(R.id.wilaya)
        val kilometrage :  TextView = itemView.findViewById(R.id.kilometrage)
        val duree :  TextView = itemView.findViewById(R.id.duree)




    }
}