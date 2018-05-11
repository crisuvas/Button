package com.ruiz.cris.button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.TextView

class TextView : AppCompatActivity() {

    private lateinit var txtView : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_view)

        txtView = findViewById(R.id.textView)
        txtView.text = "I don't know if this is ok, but I want to eat and instead I'm programming to try to be better and can have a good job even if i don't do my real profession"
        txtView.setSingleLine()
        txtView.ellipsize = TextUtils.TruncateAt.MARQUEE
        txtView.marqueeRepeatLimit = -1
        txtView.isSelected = true

    }
}
