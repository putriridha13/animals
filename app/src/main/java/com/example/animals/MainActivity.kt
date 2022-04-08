package com.example.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.animals.adapter.item_adapter
import com.example.animals.item.item_animal


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = item_animal.animals
        val recyclerView = findViewById<RecyclerView>(R.id.rv_list)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = item_adapter(myDataset)
        recyclerView.setHasFixedSize(true)
    }
}