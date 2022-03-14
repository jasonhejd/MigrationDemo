package com.example.migrationdemo.bean

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * @author hejiadong
 * @date 2022/3/11
 * @description
 */
open class NewDeviceInfo(
    @PrimaryKey var deviceName: String = "",
    var deviceType: Int = 0,
    var sn: String = "",
    var branchCode: String = "",
    var hardwareVer: String = "",
    var softwareVer: String = "",
    var bluetoothVer: String = "",
    var mac: String = ""
) : RealmObject()