package com.example.mysubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvPrince: RecyclerView
    private var list: ArrayList<Prince> = arrayListOf()

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private var title: String = "Home Page"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setActionBarTitle(title)

        rvPrince = findViewById(R.id.rv_prince)
        rvPrince.setHasFixedSize(true)

        list.addAll(PrinceData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvPrince.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListPrinceAdapter(list)
        rvPrince.adapter = listHeroAdapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.About_opt -> {
                val moveIntent = Intent(this@MainActivity, About::class.java)
                startActivity(moveIntent)
                title = "About"
            }
            R.id.Detail_opt -> {
                showRecyclerCardView()
                title = "Details"
            }
            R.id.Home_opt -> {
                val moveIntent = Intent(this@MainActivity, MainActivity::class.java)
                startActivity(moveIntent)
                title = "Home Page"
            }
        }
        setActionBarTitle(title)
    }

    private fun showRecyclerCardView() {
        rvPrince.layoutManager = LinearLayoutManager(this)
        val cardViewHeroAdapter = CardViewPrince(list)
        rvPrince.adapter = cardViewHeroAdapter
    }

}