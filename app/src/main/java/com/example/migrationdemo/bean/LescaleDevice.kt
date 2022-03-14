package com.example.migrationdemo.bean

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * @author hejiadong
 * @date 2022/3/11
 * @description
 */
open class LescaleDevice(
    @PrimaryKey var id: Long = -1,
    var deviceName: String = "",
    var macAddress: String = "",
    var deviceType: Int = 1,  // AppConfig.DeviceType.WL_FAT_F5 -> F5;

    // 其他信息, 非必须
    var sn: String = "", //f5 sn没有，存macAddress
    var branchCode: String = "",
    var softwareVer: String = ""
) : RealmObject()