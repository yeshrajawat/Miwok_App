package com.codingblocks.miwokapp

import ColorsFragment
import FamilyFragment
import NumberFragment
import PhrasesFragment
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val adapter = ViewPager(supportFragmentManager)
        adapter.addfrag(NumberFragment(),"Numbers")
        adapter.addfrag(FamilyFragment(),"Family")
        adapter.addfrag(ColorsFragment(),"Colors")
        adapter.addfrag(PhrasesFragment(),"Phrases")
        viewpager.adapter = adapter
        tabs.setupWithViewPager(viewpager)


    }
/*
    fun opennumbers(view: View) {
        val intent = Intent(view.context,Numbers::class.java)
        startActivity(intent)
    }
    fun openfamily(view: View) {
        val intent = Intent(view.context,Family_Members::class.java)
        startActivity(intent)
    }

    fun opencolors(view: View) {
        val intent = Intent(view.context,Colors::class.java)
        startActivity(intent)
    }
    fun openphrases(view: View) {
        val intent = Intent(view.context,Phrases::class.java)
        startActivity(intent)
    }*/
}