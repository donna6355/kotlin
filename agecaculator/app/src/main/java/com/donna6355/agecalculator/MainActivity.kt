package com.donna6355.agecalculator

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker: Button = findViewById(R.id.btnDatePicker)

        btnDatePicker.setOnClickListener {
            clickDatePicker()
        }
    }

    fun clickDatePicker() {
        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)
        DatePickerDialog(this,
//          DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth -> //can be shorted as below
            { view, year, month, dayOfMonth ->
                Toast.makeText(this, "DatePicker works", Toast.LENGTH_LONG).show()

            }, year, month, day
        ).show()
    }
}