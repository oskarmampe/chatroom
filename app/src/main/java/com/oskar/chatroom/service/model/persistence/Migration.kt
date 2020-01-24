package com.oskar.chatroom.service.model.persistence

import io.realm.DynamicRealm
import io.realm.RealmMigration


class Migration : RealmMigration {
    override fun migrate(realm: DynamicRealm?, oldVersion: Long, newVersion: Long) {
        val schema = realm?.schema

        if (oldVersion == 1L){
            //Migrate
//            val textMessageSchema = schema.get("TextMessage")
//            textMessageSchema.addField(TextMessage.NEW_FIELD, Int::class.java)
//                    .transform { obj -> obj.set(TextMessage.NEW_FIELD, val) }
        }

    }

}