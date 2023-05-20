package com.example.persondetailshow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.persondetailshow.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnShow.setOnClickListener {
            val name = binding.etName.text.toString().trim()
            val age = binding.etAge.text.toString().trim()
            val email = binding.etEmail.text.toString().trim()
            val birthDate = binding.etBirthDay.text.toString().trim()

            var user = PersonDetail(name, age, email, birthDate)

            val intent = Intent(this,ShowActivity::class.java)
            intent.putExtra("USER",user)
            startActivity(intent)
        }

    }
}
