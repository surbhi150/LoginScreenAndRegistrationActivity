package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class getOTP : AppCompatActivity() {
    lateinit var etOTP : EditText
    lateinit var btnOk : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_get_otp)
        etOTP = findViewById(R.id.etOTP)
        btnOk = findViewById(R.id.btnOk)
        btnOk.setOnClickListener {
            if(etOTP.text.toString().isNullOrEmpty())
                etOTP.error = "Invalid OTP"
            else{
                var intent = Intent(this,ChangePasswordActivity::class.java)
                startActivity(intent)
                finish()}

        }
    }
}