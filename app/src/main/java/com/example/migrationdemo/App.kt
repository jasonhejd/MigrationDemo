package com.example.migrationdemo

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.log.LogLevel
import io.realm.log.RealmLog

/**
 * @author hejiadong
 * @date 2022/3/9
 * @description
 */
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        Realm.init(this) // context, usually an Activity or Application
        RealmLog.setLevel(LogLevel.ALL)
    }
}