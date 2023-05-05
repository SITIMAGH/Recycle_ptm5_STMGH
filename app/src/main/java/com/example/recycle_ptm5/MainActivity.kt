package com.example.recycle_ptm5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    val datamhs = listOf(
        inis_var(
            R.drawable.azzam,
            namamhs = "azzam",
            nimmhs = "0001",
            notelp = "084123"
        ),
        inis_var(
            R.drawable.azzam2,
            namamhs = "titan",
            nimmhs = "0002",
            notelp = "084123"
        ),
        inis_var(
            R.drawable.azzam3,
            namamhs = "azzam jelek",
            nimmhs = "0002",
            notelp = "084123"
        ),
        inis_var(
            R.drawable.azzam4,
            namamhs = "alay",
            nimmhs = "0002",
            notelp = "084123"

        )
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.setHasFixedSize(true)

        ShowListMahasiswa()
        ShowGridMahasiswa()
        ShowCardMahasiswa()
    }

    private fun ShowCardMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager (this)
        val adapter = Card_MahasiswaAdapter(this,datamhs){

        }
        recyclerView.adapter = adapter
    }

    private fun ShowGridMahasiswa() {
        val adapter = grid_mhsadapter(grid_mhs = datamhs) {
        }
        val recyclerView = findViewById<RecyclerView>(R.id.Rv_Mahasiswa)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = grid_mhsadapter(datamhs) {
        }
    }

    private fun ShowListMahasiswa() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = List_MahasiswaAdapter(this, datamhs) {
        }
    }

}

