package com.codessasins.healthapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.homescreen.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.homescreen)
        val intent = intent
        val receivedEmail = intent.getStringExtra("emailAddress")
        textViewWelcome.text="Welcome "+receivedEmail
    }
}
