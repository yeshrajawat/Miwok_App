package com.codingblocks.miwokapp

import android.R.color.holo_orange_light
import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.list_item_view1.*

class Family_Members : AppCompatActivity() {
    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val members = arrayListOf<Words>()

        members.add(Words("Father","әpә",R.drawable.family_father))
        members.add(Words("Mother","әṭa",R.drawable.family_mother))
        members.add(Words("Son","Angsi",R.drawable.family_son))
        members.add(Words("Daugther","Tune",R.drawable.family_daughter))
        members.add(Words("Older Brother","Taachi",R.drawable.family_older_brother))
        members.add(Words("Younger Brother","Chalitti",R.drawable.family_younger_brother))
        members.add(Words("Older Sister","Teṭe",R.drawable.family_older_sister))
        members.add(Words("Younger Sister","Kolliti",R.drawable.family_younger_sister))
        members.add(Words("Grand Mother","Ama",R.drawable.family_grandmother))
        members.add(Words("Grand Father","Paapa",R.drawable.family_grandfather))

        val listView: ListView = findViewById<ListView>(R.id.listView)
        val adapter = WordAdapter1(this,R.layout.list_item_view2,members,1)
        listView.adapter = adapter





    }
}


