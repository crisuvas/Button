package com.ruiz.cris.button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class SpinnerActivity : AppCompatActivity() {

    private lateinit var option : Spinner
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        option = findViewById(R.id.spinner_option)
        tvResult = findViewById(R.id.tv_result)

        val options = arrayOf("option 1", "option 2", "option 3")

        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                tvResult.text = "Please, select an option"

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                tvResult.text = options[position]
            }

        }
    }
}
