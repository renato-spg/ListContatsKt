package com.soprogramacao.listcontats

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.soprogramacao.listcontats.model.MainAdapter

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycler = findViewById<RecyclerView>(R.id.activity_main_rv);

        recycler.layoutManager = LinearLayoutManager(this);

        val list = listOf<String>(
            "Renato","Douglas","Tomas","Adolfo","Lucas","Manuel","Mateus","Maria","Pedro","Emanuel",
        )

        recycler.adapter = MainAdapter(list);
    }
}