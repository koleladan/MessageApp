package com.kolela.messageapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kolela.messageapplication.R
import com.kolela.messageapplication.databinding.ActivityUserListBinding

class UserListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUserListBinding.inflate(layoutInflater)
        setContentView(binding.root)


        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }
}