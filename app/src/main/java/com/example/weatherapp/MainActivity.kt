package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Declaring Variables
        val startbutton = findViewById<Button>(R.id.start)
        val BackButton = findViewById<Button>(R.id.back)


        startbutton.setOnClickListener {

            val intent = Intent(this, MainScreen::class.java)
            //start the activity
            startActivity(intent)
        }

        BackButton.setOnClickListener {
            finish()
        }
    }
}