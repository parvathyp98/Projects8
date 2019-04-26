package com.jackfruitapps.handwriter

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.DisplayMetrics

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val paintView=findViewById<PaintView>(R.id.paintView)
        val matrix=DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(matrix)
        paintView.init(matrix)
    }
}
