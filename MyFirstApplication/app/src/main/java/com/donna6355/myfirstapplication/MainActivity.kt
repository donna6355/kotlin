package com.donna6355.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.myButton)
        val mainText = findViewById<TextView>(R.id.mainText)
        var timesClicked = 0
        btnClickMe.setOnClickListener{
            timesClicked +=1
            mainText.text = "It has been clicked $timesClicked times"
            Toast.makeText(this, "Hey, I am a toast!",Toast.LENGTH_LONG).show()
        }
    }
}