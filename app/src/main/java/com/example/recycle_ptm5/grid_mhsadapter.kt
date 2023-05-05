package com.example.recycle_ptm5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager
import android.widget.ImageView

class grid_mhsadapter (private val grid_mhs : List<inis_var>, val listener: (inis_var) -> Unit) :
    RecyclerView.Adapter<grid_mhsadapter.GridViewHolder>() {
    class GridViewHolder (view: View): RecyclerView.ViewHolder(view) {
        val fotomhs = view.findViewById<ImageView>(R.id.civ_id_grid)


        //inisialisasi Layout Manager
        private val layoutManager = GridLayoutManager(view.context,2)
        fun bindView(grid_mhs: inis_var, listener: (inis_var) -> Unit) {
            fotomhs.setImageResource((grid_mhs.fotomhs))
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_mhslayout, parent, false)
        // create and set the GridLayoutManager with 2 columns
        val layoutManager = GridLayoutManager(parent.context, 2)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int = grid_mhs.size

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bindView(grid_mhs[position], listener)
    }
}
