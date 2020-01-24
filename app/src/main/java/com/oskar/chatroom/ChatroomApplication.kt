package com.oskar.chatroom

import android.app.Application
import android.util.Log
import com.oskar.chatroom.service.model.persistence.Migration
//import com.facebook.stetho.Stetho
//import com.uphyca.stetho_realm.RealmInspectorModulesProvider
import io.realm.Realm
import io.realm.RealmConfiguration

class ChatroomApplication : Application() {

    companion object {
        const val SCHEMA_VERSION: Long = 1
    }




    @Override
    override fun onCreate() {
        super.onCreate()

        Log.v("Application","Triggered")

        Realm.init(this)

//        Stetho.initialize(
//                Stetho.newInitializerBuilder(this)
//                        .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
//                        .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
//                        .build()
//        )

        val configuration = RealmConfiguration.Builder()
                .schemaVersion(SCHEMA_VERSION)
                .migration(Migration())
                .name("chatroom.realm")
                .build()

        Realm.setDefaultConfiguration(configuration)
    }

}