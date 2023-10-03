package com.kolela.messageapplication.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kolela.messageapplication.R
import com.kolela.messageapplication.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }

        binding.signin.setOnClickListener {
            val username = binding.edtemail.text.toString().trim()
            val password = binding.edtpassword.text.toString().trim()


            if (!username.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+".toRegex())) {
                binding.edtemail.error = "Enter valid email!"
            }
            else if (password.isEmpty()) {
                binding.edtpassword.error = "kindly enter password"
            }
            else {
                startActivity(Intent(this@SignInActivity, UserListActivity::class.java)
                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
            }


        }
        binding.account1.setOnClickListener {
            startActivity(Intent(this@SignInActivity, SignUpActivity::class.java)
                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP))
        }
    }
}