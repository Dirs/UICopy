package com.chq.uicopy.ext

import android.content.Context
import android.content.Intent

/**
 * Created by CHQ on 2017/12/10.
 */
fun Context.startActivityToClass(activityClass: Class<*>) {
    this.startActivity(Intent(this,activityClass))
}