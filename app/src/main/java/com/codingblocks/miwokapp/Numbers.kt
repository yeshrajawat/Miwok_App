package com.codingblocks.miwokapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.list_item_view1.*

class Numbers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val words = arrayListOf<Words>()
        words.add(Words("One","Lutti",img =R.drawable.number_one))
        words.add(Words("Two","Otiiko",img =R.drawable.number_two))
        words.add(Words("Three","Tolookosu",img=R.drawable.number_three))
        words.add(Words("Four","Oyyisa",img = R.drawable.number_four))
        words.add(Words("Five","Massokka",img = R.drawable.number_five))
        words.add(Words("Six","Temmokka",img = R.drawable.number_six))
        words.add(Words("Seven","Kenekaku",img = R.drawable.number_seven))
        words.add(Words("Eight","Kawinta",img = R.drawable.number_eight))
        words.add(Words("Nine","Wo'e",img = R.drawable.number_nine))
        words.add(Words("Ten","Na'aacha",img =R.drawable.number_ten))




        var itemsadapter = WordAdapter1(this,R.layout.list_item_view2,words,1)
        val listview :ListView= findViewById<ListView>(R.id.listView)
        listview.adapter = itemsadapter
        }
    }
