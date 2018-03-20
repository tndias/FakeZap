package br.com.psoa.fiap.fakezap.fakezap

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import br.com.psoa.fiap.fakezap.fakezap.fragments.ConversasFragment

/**
 * Created by logonrm on 19/03/2018.
 */
class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm){

    val meusFragments = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return meusFragments[position]
    }

    override fun getCount(): Int {
        return meusFragments.size
    }

    fun adicionar(fm: Fragment) {
        meusFragments.add(fm)
    }
}