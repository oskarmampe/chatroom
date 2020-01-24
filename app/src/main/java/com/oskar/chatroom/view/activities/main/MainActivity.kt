package com.oskar.chatroom.view.activities.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.oskar.chatroom.chatroom.R
import com.oskar.chatroom.view.activities.message.MessageActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: IMPLEMENT PROPER NAVIGATION
        val intent = Intent(this, MessageActivity::class.java)
        startActivity(intent)

    }
}
