package com.example.log

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var spGender: Spinner
    lateinit var etEmail: EditText
    lateinit var etPhone: EditText
    lateinit var etPass: EditText
    lateinit var btnLogin: Button
    lateinit var btnSignup: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castview()
        onClick()
    }

    fun castview() {

        etName = findViewById(R.id.etName)
        spGender = findViewById(R.id.spGender)
        etEmail = findViewById(R.id.etemail)
        etPhone = findViewById(R.id.etPhone)
        etPass = findViewById(R.id.etPass)
        btnSignup = findViewById(R.id.btnSignup)
        btnLogin = findViewById(R.id.btnLogin)

        var gender = arrayOf("male", "female", "others")
        var genderAdapter = ArrayAdapter(baseContext, android.R.layout.simple_spinner_item, gender)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spGender.adapter = genderAdapter
    }

    fun onClick() {
        btnSignup.setOnClickListener {
            btnSignup.setOnClickListener {
                var name = etName.text.toString()
                if (name.isEmpty()) {
                    etName.setError("Name is required")
                }

            }
            btnLogin.setOnClickListener {
                var intent = Intent(baseContext, page2::class.java)
                startActivity(intent)
            }

        }
    }
}
    data class  Person(
    var etName:String,
    var spGender:String,
    var etEmail: String,
    var etPhone: String,
    var etPass:String
)