package com.example.prakutscaca

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recycleAdapter: AdapterDisney
    lateinit var listData: ArrayList<DataDisney>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recycle = findViewById(R.id.idRVCourses)
        recycle.setHasFixedSize(true)
        listData = ArrayList()

        listData.add(DataDisney("Ariel", "21044110033", "23 Tahun", R.drawable.ariel))
        listData.add(DataDisney("Putri jasmine", "2019187254", "25 tahun", R.drawable.jasmine))
        listData.add(DataDisney("Mulan", "12876510", "22 tahun", R.drawable.mulan))
        listData.add(DataDisney("Aurora", "19287363", "30 tahun", R.drawable.aurora))
        listData.add(DataDisney("Cinderella", "01872653", "23 tahun", R.drawable.cinderella))
        listData.add(DataDisney("Snow white", "10928736", "23 tahun", R.drawable.snowwhite))
        listData.add(DataDisney("Elsa", "109276535", "23 tahun", R.drawable.elsa))
        listData.add(DataDisney("Anna", "102986", "24 tahun", R.drawable.anna))
        listData.add(DataDisney("Rapunzel", "109873", "21 tahun", R.drawable.rapunzel))
        listData.add(DataDisney("Belle", "0283736", "30 tahun", R.drawable.belle))

        showList()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.options_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == R.id.menu_list) {
            showList()
        } else if (item.itemId == R.id.menu_grid) {
            showGrid()
        }
        return super.onOptionsItemSelected(item)
    }

    private fun showGrid() {
        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recycleAdapter = AdapterDisney(listData, this)
        recycle.adapter = recycleAdapter
    }

    private fun showList() {
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recycle.layoutManager = layoutManager
        recycleAdapter = AdapterDisney(listData, this)
        recycle.adapter = recycleAdapter
    }
}