package com.example.migrationdemo.bean

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * @author hejiadong
 * @date 2022/3/11
 * @description
 */
open class BeDevice(
    @PrimaryKey
    var name: String = "",
    var hwV: String = "", //hardware version
    var fmV: String = "", //firmware version
    var btlV: String = "", // btl version
    var branchCode: String = "",
    var deviceType: Int = 0,
    var protocolV: String = "", // protocol version
    var curTime: Long = 0,
    var protocolMaxLen: Int = 0, //protocol support max length
    var snLen: Int = 0,
    var sn: String = ""
) : RealmObject() {
}