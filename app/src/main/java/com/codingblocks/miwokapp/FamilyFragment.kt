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

class FamilyFragment : Fragment() {

    var mediaplayer: MediaPlayer? = null
    val members = arrayListOf<Words>()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View?  = inflater.inflate(R.layout.fragment_number, container, false)



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        var itemsadapter = WordAdapter1(view.context, R.layout.list_item_view2, members, R.color.manu)
        val listview: ListView = view.findViewById<ListView>(R.id.listView)//findViewById<ListView>(R.id.listView)
        listview.adapter = itemsadapter
        listview.setOnItemClickListener { parent, view, position, id ->
            val item: Words = members.get(position)


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