package com.codingblocks.miwokapp

import android.graphics.Color
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import kotlinx.android.synthetic.main.list_item_view1.*

class Numbers : AppCompatActivity() {
     var mediaplayer: MediaPlayer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val words = arrayListOf<Words>()
        words.add(Words("One","Lutti",img =R.drawable.number_one,R.raw.number_one))
        words.add(Words("Two","Otiiko",img =R.drawable.number_two,R.raw.number_two))
        words.add(Words("Three","Tolookosu",img=R.drawable.number_three,R.raw.number_three))
        words.add(Words("Four","Oyyisa",img = R.drawable.number_four,R.raw.number_four))
        words.add(Words("Five","Massokka",img = R.drawable.number_five,R.raw.number_five))
        words.add(Words("Six","Temmokka",img = R.drawable.number_six,R.raw.number_six))
        words.add(Words("Seven","Kenekaku",img = R.drawable.number_seven,R.raw.number_seven))
        words.add(Words("Eight","Kawinta",img = R.drawable.number_eight,R.raw.number_eight))
        words.add(Words("Nine","Wo'e",img = R.drawable.number_nine,R.raw.number_nine))
        words.add(Words("Ten","Na'aacha",img =R.drawable.number_ten,R.raw.number_ten))




        var itemsadapter = WordAdapter1(this,R.layout.list_item_view2,words,1)
        val listview :ListView= findViewById<ListView>(R.id.listView)
        listview.adapter = itemsadapter
        listview.setOnItemClickListener { parent, view, position, id ->
            val item:Words = words.get(position)
            mediaplayer = releaseplayer(mediaplayer)
            mediaplayer = MediaPlayer.create(this,item.audio)
            mediaplayer?.start()

            mediaplayer?.setOnCompletionListener(MediaPlayer.OnCompletionListener {
                mediaplayer = releaseplayer(mediaplayer)
                Toast.makeText(this,"Bhai chal to raha hai ye",Toast.LENGTH_SHORT).show()
            })

        }
        }

    override fun onStop() {
        super.onStop()
        mediaplayer = releaseplayer(mediaplayer)
    }
    fun releaseplayer(mp:MediaPlayer?):MediaPlayer?
    {
        mp?.release()
        return null
    }
    }
