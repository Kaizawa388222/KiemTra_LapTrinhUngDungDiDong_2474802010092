package com.vanlang.kiemtra_laptrinhungdungdidong_2474802010092

import android.graphics.Color
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Ánh xạ bằng findViewById theo đúng quy định đề bài
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)

        btnLogin.setOnClickListener {
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()

            if (email.isEmpty() || password.isEmpty()) {
                tvStatus.text = "Vui lòng nhập đầy đủ Email và Mật khẩu!"
                tvStatus.setTextColor(Color.RED)
            } else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                tvStatus.text = "Định dạng Email không hợp lệ!"
                tvStatus.setTextColor(Color.RED)
            } else if (password.length < 6) {
                tvStatus.text = "Mật khẩu phải có ít nhất 6 ký tự!"
                tvStatus.setTextColor(Color.RED)
            } else {
                tvStatus.text = "Validation Successful!"
                tvStatus.setTextColor(Color.GREEN)
            }
        }
    }
}