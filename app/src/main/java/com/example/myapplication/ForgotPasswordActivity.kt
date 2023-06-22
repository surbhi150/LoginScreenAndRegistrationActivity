package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ForgetPasswordActivity : AppCompatActivity() {
    lateinit var getOTP : Button
    lateinit var email : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        getOTP = findViewById(R.id.btnGetOTP)
        getOTP.setOnClickListener {
            if(email.text.toString().isNullOrEmpty() )
            {
                email.error = "enter your Email"
            }else{
                var intent = Intent(this,getOTP::class.java)
                startActivity(intent)
                finish()}


        }
    }
}