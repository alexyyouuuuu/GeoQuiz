package com.example.geoquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var truebutton: Button
    private lateinit var falsebutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        truebutton = findViewById(R.id.true_button)
        falsebutton = findViewById(R.id.false_button)

        truebutton.setOnClickListener{view: View ->
            Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT).show()

        }
        falsebutton.setOnClickListener{view: View ->
            Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show()
        }
    }
}