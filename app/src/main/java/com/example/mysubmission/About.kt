package com.example.mysubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class About : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val btnMoveActivity: Button = findViewById(R.id.btn_kembali_about)
        btnMoveActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_kembali_about -> {
                val moveIntent = Intent(this@About, MainActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }
}