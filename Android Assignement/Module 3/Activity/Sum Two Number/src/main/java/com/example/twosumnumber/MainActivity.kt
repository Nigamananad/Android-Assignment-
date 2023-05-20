package com.example.twosumnumber

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = findViewById<EditText>(R.id.et_num1)
        val num2 = findViewById<EditText>(R.id.et_num2)
        val btn = findViewById<Button>(R.id.btn_sum)

        btn.setOnClickListener {
            val n1 = num1.text.toString().toInt()
            val n2 = num2.text.toString().toInt()

            val sum = n1+n2
            val intent = Intent(this,ShowActivity::class.java)
            intent.putExtra("SHOW",sum)
            startActivity(intent)
        }

    }
}