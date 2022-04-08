package com.example.animals.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.animals.model.animal
import com.example.animals.R


class item_adapter(
    private val dataset: List<animal>
) : RecyclerView.Adapter<item_adapter.animalViewHolder>() {

    class animalViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name_animal= view.findViewById<TextView?>(R.id.tv_name)
        val deskripsi_animal = view.findViewById<TextView?>(R.id.tv_deskripsi)
        var imgGambar: ImageView = itemView.findViewById(R.id.img_item)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): animalViewHolder {
        // create a new view
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)

        return animalViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: animalViewHolder, position: Int) {
        val item = dataset[position]
        holder.name_animal.text = item.name
        holder.deskripsi_animal.text = item.deskripsi
        holder.imgGambar.setImageResource(item.imageResourceId) // tambahin ini buat menampilkan gambar
    }


    override fun getItemCount() = dataset.size
}