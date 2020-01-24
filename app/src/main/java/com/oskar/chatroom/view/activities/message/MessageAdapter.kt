package com.oskar.chatroom.view.activities.message

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import com.oskar.chatroom.chatroom.R
import com.oskar.chatroom.service.model.entities.TextMessage

class MessageAdapter(val items: List<TextMessage>) : androidx.recyclerview.widget.RecyclerView.Adapter<MessageViewHolder>() {

    override fun onCreateViewHolder(view: ViewGroup, viewType: Int): MessageViewHolder
            = MessageViewHolder(LayoutInflater.from(view.context).inflate(R.layout.recycler_message, view, false))

    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.body).text = items.get(position).body

    }

}