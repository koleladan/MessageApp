package com.kolela.messageapplication.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kolela.messageapplication.R
import com.kolela.messageapplication.databinding.ActivityChatsBinding

class ChatsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityChatsBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityChatsBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        if (supportActionBar != null) {
            supportActionBar!!.hide()
        }
    }
}