package com.oskar.chatroom.view.activities.message

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.oskar.chatroom.chatroom.R
import com.oskar.chatroom.viewmodel.MessageVM
import kotlinx.android.synthetic.main.activity_message.*

class MessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        recycler_view_message.layoutManager = androidx.recyclerview.widget.LinearLayoutManager(this)

        val dataSource = MessageVM()
        recycler_view_message.adapter = MessageAdapter(dataSource.getAllTextMessages())
    }
}
