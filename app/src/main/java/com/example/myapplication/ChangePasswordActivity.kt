package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ChangePasswordActivity : AppCompatActivity() {
    lateinit var btnDone : Button
    lateinit var etNewPass : EditText
    lateinit var etConfirmPass : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.change_password)
        btnDone = findViewById(R.id.btnDone)
        etNewPass = findViewById(R.id.etNewPass)
        etConfirmPass = findViewById(R.id.etConfirmPass)
        btnDone.setOnClickListener {
            if(etNewPass.text.toString().isNullOrEmpty()){
                etNewPass.error = "enter password"
            }else if(etNewPass.text.toString().isNullOrEmpty()){
                etNewPass.error = "confirm password"
            }else{
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()}
        }

    }
}