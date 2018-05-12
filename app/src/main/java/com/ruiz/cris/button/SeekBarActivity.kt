package com.ruiz.cris.button

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView

class SeekBarActivity : AppCompatActivity() {

    private lateinit var sbSeek : SeekBar
    private lateinit var tvSeek: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        sbSeek = findViewById(R.id.sb_seek)
        tvSeek = findViewById(R.id.tv_seel)

        sbSeek.max = 50

        sbSeek.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                tvSeek.text = "Seeking to:" + progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                tvSeek.text = "Started at:" + seekBar.progress
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                tvSeek.text = "Selected: " + seekBar.progress
            }

        })
    }
}
