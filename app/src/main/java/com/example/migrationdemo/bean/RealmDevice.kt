package com.example.migrationdemo.bean

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

/**
 * @author hejiadong
 * @date 2022/3/11
 * @description
 */
open class RealmDevice(
    @PrimaryKey
    var name: String? = null,
    var region: String? = null,
    var model: String? = null,
    var hardwareVer: String? = null,
    var softwareVer: Int = 0,
    var languageVer: Int = 0,
    var curLanguage: String? = null,
    var spcpVer: String? = null,
    var fileVer: String? = null,
    var mode: String? = null,
    var sn: String? = null,
    var branchCode: String? = null
) : RealmObject() {
}