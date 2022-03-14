package com.example.migrationdemo.bean

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * @author hejiadong
 * @date 2022/3/11
 * @description
 */
open class OxySmartDevice(
    @PrimaryKey var name: String = "",
    var hwV: String = "", //hardware version
    var fmV: String = "", //firmware version
    var btlV: String = "", // btl version
    var branchCode: String = "",
    var protocolV: String = "", // protocol version
    var sn: String = ""
) : RealmObject() {
}