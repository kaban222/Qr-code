package com.example.qr_code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.qr_code.databinding.ActivityRegBinding
import com.example.qr_code.db.MyDbManeger

class reg : AppCompatActivity() {
    lateinit var bindingClass: ActivityRegBinding

    val myDbManeger = MyDbManeger(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityRegBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)

        bindingClass.gotosigin.setOnClickListener {
            val intent = Intent(this, signin::class.java)
            startActivity(intent)
        }
    }

    fun login(view: View) {
        bindingClass.textView4.text = ""
        myDbManeger.openDb()
        myDbManeger.insertToDo(bindingClass.name1.text.toString(), bindingClass.pass1.text.toString())
        val dataList = myDbManeger.readDbData()
        for (item in dataList) {
            bindingClass.textView4.append(item)
            bindingClass.textView4.append("\n")
        }

    }
    override fun onDestroy() {
        super.onDestroy()
        myDbManeger.closeDb()
    }
}