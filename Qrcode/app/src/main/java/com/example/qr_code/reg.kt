package com.example.qr_code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.qr_code.databinding.ActivityRegBinding


class reg : AppCompatActivity() {
    lateinit var bindingClass: ActivityRegBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityRegBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.gotosigin.setOnClickListener {
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
        }
    }
}