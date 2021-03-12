package com.codingblocks.miwokapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.list_item_view1.*

class Phrases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val phrases = arrayListOf<Words>()

        phrases.add(Words(
                "Where are you going?","Minto wuksus"))
        phrases.add(Words(
                "What is your name?","Tinnә oyaase'nә"))
        phrases.add(Words("My name is...","Oyaaset..."))
        phrases.add(Words("How are you feeling?","Michәksәs?"))
        phrases.add(Words("I’m feeling good.","Kuchi achit"))
        phrases.add(Words("Are you coming?","әәnәs'aa?"))
        phrases.add(Words("Yes, I’m coming.","Hәә’ әәnәm"))
        phrases.add(Words("I’m coming.","әәnәm"))
        phrases.add(Words("Let’s go","yoowutis"))
        phrases.add(Words("Come here.","yoowutis"))
        val listView : ListView = findViewById<ListView>(R.id.listView)
        val adapter = WordAdapter1(this,R.layout.list_item_view1,phrases)

        listView.adapter = adapter

    }
}