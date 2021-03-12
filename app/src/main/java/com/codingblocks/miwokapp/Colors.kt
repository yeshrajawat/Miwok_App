package com.codingblocks.miwokapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class Colors : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val colors = arrayListOf<Words>()
        colors.add(Words("Red","weṭeṭṭi",R.drawable.color_red))
        colors.add(Words("Green", "chokokki",R.drawable.color_green))
        colors.add(Words("Brown","ṭakaakki",R.drawable.color_brown))
        colors.add(Words("Gray","ṭopoppi",R.drawable.color_gray))
        colors.add(Words("Black","kululli",R.drawable.color_black))
        colors.add(Words("White", "kelelli",R.drawable.color_white))
        colors.add(Words("Dusty Yellow","ṭopiisә",R.drawable.color_dusty_yellow))
        colors.add(Words("Mustard Yellow","chiwiiṭә",R.drawable.color_mustard_yellow))
        val listview:ListView = findViewById<ListView>(R.id.listView)

        val adapter = WordAdapter1(this,R.layout.list_item_view2,colors,1)
        listview.adapter = adapter



    }
}