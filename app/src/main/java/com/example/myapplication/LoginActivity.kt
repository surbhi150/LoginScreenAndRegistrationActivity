package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginActivity : AppCompatActivity() {
    lateinit var logIn : Button
    lateinit var userName : EditText
    lateinit var etPassword : EditText
    lateinit var register : TextView
    lateinit var forgetPassword : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        logIn = findViewById(R.id.logIn)
        userName = findViewById(R.id.userName)
        etPassword = findViewById(R.id.etPassword)
        register = findViewById(R.id.register)
        forgetPassword = findViewById(R.id.forgotPassword)
        forgetPassword.setOnClickListener{
            var intent = Intent(this,ForgotPasswordActivity::class.java)
            startActivity(intent)
            finish()
        }
        register.setOnClickListener{
            var intent = Intent(this,RegistrationActivity::class.java)
            startActivity(intent)
            finish()
        }

        logIn.setOnClickListener {
            if(userName.text.toString().isNullOrEmpty() )
            {
                userName.error = "enter your username"
            }else if (etPassword.text.toString().isNullOrEmpty())
            {
                etPassword.error = "enter your password"
            }else{
                var intent = Intent(this,WelcomeActivity::class.java)
                startActivity(intent)
                finish()
            }


            }
        }
    }
