package com.donna6355.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById(R.id.btnStart)
        val nameInput: EditText = findViewById(R.id.nameInput)

        btnStart.setOnClickListener {
            if (nameInput.text.isEmpty()) {
                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()
            } else {
                val intent: Intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish() // finish this activity and cannot come back here
            }
        }
    }
}