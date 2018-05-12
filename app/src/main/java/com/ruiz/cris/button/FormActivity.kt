package com.ruiz.cris.button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class FormActivity : AppCompatActivity() {

    private lateinit var rgGender: RadioGroup
    private lateinit var rbMale: RadioButton
    private lateinit var rbFemale: RadioButton

    private lateinit var cbEnglish: CheckBox
    private lateinit var cbSpanish: CheckBox
    private lateinit var cbFrench: CheckBox

    private lateinit var btnSubmit: Button
    private lateinit var tvResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        rgGender = findViewById(R.id.rg_gender)
        rbMale = findViewById(R.id.rb_male)
        rbFemale = findViewById(R.id.rb_female)

        cbEnglish = findViewById(R.id.cb_english)
        cbSpanish = findViewById(R.id.cb_spanish)
        cbFrench = findViewById(R.id.cb_french)

        btnSubmit = findViewById(R.id.btn_submit)
        tvResult = findViewById(R.id.tv_result)

        btnSubmit.setOnClickListener({

            var result = ""

            if(rgGender.checkedRadioButtonId != -1){
                result += "Selected gender: "

                if(rbMale.isChecked){
                    result+= "Male \n"
                }else if(rbFemale.isChecked){
                    result += "Female \n"
                }

            }
            result += "Language known:"
            if(cbEnglish.isChecked) {
                result += "\n English"
            }
            if(cbSpanish.isChecked){
                result += "\n Spanish"
            }
            if(cbFrench.isChecked){
                result += "\n French"
            }

            tvResult.text = result
        })
    }
}
