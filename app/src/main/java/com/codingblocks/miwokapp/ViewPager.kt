package com.codingblocks.miwokapp

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

class ViewPager(supportManager: FragmentManager):FragmentPagerAdapter(supportManager){

   val fragmentlist = ArrayList<Fragment>()
    val titles = ArrayList<String>()



    override fun getCount(): Int {
        return fragmentlist.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentlist[position]
    }
    fun addfrag(fragment: Fragment,title:String)
    {
        fragmentlist.add(fragment)
        titles.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return titles[position]
    }

}