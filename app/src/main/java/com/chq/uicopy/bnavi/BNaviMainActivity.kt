package com.chq.uicopy.bnavi

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.chq.uicopy.R
import com.chq.uicopy.ext.startActivityToClass
import kotlinx.android.synthetic.main.activity_bnavi_main.*

class BNaviMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bnavi_main)
        btnDesign.setOnClickListener{
            startActivityToClass(BottomNavigationActivity::class.java)
        }
        btnWeChat.setOnClickListener{
            startActivityToClass(WeChatNavigationActivity::class.java)
        }
    }
}
