package com.example.mysubmission

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
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
        holder.itemView.setOnClickListener{
            val activity = holder.itemView.context
            val detailIntent = Intent(activity, PrinceDetail::class.java)
            detailIntent.putExtra("photo",prince.photo)
            detailIntent.putExtra("name",prince.name)
            detailIntent.putExtra("detail",prince.detail)
            activity.startActivity(detailIntent)
        }

    }
}