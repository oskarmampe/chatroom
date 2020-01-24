package com.oskar.chatroom.service.model.persistence

import android.util.Log
import com.oskar.chatroom.service.model.entities.TextMessage
import io.realm.Realm
import io.realm.RealmResults

class RealmDataSource() {

    lateinit var realm: Realm
    val TAG = RealmDataSource::class.java.simpleName

    fun open() {
         realm = Realm.getDefaultInstance()
    }

    fun close() {
        realm.close()
    }

    fun createTextMessage(textMessage: TextMessage) {
        realm.executeTransaction{realmObject ->
            Log.v(TAG, "Executing Transaction")
            realmObject.copyToRealmOrUpdate(textMessage)
        }
    }

    fun getAllTextMessages(): RealmResults<TextMessage> {
        return realm.where(TextMessage::class.java).findAll()
    }


}