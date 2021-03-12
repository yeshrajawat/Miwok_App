package com.codingblocks.miwokapp

import android.content.Context
import android.graphics.drawable.Drawable
import android.nfc.tech.TagTechnology
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.list_item_view2.view.*
import org.w3c.dom.Text

public class WordAdapter1(val contexts:Context, val res:Int, val items:ArrayList<Words>, val img :Int =0 ):ArrayAdapter<Words>(contexts,res,items)
{

 override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

 val layoutInflater:LayoutInflater = LayoutInflater.from(contexts)
  val view:View = layoutInflater.inflate(res,null)


   val textView1 = view.findViewById<TextView>(R.id.english_word)
   val textView2 = view.findViewById<TextView>(R.id.miwok_word)
   val imageView = view.findViewById<ImageView>(R.id.imgs)

   val mitems: Words = items[position]
   textView1.text = mitems.english_word
   textView2.text = mitems.miwok_word
   if(img>0)
   {
    imageView.setImageDrawable(contexts.resources.getDrawable(mitems.img))
    return view
   }
   return view

  }
}


