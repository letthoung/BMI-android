package com.example.bmi

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.setBackgroundColor(Color.GREEN)

        resultsTextView.visibility = View.INVISIBLE

        calculateButton.setOnClickListener {
            var weight = weightEditText.text.toString().toDouble();
            var height = heightEditText.text.toString().toDouble();

            var bmi = weight / (weight * height)
            //resultsTextView.text = "BMI: " + String.format("%.2f",bmi)
            //resultsTextView.visibility = View.VISIBLE
        }
    }
}