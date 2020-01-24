package com.oskar.chatroom.service.model.entities

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class Group(
        @PrimaryKey open var _ID: Int = 0,
        var name: String = ""
) : RealmObject() {
    fun copy(
        _ID: Int = this._ID,
        name: String = this.name
    ) = Group(_ID, name)
}


open class TextMessage(
        @PrimaryKey open var _ID: Int = 0,
        var body: String = "",
        var timePosted: Date = Calendar.getInstance().time,
        var received: Boolean = false,
        var read: Boolean = false
) : RealmObject() {
    fun copy(
        _ID: Int = this._ID,
        body: String = this.body,
        timePosted: Date = this.timePosted,
        received: Boolean = this.received,
        read: Boolean = this.read
    ) = TextMessage(_ID, body, timePosted, received, read)
}


open class User(
        @PrimaryKey open var _ID: Int = 0,
        var name: String = "",
        var status: String = ""
) : RealmObject() {
    fun copy(
            _ID: Int = this._ID,
            name: String = this.name,
            status: String = this.status
    ) = User(_ID, name, status)
}

open class GroupUsers(
        @PrimaryKey open var _ID: Int = 0,
        open var userID: Int = 0,
        open var groupID: Int = 0
) : RealmObject() {
    fun copy(
            _ID: Int = this._ID,
            userID: Int = this.userID,
            groupID: Int = this.groupID
    ) = GroupUsers(_ID, userID, groupID)
}