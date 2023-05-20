package com.example.dialogleveladvance

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dialogleveladvance.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onButtonClicked(view: View) {
        when (view.id) {
            R.id.btn_multi_choice_dialog -> {
                showMultiChoiceDialog()
            }
        }
    }

    private fun showMultiChoiceDialog() {
        var cityArray = arrayOf("Surat","Ahmedabad","Vadodara","Rajkot","Junagadh","Navsari")

        var checkedItemList = mutableListOf<String>()

        var builder = AlertDialog.Builder(this)
            .setTitle("Select colors")
            .setMultiChoiceItems(
                cityArray,
                null,
                DialogInterface.OnMultiChoiceClickListener { dialogInterface, index, status ->

                    var city = cityArray[index]

                    if (status) {
                        checkedItemList.add(city)
                    } else {
                        checkedItemList.remove(city)
                    }
//                    Toast.makeText(this, "${checkedItemList.toString()}", Toast.LENGTH_SHORT).show()
                    binding.tvCity.setText(checkedItemList.toString())
                })
        var dialog = builder.create()
        dialog.show()

    }
}