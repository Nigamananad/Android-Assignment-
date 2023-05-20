package com.example.persondetailshow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.persondetailshow.databinding.ActivityShowBinding

class ShowActivity : AppCompatActivity() {
    lateinit var binding: ActivityShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var show = intent.getParcelableExtra<PersonDetail>("USER")

        binding.tvName.text = "Name: ${show!!.name}"
        binding.tvAge.text = "Age: ${show.age}"
        binding.tvEmail.text = "Email: ${show.email}"
        binding.tvBirthDate.text = "D.O.B: ${show.birthDate}"
    }
}