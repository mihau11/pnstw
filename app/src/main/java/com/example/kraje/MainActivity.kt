package com.example.kraje

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val autotextView = findViewById<AutoCompleteTextView>(R.id.tekst)
        val kraje =  resources.getStringArray(R.array.krj)
        val arrayAdapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, kraje)
        autotextView.setAdapter(arrayAdapter)
    }
}