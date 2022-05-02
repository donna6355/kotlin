package com.donna6355.caculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var tvInput: TextView? = null
//    private var buttonOne: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvInput = findViewById(R.id.tvInput)
//        buttonOne = findViewById(R.id.btnOne)
//        buttonOne?.setOnClickListener { tvInput?.append("1")
//        this is common way to set click listener
    }

    fun onDigit(view: View) {
        tvInput?.append((view as Button).text)
    }

    fun onClear(view: View) {
        tvInput?.text = ""
    }
}