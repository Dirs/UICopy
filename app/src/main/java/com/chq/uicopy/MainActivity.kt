package com.chq.uicopy

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.chq.uicopy.bnavi.BNaviMainActivity
import com.chq.uicopy.bnavi.BottomNavigationActivity
import com.chq.uicopy.ext.startActivityToClass

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btnBottomNavigation->{
                startActivityToClass(BNaviMainActivity::class.java)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
    }

}
