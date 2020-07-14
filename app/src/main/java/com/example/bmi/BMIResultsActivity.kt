package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bmiresults.*

class BMIResultsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmiresults)
    }
    override fun onStart() {
        super.onStart()
        val result = intent.extras?.getString("result")
        resultTextView.text = "BMI: " + result;
    }
}