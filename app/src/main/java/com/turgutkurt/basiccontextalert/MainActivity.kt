package com.turgutkurt.basiccontextalert

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.turgutkurt.basiccontextalert.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Toast.makeText(this@MainActivity,"Welcome",Toast.LENGTH_LONG).show()
        binding.button2.setOnClickListener(object:View.OnClickListener{
            override fun onClick(v: View?) {
                Toast.makeText(this@MainActivity,"selam",Toast.LENGTH_LONG).show()
            }

        })
    }

    fun handleSave(view:View){
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Save")
        alert.setMessage("Are You Sure ?")
        alert.setPositiveButton("Yes"){dialog,which ->
            Toast.makeText(this,"Saved",Toast.LENGTH_LONG).show()
        }
        alert.setNegativeButton("No"){dialog,which ->
            Toast.makeText(applicationContext,"Not saved!",Toast.LENGTH_LONG).show()
        }
        alert.show()
    }
}