package com.oskar.chatroom.viewmodel

import android.util.Log
import com.oskar.chatroom.service.model.entities.TextMessage
import com.oskar.chatroom.service.model.persistence.RealmDataSource
import io.realm.RealmResults
import java.util.*

class MessageVM {

    val TAG = MessageVM::class.java.simpleName.toString()

    init {
        createTextMessage(textMessage = TextMessage(Random().nextInt(), UUID.randomUUID().toString(), Calendar.getInstance().time, true, true))
    }

    companion object {
        private val dataSource: RealmDataSource = RealmDataSource()
    }

    fun createTextMessage(textMessage: TextMessage) {
        Log.v(TAG,"Creating text message")
        dataSource.open()
        Log.d(TAG, dataSource.toString())
        dataSource.createTextMessage(textMessage)
        dataSource.close()
    }

    fun getAllTextMessages(): RealmResults<TextMessage> {
        dataSource.open()
        val data = dataSource.getAllTextMessages()
        return data
    }
}