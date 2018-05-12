package com.ruiz.cris.button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import android.widget.TextView
import android.widget.Button

class EditText : AppCompatActivity() {


    private lateinit var editText : EditText
    private lateinit var tvResult: TextView
    private lateinit var btnCopy: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        editText = findViewById(R.id.editText)
        tvResult = findViewById(R.id.tv_result)
        btnCopy = findViewById(R.id.btn_copy)

        btnCopy.setOnClickListener({
            tvResult.text = editText.text
        })

        editText.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                tvResult.text = s
            }
        })
    }
}
