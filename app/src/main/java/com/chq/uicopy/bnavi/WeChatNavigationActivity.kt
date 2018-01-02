package com.chq.uicopy.bnavi

import android.media.audiofx.BassBoost
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.util.Log
import android.widget.RadioButton
import android.widget.RadioGroup
import com.chq.uicopy.R
import kotlinx.android.synthetic.main.activity_we_chat_navigation.*

class WeChatNavigationActivity : AppCompatActivity() {

    var selectedRadio:RadioButton?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_we_chat_navigation)
        viewPager.adapter = SimpleFragmentAdapter(4)
        rgRadioGroup.setOnCheckedChangeListener { radioGroup: RadioGroup, i: Int ->
            selectedRadio?.alpha = 0f
            when (i) {
                R.id.rbWechat -> {
                    selectedRadio = rbWechat
                    viewPager.currentItem = 0
                }
                R.id.rbContacts -> {
                    selectedRadio = rbContacts
                    viewPager.currentItem = 1
                }
                R.id.rbDiscover -> {
                    selectedRadio = rbDiscover
                    viewPager.currentItem = 2
                }
                R.id.rbMe -> {
                    selectedRadio = rbMe
                    viewPager.currentItem = 3
                }
            }
            selectedRadio?.alpha = 1f
        }
        rgRadioGroup.check(R.id.rbWechat)
        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrollStateChanged(state: Int) {
            }

            override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
                Log.d("onPageScrolled", "$position,$positionOffset,$positionOffsetPixels")
                if(positionOffset == 0f || position == rgRadioGroup.childCount - 1){
                    return
                }
                rgRadioGroup.getChildAt(position).alpha = 1 - positionOffset
                rgRadioGroup.getChildAt(position + 1).alpha = positionOffset
            }

            override fun onPageSelected(position: Int) {
                val radioButton = rgRadioGroup.getChildAt(position) as RadioButton
                radioButton.isChecked = true
            }

        })
    }
}
