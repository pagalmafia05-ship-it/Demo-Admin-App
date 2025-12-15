package com.demo.adminapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val user = findViewById<EditText>(R.id.etUser)
        val pass = findViewById<EditText>(R.id.etPass)
        val btn = findViewById<Button>(R.id.btnLogin)

        btn.setOnClickListener {
            if (user.text.toString() == "admin" && pass.text.toString() == "1234") {
                startActivity(Intent(this, KeyActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Invalid Login", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
