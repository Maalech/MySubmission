package com.example.mysubmission

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewPrince(private val listPrince: ArrayList<Prince>) : RecyclerView.Adapter<CardViewPrince.CardViewViewHolder>() {
    class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_cardview_prince, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listPrince.size
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val prince = listPrince[position]
        Glide.with(holder.itemView.context)
            .load(prince.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = prince.name
        holder.tvDetail.text = prince.detail
        holder.itemView.setOnClickListener { Toast.makeText(holder.itemView.context, "You've Chosen " + listPrince[holder.adapterPosition].name + ", Great Choice Mortal!", Toast.LENGTH_SHORT).show() }
    }
}