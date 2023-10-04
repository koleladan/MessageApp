package com.kolela.messageapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kolela.messageapplication.R
import com.kolela.messageapplication.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding:ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }


        binding.signup.setOnClickListener {
            val fname = binding.firstname.text.toString().trim()
            val lname = binding.lastname.text.toString().trim()
            val username = binding.edtemail.text.toString().trim()
            val password = binding.edtpassword.text.toString().trim()


            if (fname.isEmpty()) {
                binding.firstname.error = "Kindly enter the firstname"
            }
            else if (lname.isEmpty()) {
                binding.lastname.error = "kindly enter the lastname"
            }
            else if (!username.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+".toRegex())) {
                binding.edtemail.error = "Enter valid email!"
            }
            else if (password.isEmpty()) {
                binding.edtpassword.error = "kindly enter password"

            }
            else {
                startActivity(Intent(this@SignUpActivity, UserListActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
            }


        }


        binding.account.setOnClickListener {
            startActivity(Intent(this@SignUpActivity, SignInActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }


    }



}