package chatroom.oskar.com.chatroom.view.activities.message

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.TextView
import chatroom.oskar.com.chatroom.R
import chatroom.oskar.com.chatroom.service.model.entities.TextMessage
import kotlinx.android.synthetic.main.activity_message.*
import java.util.zip.Inflater

class MessageAdapter(val items: List<TextMessage>) : RecyclerView.Adapter<MessageViewHolder>() {

    override fun onCreateViewHolder(view: ViewGroup, viewType: Int): MessageViewHolder
            = MessageViewHolder(LayoutInflater.from(view.context).inflate(R.layout.recycler_message, view, false))

    override fun getItemCount(): Int = items.size


    override fun onBindViewHolder(holder: MessageViewHolder, position: Int) {
        holder.itemView.findViewById<TextView>(R.id.body).text = items.get(position).body

    }

}