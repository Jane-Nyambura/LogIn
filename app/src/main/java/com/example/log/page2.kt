package com.example.log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class page2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page2)


        var etEmail = findViewById<EditText>(R.id.etemail)
        var etPass2= findViewById<EditText>(R.id.etpass2)
        var btnsign2=findViewById<Button>(R.id.btnsign2)
        var btnlog=findViewById<Button>(R.id.btnlog)

        btnlog.setOnClickListener {
            val email= etEmail.text.toString()
            if (email.isEmpty()) {
                etEmail.setError("Name is required")

                    }
        }
                btnsign2.setOnClickListener {
                    var intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                }

            }
}
data class Login(
    var Email : String,
    var pass : String,
)
