package com.ruiz.cris.button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ButtonActivity : AppCompatActivity() {

    lateinit var btnClick: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        btnClick = findViewById(R.id.button)

        btnClick.setOnClickListener({
            btnClick.text= "Clicked"
        })

        btnClick.setOnLongClickListener({
            btnClick.text = "Long Clicked"
            //false it's only during the time you're pushing it
            true //it lasts even when you're not pushing the button
        })

    }
}
