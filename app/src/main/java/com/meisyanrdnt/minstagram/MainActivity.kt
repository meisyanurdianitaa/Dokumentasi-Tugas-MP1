package com.meisyanrdnt.minstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lbl_jml_pengikut = findViewById<TextView>(R.id.lbl_jml_pengikut)
        val btn_follow = findViewById<Button>(R.id.lbl_ikuti)

        btn_follow.setOnClickListener{
            lbl_jml_pengikut.text = "3.551"
            btn_follow.text = "mengikuti"



        }
    }
}