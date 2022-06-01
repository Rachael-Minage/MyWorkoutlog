package dev.minage.myworkoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var tvAlready:TextView
    lateinit var tilFirstname: TextInputLayout
    lateinit var  etFirstname: EditText
    lateinit var tilLastname:TextInputLayout
    lateinit var etLastname:EditText
    lateinit var tilEmailTwo:TextInputLayout
    lateinit var  etEmailTwo: EditText
    lateinit var tilPassTwo:TextInputLayout
    lateinit var etPassTwo: EditText
    lateinit var tilConPassword: TextInputLayout
    lateinit var etConPassword: EditText
    lateinit var btnSignupTwo: Button




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        etConPassword = findViewById(R.id.etConPassword)
        tilConPassword = findViewById(R.id.tilConPassword)
        tilPassTwo = findViewById(R.id.tilPassTwo)
        etPassTwo = findViewById(R.id.etPassTwo)
        tilEmailTwo = findViewById(R.id.tilEmailTwo)
        etEmailTwo = findViewById(R.id.etEmailTwo)
        tilLastname = findViewById(R.id.tilLastname)
        etLastname = findViewById(R.id.etLastname)
        tilFirstname = findViewById(R.id.tilFirstname)
        etFirstname = findViewById(R.id.etFirstname)
        tvAlready = findViewById(R.id.tvAlready)
        btnSignupTwo = findViewById(R.id.btnSignupTwo)
        btnSignupTwo.setOnClickListener {
            validateSignUp()
        }
        tvAlready.setOnClickListener {
            val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
        }
    }
    fun validateSignUp(){
        var passwordTwo= etPassTwo.text.toString()
        var emailTwo = etEmailTwo.text.toString()
        var firstName = etFirstname.text.toString()
        var lastName = etLastname.text.toString()
        var confirmation = etConPassword.text.toString()

        if (passwordTwo.isBlank()){
            tilPassTwo.error ="Enter password"
        }
        if (emailTwo.isBlank()){
            tilEmailTwo.error ="Enter email"
        }
        if (firstName.isBlank()){
            tilFirstname.error ="Enter name field"
        }
        if (lastName.isBlank()){
            tilLastname.error ="Enter name field"
        }
        if (confirmation.isBlank()){
            tilConPassword.error ="Please confirm password"
        }
    }
    }
