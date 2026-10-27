package com.vanlang.kiemtra_laptrinhungdungdidong_2474802010092

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Ánh xạ View bằng findViewById
        val tvUserEmail = findViewById<TextView>(R.id.tvUserEmail)
        val btnLogout = findViewById<Button>(R.id.btnLogout)
        val lvSkills = findViewById<ListView>(R.id.lvSkills)

        // Nhận email từ LoginActivity
        val userEmail = intent.getStringExtra("USER_EMAIL")
        tvUserEmail.text = "Email: $userEmail"

        // Nút Đăng xuất
        btnLogout.setOnClickListener {
            finish()
        }

        // Danh sách 05 môn học / kỹ năng theo yêu cầu đề bài
        val skillList = arrayOf(
            "Lập trình Kotlin",
            "Thiết kế giao diện XML Layout",
            "Quản lý mã nguồn Git/GitHub",
            "Xử lý Explicit Intent & Bundle",
            "Kiến trúc ứng dụng Android"
        )

        // Thiết lập ArrayAdapter với layout đơn giản mặc định simple_list_item_1
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            skillList
        )
        lvSkills.adapter = adapter

        // Bắt sự kiện khi click vào từng item trong ListView
        lvSkills.setOnItemClickListener { _, _, position, _ ->
            val selectedItem = skillList[position]
            Toast.makeText(this, "Bạn đã chọn: $selectedItem", Toast.LENGTH_SHORT).show()
        }
    }
}