package dev.minage.myworkoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {
     lateinit var tvSignUp: TextView
     lateinit var btnLogin: Button
     lateinit var btnSignUp: Button
     lateinit var tilEmail:TextInputLayout
     lateinit var tilPassword:TextInputLayout
     lateinit var etEmail:EditText
     lateinit var etPassword:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        tilEmail = findViewById(R.id.tilEmail)
        tilPassword = findViewById(R.id.tilPassword)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
        tvSignUp= findViewById(R.id.tvSignUp)
        btnLogin= findViewById(R.id.btnLogin)
        btnLogin.setOnClickListener {
            validateLogin()
        }


        tvSignUp.setOnClickListener {
            val intent = Intent(this,SignUpActivity::class.java)
            startActivity(intent)
        }

    }
     fun validateLogin(){
        var email=etEmail.text.toString()
        var password=etPassword.text.toString()
        if (password.isBlank()){
            tilPassword.error ="enter password"
        }
        if (email.isBlank()){
            tilEmail.error = "enter email"
        }
    }
}