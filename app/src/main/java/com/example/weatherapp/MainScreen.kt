package com.example.weatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainScreen : AppCompatActivity() {
    private lateinit var temperatureArray : Array<Double>
    private lateinit var weatherConditionArray: Array<String>
    val averageTemperatureView = findViewById<TextView>(R.id.AverageTemperature)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)



        val exitButton = findViewById<Button>(R.id.EXIT)
        val nextButton = findViewById<Button>(R.id.NEXT)
        val input = findViewById<EditText>(R.id.input)
        val clearbutton = findViewById<Button>(R.id.CLEAR)

        temperatureArray = Array(7) { 0.0 }
        weatherConditionArray = Array(7) {""}

        nextButton.setOnClickListener {
            val intent = Intent(this, DetailedViewScreen::class.java)
            startActivity(intent)
        }

        exitButton.setOnClickListener {
            finish()
        }

        clearbutton.setOnClickListener {
            input.setText("")
            temperatureArray = Array(7) { 0.0 }
            weatherConditionArray = Array(7) {""}
            averageTemperatureView.text = "Average temperature: N/A"
        }

        input.setOnEditorActionListener { _, _, _ ->
            val inputString = input.text.toString()
            if (inputString.isNotEmpty()) {
                val inputArray = inputString.split(",")
                if (inputArray.size == 7) {
                    for (i in 0..6) {
                        temperatureArray[i] = inputArray[i].toDouble()
                        weatherConditionArray[i] = "Sunny"
                    }
                    calculateAverageTemperature(averageTemperatureView)
                } else {
                    showError("Invlaid input Please enter 7 values seperated by commas.")
                }
            } else {
                showError("Please enter the weekly weather data")
            }
            true
        }
    }
        private fun calculateAverageTemperature(averageTemperature: TextView) {
        var sum = 0.0
        for (temperature in temperatureArray) {
            sum += temperature
        }
        val averageTemperature = sum/7
        averageTemperatureView.text = "Average temperature: $averageTemperature°C"
    }

    private fun showError(message: String) {
        val alertDialog = AlertDialog.Builder(this)
        alertDialog.setTitle("Error")
        alertDialog.setMessage(message)
        alertDialog.setPositiveButton("OK") { _,_ ->
        }
        alertDialog.show()
    }
}