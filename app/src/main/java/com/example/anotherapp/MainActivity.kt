package com.example.anotherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.hi_button)
        button.setOnClickListener {
            Log.d("FRAN LOG", "Clicked hi button")
            Toast.makeText(this, "Howdy partner!", Toast.LENGTH_SHORT).show()
        }
    }
}