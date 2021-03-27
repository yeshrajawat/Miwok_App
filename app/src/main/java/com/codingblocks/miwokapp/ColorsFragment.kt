import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ListView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.codingblocks.miwokapp.R
import com.codingblocks.miwokapp.WordAdapter1
import com.codingblocks.miwokapp.Words

class ColorsFragment : Fragment() {
    var mediaplayer: MediaPlayer? = null

    val colors = arrayListOf<Words>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        colors.add(Words("Red","weṭeṭṭi",R.drawable.color_red,R.raw.color_red))
        colors.add(Words("Green", "chokokki",R.drawable.color_green,R.raw.color_green))
        colors.add(Words("Brown","ṭakaakki",R.drawable.color_brown,R.raw.color_brown))
        colors.add(Words("Gray","ṭopoppi",R.drawable.color_gray,R.raw.color_gray))
        colors.add(Words("Black","kululli",R.drawable.color_black,R.raw.color_black))
        colors.add(Words("White", "kelelli",R.drawable.color_white,R.raw.color_white))
        colors.add(Words("Dusty Yellow","ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow))
        colors.add(Words("Mustard Yellow","chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow))

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?  = inflater.inflate(R.layout.fragment_number, container, false)




    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var itemsadapter = WordAdapter1(view.context, R.layout.list_item_view2, colors,R.color.grassgreen )
        val listview: ListView = view.findViewById<ListView>(R.id.listView)//findViewById<ListView>(R.id.listView)
        listview.adapter = itemsadapter

        listview.setOnItemClickListener { parent, view, position, id ->
            val item: Words = colors.get(position)


            mediaplayer = releaseplayer(mediaplayer)

            mediaplayer = MediaPlayer.create(view.context, item.audio)
            mediaplayer?.start()

            mediaplayer?.setOnCompletionListener(MediaPlayer.OnCompletionListener {
                mediaplayer = releaseplayer(mediaplayer)
                Toast.makeText(view.context, "Bhai chal to raha hai ye", Toast.LENGTH_SHORT).show()
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