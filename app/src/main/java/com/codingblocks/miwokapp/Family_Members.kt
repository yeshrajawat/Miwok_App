package com.codingblocks.miwokapp

import android.R.color.holo_orange_light
import android.annotation.SuppressLint
import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.list_item_view1.*

class
Family_Members : AppCompatActivity() {

    var mp:MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val members = arrayListOf<Words>()

        members.add(Words("Father","әpә",R.drawable.family_father,R.raw.family_father))
        members.add(Words("Mother","әṭa",R.drawable.family_mother,R.raw.family_mother))
        members.add(Words("Son","Angsi",R.drawable.family_son,R.raw.family_son))
        members.add(Words("Daugther","Tune",R.drawable.family_daughter,R.raw.family_daughter))
        members.add(Words("Older Brother","Taachi",R.drawable.family_older_brother,R.raw.family_older_brother))
        members.add(Words("Younger Brother","Chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother))
        members.add(Words("Older Sister","Teṭe",R.drawable.family_older_sister,R.raw.family_older_sister))
        members.add(Words("Younger Sister","Kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister))
        members.add(Words("Grand Mother","Ama",R.drawable.family_grandmother,R.raw.family_grandmother))
        members.add(Words("Grand Father","Paapa",R.drawable.family_grandfather,R.raw.family_grandfather))

        val listView: ListView = findViewById<ListView>(R.id.listView)
        val adapter = WordAdapter1(this,R.layout.list_item_view2,members,1)
        listView.adapter = adapter
        listView.setOnItemClickListener { parent, view, position, id ->
            val item:Words = members.get(position)
            mp = relaseplayer(mp)
            mp = MediaPlayer.create(this,item.audio)
            mp?.start()
            mp?.setOnCompletionListener(MediaPlayer.OnCompletionListener {
                mp = relaseplayer(mp)
            }
            )

        }

    }

    override fun onStop() {
        super.onStop()
       mp =  relaseplayer(mp)
    }

    fun relaseplayer(mp:MediaPlayer?):MediaPlayer?
    {
        mp?.release()
        return null
    }
}


