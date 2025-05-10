package edu.unikom.intentproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class Activity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button = Button(this)
        button.text = "Kirim Balikan"
        button.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("result", "Ini hasil dari Activity6")
            setResult(RESULT_OK, resultIntent)
            finish()
        }
        setContentView(button)
    }
}
