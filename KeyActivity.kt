package com.demo.adminapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class KeyActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_key)

        val keyInput = findViewById<EditText>(R.id.etKey)
        val btnVerify = findViewById<Button>(R.id.btnVerify)
        val btnGetKey = findViewById<Button>(R.id.btnGetKey)

        btnGetKey.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://t.me/gpay_version")
            startActivity(intent)
        }

        btnVerify.setOnClickListener {
            if (keyInput.text.toString() == "ADMIN-2025") {
                startActivity(Intent(this, DashboardActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Wrong Key", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
