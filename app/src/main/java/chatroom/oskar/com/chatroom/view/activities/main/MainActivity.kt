package chatroom.oskar.com.chatroom.view.activities.main

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import chatroom.oskar.com.chatroom.R
import chatroom.oskar.com.chatroom.view.activities.message.MessageActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TODO: IMPLEMENT PROPER NAVIGATION
        val intent = Intent(this, MessageActivity::class.java)
        startActivity(intent)

    }
}
