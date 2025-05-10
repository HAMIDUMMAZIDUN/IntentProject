package edu.unikom.intentproject

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class Activity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val person = intent.getSerializableExtra("person") as? Person
        val textView = TextView(this)
        textView.text = "Nama: ${person?.name}, Umur: ${person?.age}"
        setContentView(textView)
    }
}
