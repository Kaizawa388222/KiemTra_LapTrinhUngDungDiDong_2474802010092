package com.vanlang.kiemtra_laptrinhungdungdidong_2474802010092

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val tvUserEmail = findViewById<TextView>(R.id.tvUserEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)

        // Trích xuất email nhận từ LoginActivity
        val userEmail = intent.getStringExtra("USER_EMAIL")
        tvUserEmail.text = "Email: $userEmail"

        btnLogout.setOnClickListener {
            finish()
        }
    }
}