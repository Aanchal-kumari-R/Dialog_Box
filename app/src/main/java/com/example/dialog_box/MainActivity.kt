package com.example.dialog_box

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnAlert= findViewById<Button>(R.id.btn)
        btnAlert.setOnClickListener {
            val arttDialogBuilder = AlertDialog.Builder(this@MainActivity)
        arttDialogBuilder.setMessage("Are you sure to want exit?")
        arttDialogBuilder.setTitle("Title is Here")
            arttDialogBuilder.setCancelable(false)
            arttDialogBuilder.setPositiveButton("yes"){_,_ ->
                finish()
            }
           arttDialogBuilder.setNegativeButton("No") {_,_ ->
               Toast.makeText(this@MainActivity,"Clicked  No",Toast.LENGTH_LONG).show()
           }
            arttDialogBuilder.setNeutralButton("cancle"){_,_ ->
               Toast.makeText(this@MainActivity,"Clicked cancel",Toast.LENGTH_LONG).show()
            }
            val alertDialogBox=arttDialogBuilder.create()
            alertDialogBox.show()
        }
    }
}