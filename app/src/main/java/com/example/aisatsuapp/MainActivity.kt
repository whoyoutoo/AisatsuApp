package com.example.aisatsuapp

import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.button3) {
            showTimePickerDialog()
        }
    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                if (2 <= hour && hour < 10) {
                    textView.text = "「おはよう」"
                } else if (10 <= hour && hour < 18) {
                    textView.text = "「こんにちは」"
                } else if (18 <= hour && hour < 26) {
                    textView.text = "「こんばんは」"
                }
            },
            13, 0, true)
        timePickerDialog.show()
    }

}