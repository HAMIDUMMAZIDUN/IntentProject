package edu.unikom.intentproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val name = intent.getStringExtra("extra_name")
        val textView = TextView(this)
        textView.text = "Received name: $name"
        setContentView(textView)
    }
}
