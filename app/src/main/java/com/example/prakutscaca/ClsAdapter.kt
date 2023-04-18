package com.example.prakutscaca

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterDisney(private val listDisney: ArrayList<DataDisney>, private val context: Context
): RecyclerView.Adapter<AdapterDisney.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterDisney.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.grid_layout,
            parent, false
        )
        return CourseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AdapterDisney.CourseViewHolder, position: Int) {
        holder.nama.text = listDisney.get(position).Name
        holder.nim.text = listDisney.get(position).Nim
        holder.umur.text = listDisney.get(position).Age
        holder.gambar.setImageResource(listDisney.get(position).Img)
    }

    override fun getItemCount(): Int {
        return listDisney.size
    }

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.idgambar)
        val nama: TextView = itemView.findViewById(R.id.idnama)
        val nim: TextView = itemView.findViewById(R.id.idnim)
        val umur: TextView = itemView.findViewById(R.id.idumur)
    }
}



