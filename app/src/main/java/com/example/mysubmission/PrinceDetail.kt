package com.example.mysubmission

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class PrinceDetail : AppCompatActivity() {

    private lateinit var tvName: TextView
    private lateinit var tvDetail: TextView
    private lateinit var ivImage: ImageView
    private lateinit var backBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prince_detail)

        backBtn = findViewById(R.id.btn_kembali_detail)
        backBtn.setOnClickListener {
            onBackPressed()
        }

        tvName = findViewById(R.id.tv_item_name)
        tvDetail = findViewById(R.id.tv_item_detail)
        tvDetail.movementMethod = ScrollingMovementMethod()
        ivImage = findViewById(R.id.img_item_photo)
        tvName.text=intent.getStringExtra("name")
        tvDetail.text=intent.getStringExtra("detail")
        Glide.with(this)
                .load(intent.getIntExtra("photo", 0))
                .apply(RequestOptions().override(55, 55))
                .into(ivImage)

    }

}
