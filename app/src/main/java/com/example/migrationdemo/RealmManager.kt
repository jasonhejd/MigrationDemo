package com.example.migrationdemo

import com.example.migrationdemo.bean.*
import io.realm.Realm
import io.realm.RealmConfiguration
import io.realm.RealmMigration
import io.realm.annotations.RealmModule
import io.realm.kotlin.executeTransactionAwait
import kotlinx.coroutines.Dispatchers

/**
 * @author hejiadong
 * @date 2022/3/9
 * @description
 */
object RealmManager {
    private const val REALM_NAME = "my_realm"
    private const val SCHEME_VERSION = 1L

    private val migration = RealmMigration { realm, oldVersion, newVersion ->
        var ver = oldVersion
        val scheme = realm.schema

        if (ver == 1L) {
//            scheme.get(Task::class.simpleName!!)

            ver++
        }

        if (ver == 2L) {
//            scheme.get(Task::class.simpleName!!)

            ver++
        }
    }

    private val config = RealmConfiguration.Builder()
        .name(REALM_NAME)
        .schemaVersion(SCHEME_VERSION)
        .modules(MyModule())
//        .migration()
//        .assetFile()
        .build()

    private var realm: Realm? = null

    fun getInstance(): Realm {
        if (realm == null || realm!!.isClosed) {
            realm = Realm.getInstance(config)
        }
        return realm!!
    }

    suspend fun o2Device2NewDeviceInfo(o2Devices: List<O2Device>) {
        val list = o2Devices.map {
            NewDeviceInfo().apply {
                deviceName = it.getmDeviceName()
                // deviceType
                sn = it.getmSN()
                branchCode = it.getmBranchCode()
                hardwareVer = it.getmHardwareVer()
                softwareVer = it.getmSoftwareVer()
                // bluetoothVer
                // mac
            }
        }
        getInstance().executeTransactionAwait(Dispatchers.IO) { r ->
            r.insert(list)
        }
    }

    suspend fun oxySmartDevice2NewDeviceInfo(oxySmartDevices: List<OxySmartDevice>) {
        val list = oxySmartDevices.map {
            NewDeviceInfo().apply {
                deviceName = it.name
                // deviceType
                sn = it.sn
                branchCode = it.branchCode
                hardwareVer = it.hwV
                softwareVer = it.fmV
                bluetoothVer = it.btlV
                // mac
            }
        }
        getInstance().executeTransactionAwait(Dispatchers.IO) { r ->
            r.insert(list)
        }
    }

    suspend fun deviceInfo2NewDeviceInfo(deviceInfos: List<DeviceInfo>) {
        val list = deviceInfos.map {
            NewDeviceInfo().apply {
                deviceName = it.deviceName
                deviceType = it.deviceType
                sn = it.serialNum
                branchCode = it.branchCode
                hardwareVer = it.hwVersion
                softwareVer = it.fwVersion
                // bluetoothVer
            }
        }
        getInstance().executeTransactionAwait(Dispatchers.IO) { r ->
            r.insert(list)
        }
    }

    suspend fun beDevice2NewDeviceInfo(beDevices: List<BeDevice>) {
        val list = beDevices.map {
            NewDeviceInfo().apply {
                deviceName = it.name
                deviceType = it.deviceType
                sn = it.sn
                branchCode = it.branchCode
                hardwareVer = it.hwV
                softwareVer = it.fmV
                bluetoothVer = it.btlV
            }
        }
        getInstance().executeTransactionAwait(Dispatchers.IO) { r ->
            r.insert(list)
        }
    }

    suspend fun lescaleDevice2NewDeviceInfo(lescaleDevices: List<LescaleDevice>) {
        val list = lescaleDevices.map {
            NewDeviceInfo().apply {
                deviceName = it.deviceName
                deviceType = it.deviceType
                sn = it.sn
                branchCode = it.branchCode
                // hardwareVer
                softwareVer = it.softwareVer
                // bluetoothVer
                mac = it.macAddress
            }
        }
        getInstance().executeTransactionAwait(Dispatchers.IO) { r ->
            r.insert(list)
        }
    }
}

@RealmModule(classes = [Task::class])
private class MyModule