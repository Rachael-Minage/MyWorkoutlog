package dev.minage.myworkoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.minage.myworkoutlog.databinding.ActivityLoginBinding
import dev.minage.myworkoutlog.databinding.ActivitySignUpBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()

    }
        fun castViews() {
            binding.btnLogin.setOnClickListener {
                validateLogin()

            }
            binding.btnLogin.setOnClickListener {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }


            binding.tvSignUp.setOnClickListener {
                val intent = Intent(this, SignUpActivity::class.java)
                startActivity(intent)
            }
        }


     fun validateLogin(){
        var email=binding.etEmail.text.toString()
        var password=binding.etPassword.text.toString()
        if (password.isBlank()){
            binding.tilPassword.error ="enter password"
        }
        if (email.isBlank()){
            binding.tilEmail.error = "enter email"
        }
    }
}