package dev.minage.myworkoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.LayoutInflater
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import dev.minage.myworkoutlog.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
  lateinit var binding: ActivitySignUpBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()
    }
    fun castViews(){
        binding.btnSignupTwo.setOnClickListener {
            validateSignUp()
        }
        binding.tvAlready.setOnClickListener {
            val intent=Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
    fun validateSignUp(){
        var passwordTwo= binding.etPassTwo.text.toString()
        var emailTwo = binding.etEmailTwo.text.toString()
        var firstName = binding.etFirstname.text.toString()
        var lastName = binding.etLastname.text.toString()
        var confirmation = binding.etConPassword.text.toString()

        if (passwordTwo.isBlank()){
            binding.tilPassTwo.error ="Enter password"
        }
        if (emailTwo.isBlank()){
            binding.tilEmailTwo.error ="Enter email"
        }
        if (firstName.isBlank()){
            binding.tilFirstname.error ="Enter name field"
        }
        if (lastName.isBlank()){
            binding.tilLastname.error ="Enter name field"
        }
        if (confirmation.isBlank()){
            binding.tilConPassword.error ="Please confirm password"
        }
        if(confirmation!=passwordTwo) {
            binding.tilConPassword.error = "Passwords must match"

        }
//        if (Patterns.EMAIL_ADDRESS.matcher(emailTwo.matches())){
//
//        }
    }
     }

//    fun validatePassword(){
//        var passOne = etPassTwo.text.toString()
//        var conPassword2= etConPassword.text.toString()
//    }
//    if(conPassword2!=passOne) {
//        tilConPassword.error = "Passwords must match"
//    }

