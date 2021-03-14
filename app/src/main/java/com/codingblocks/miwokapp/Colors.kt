package com.codingblocks.miwokapp

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ListView

class Colors : AppCompatActivity() {
     var mp :MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val colors = arrayListOf<Words>()
        colors.add(Words("Red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red))
        colors.add(Words("Green", "chokokki",R.drawable.color_green,R.raw.color_green))
        colors.add(Words("Brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown))
        colors.add(Words("Gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray))
        colors.add(Words("Black","kululli",R.drawable.color_black,R.raw.color_black))
        colors.add(Words("White", "kelelli",R.drawable.color_white,R.raw.color_white))
        colors.add(Words("Dusty Yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow))
        colors.add(Words("Mustard Yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow))
        val listview:ListView = findViewById<ListView>(R.id.listView)


        val adapter = WordAdapter1(this,R.layout.list_item_view2,colors,1)
        listview.adapter = adapter
        listview.setOnItemClickListener { parent, view, position, id ->
            val item:Words = colors.get(position)
            mp = releaseplayer(mp)
            mp = MediaPlayer.create(this,item.audio)
            mp?.start()

            mp?.setOnCompletionListener(MediaPlayer.OnCompletionListener {
                mp = releaseplayer(mp)
            })
        }


    }

    override fun onStop() {
        super.onStop()
      mp =   releaseplayer(mp)
    }

    fun releaseplayer(mp:MediaPlayer?): MediaPlayer?
    {
        mp?.release()
        return null
    }
}