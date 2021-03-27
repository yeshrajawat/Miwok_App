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

class PhrasesFragment : Fragment() {
    var mediaplayer: MediaPlayer? = null

    val phrases = arrayListOf<Words>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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

    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?  =  inflater.inflate(R.layout.fragment_number, container, false)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        var itemsadapter = WordAdapter1(view.context, R.layout.list_item_view2, phrases, R.color.manci)
        val listview: ListView = view.findViewById<ListView>(R.id.listView)//findViewById<ListView>(R.id.listView)
        listview.adapter = itemsadapter
        listview.setOnItemClickListener { parent, view, position, id ->
            val item: Words = phrases.get(position)


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