package com.chq.uicopy.bnavi

import android.support.v4.view.PagerAdapter
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by CHQ on 2018/1/2.
 */

class SimpleFragmentAdapter(private val count: Int) : PagerAdapter() {

    override fun getCount(): Int {
        return count
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val tv = TextView(container.context)
        tv.text = "" + position
        container.addView(tv)
        return tv
    }

    override fun destroyItem(container: ViewGroup?, position: Int, `object`: Any?) {
        if(`object` is View){
            container?.removeView(`object`)
        }
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
}
