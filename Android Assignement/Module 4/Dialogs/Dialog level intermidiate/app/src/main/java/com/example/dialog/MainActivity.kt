package com.example.dialog

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.dialog.databinding.ActivityMainBinding
import kotlinx.coroutines.NonCancellable.cancel

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

    fun onButtonClicked(view: View) {
        when (view.id) {
            R.id.btn_dialog -> {
                showAlertDialog()
            }

            R.id.btn_positive -> {
                showAlertPosetive()
            }
            R.id.btn_single_choice_selection->{
                showSingleChoiceDialog()
            }
        }
    }

    private fun showSingleChoiceDialog() {
        var cityArray = arrayOf("Surat" , "Ahmedabad", "Vadodara", "Rajkot", "Navsari")

        var builder = AlertDialog.Builder(this)
            .setTitle("City")
            .setItems(cityArray, DialogInterface.OnClickListener { dialogInterface, index ->
                //Toast.makeText(this, "$index", Toast.LENGTH_SHORT).show()
                var city = cityArray[index]
                binding.tvCity.setText(city)
            })


        var dialog = builder.create()
        dialog.show()

    }

    private fun showAlertPosetive() {
        var builder = AlertDialog.Builder(this)
            .setTitle("Alert Box")
            .setMessage("are you sure you want to exit from this application?")
            .setIcon(R.drawable.baseline_warning_24)
            .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Yes Clicked", Toast.LENGTH_SHORT).show()
            })
            .setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "No Clicked", Toast.LENGTH_SHORT).show()

            })
            .setNeutralButton("Neutral", DialogInterface.OnClickListener { dialogInterface, i ->
                Toast.makeText(this, "Neutral Clicked", Toast.LENGTH_SHORT).show()
            })

        var dialog = builder.create()
        dialog.show()
    }

    private fun showAlertDialog() {
        var builder = AlertDialog.Builder(this)
            .setTitle("Alert Box")
            .setMessage("are you sure you want to exit from this application?")
            .setIcon(R.drawable.baseline_warning_24)
            .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                // this block is execute when user click on logout button
               // finish()
            }).setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                // this block is execute when user click on cancel button
            })

        var dialog = builder.create()
        dialog.show()
    }

    override fun onBackPressed() {

        var builder = AlertDialog.Builder(this)
            .setTitle("Alert Box")
            .setMessage("are you sure you want to exit from this application?")
            .setIcon(R.drawable.baseline_warning_24)
            .setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                // this block is execute when user click on logout button
                finish()
            }).setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                // this block is execute when user click on cancel button
               cancel()
            })
        var dialog = builder.create()
        dialog.show()
    }
}