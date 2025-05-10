package edu.unikom.intentproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class Activity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = "Ini Activity 1"
        setContentView(textView)
    }
}
