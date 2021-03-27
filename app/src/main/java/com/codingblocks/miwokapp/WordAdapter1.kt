package com.codingblocks.miwokapp

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.list_item_view2.view.*

public class WordAdapter1(
 val contexts: Context,
 val res: Int,
 val items: ArrayList<Words>,
 val colours: Int
):ArrayAdapter<Words>(contexts, res, items)
{

 @SuppressLint("CutPasteId")
 override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

 val layoutInflater:LayoutInflater = LayoutInflater.from(contexts)
  val view:View = layoutInflater.inflate(res, null)


   val textView1 = view.findViewById<TextView>(R.id.english_word)
   val textView2 = view.findViewById<TextView>(R.id.miwok_word)
   val imageView = view.findViewById<ImageView>(R.id.imgs)



   val mitems: Words = items[position]
   textView1.text = mitems.english_word
   textView2.text = mitems.miwok_word
   if(mitems.img > 0)
   {

    imageView.setImageDrawable(contexts.resources.getDrawable(mitems.img))
    imageView.visibility = View.VISIBLE
   }
  else
   {
    imageView.visibility = View.GONE
   }
  val container = view.findViewById<LinearLayout>(R.id.linear2)
  val color = ContextCompat.getColor(context, colours)
  // Set the background color of the text container View
  // Set the background color of the text container View
  container.setBackgroundColor(color)
   return view

  }
}


