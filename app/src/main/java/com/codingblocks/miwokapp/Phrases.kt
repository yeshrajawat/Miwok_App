package com.codingblocks.miwokapp

import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.list_item_view1.*
import kotlinx.android.synthetic.main.list_item_view2.*

class Phrases : AppCompatActivity() {
     var mp:MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val phrases = arrayListOf<Words>()

        phrases.add(Words(
                "Where are you going?","Minto wuksus",0,R.raw.phrase_where_are_you_going))
        phrases.add(Words(
                "What is your name?","Tinnә oyaase'nә",0,R.raw.phrase_what_is_your_name))
        phrases.add(Words("My name is...","Oyaaset...",0,R.raw.phrase_my_name_is))
        phrases.add(Words("How are you feeling?","Michәksәs?",0,R.raw.phrase_how_are_you_feeling))
        phrases.add(Words("I’m feeling good.","Kuchi achit",0,R.raw.phrase_im_feeling_good))
        phrases.add(Words("Are you coming?","әәnәs'aa?",0,R.raw.phrase_are_you_coming))
        phrases.add(Words("Yes, I’m coming.","Hәә’ әәnәm",0,R.raw.phrase_yes_im_coming))
        phrases.add(Words("I’m coming.","әәnәm",0,R.raw.phrase_im_coming))
        phrases.add(Words("Let’s go","yoowutis",0,R.raw.phrase_lets_go))
        phrases.add(Words("Come here.","yoowutis",0,R.raw.phrase_come_here))

        val listView : ListView = findViewById<ListView>(R.id.listView)
        val adapter = WordAdapter1(this,R.layout.list_item_view1,phrases)
        listView.setOnItemClickListener { parent, view, position, id ->
            val item:Words = phrases.get(position)
            mp = releaseplayer(mp)

            mp = MediaPlayer.create(this,item.audio)
            mp?.start()

            mp?.setOnCompletionListener(MediaPlayer.OnCompletionListener {
                mp = releaseplayer(mp)
            })
        }

        listView.adapter = adapter

    }

    override fun onStop() {
        super.onStop()
        mp = releaseplayer(mp)
    }
    fun releaseplayer(mp:MediaPlayer?):MediaPlayer?
    {
        mp?.release()
        return null
    }
}