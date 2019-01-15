package chatroom.oskar.com.chatroom.view.activities.message

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import butterknife.BindView
import chatroom.oskar.com.chatroom.R
import chatroom.oskar.com.chatroom.service.model.entities.TextMessage
import chatroom.oskar.com.chatroom.viewmodel.MessageVM
import kotlinx.android.synthetic.main.activity_message.*
import java.text.SimpleDateFormat
import java.util.*

class MessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_message)

        recycler_view_message.layoutManager = LinearLayoutManager(this)

        val dataSource = MessageVM()
        recycler_view_message.adapter = MessageAdapter(dataSource.getAllTextMessages())
    }
}
