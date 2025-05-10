package edu.unikom.intentproject

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi Activity Result Launcher
        resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == RESULT_OK) {
                val data: Intent? = result.data
                val hasil = data?.getStringExtra("result")
                Toast.makeText(this, hasil, Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.btnActivity1).setOnClickListener {
            startActivity(Intent(this, Activity1::class.java))
        }

        findViewById<Button>(R.id.btnActivity2).setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("extra_name", "John Doe")
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnActivity3).setOnClickListener {
            val person = Person("Jane", 25)
            val intent = Intent(this, Activity3::class.java)
            intent.putExtra("person", person)
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnActivity4).setOnClickListener {
            val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:123456789"))
            startActivity(dialIntent)
        }

        findViewById<Button>(R.id.btnActivity5).setOnClickListener {
            val intent = packageManager.getLaunchIntentForPackage("com.android.chrome")
            if (intent != null) {
                startActivity(intent)
            } else {
                Toast.makeText(this, "Chrome tidak ditemukan", Toast.LENGTH_SHORT).show()
            }
        }

        findViewById<Button>(R.id.btnActivity6).setOnClickListener {
            val intent = Intent(this, Activity6::class.java)
            resultLauncher.launch(intent)
        }
    }
}
