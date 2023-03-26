package com.example.qr_code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qr_code.databinding.ActivityRegBinding
import com.example.qr_code.databinding.ActivitySigninBinding

class signin : AppCompatActivity() {
    lateinit var bindingClass: ActivitySigninBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.gotologin.setOnClickListener {
            val intent = Intent(this, reg::class.java)
            startActivity(intent)
        }
    }
}