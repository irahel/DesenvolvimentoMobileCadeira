package com.example.carlos.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var editText = findViewById<EditText>(R.id.editTextId)
        var button = findViewById<Button>(R.id.buttonId)
        var textView = findViewById<TextView>(R.id.textViewId)

        button.setOnClickListener{
            textView.text = editText.text.toString()
        }
    }
}
