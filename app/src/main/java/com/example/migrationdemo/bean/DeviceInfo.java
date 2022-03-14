package com.example.migrationdemo.bean;

import io.realm.RealmObject;
import io.realm.annotations.Index;
import io.realm.annotations.PrimaryKey;
import io.realm.annotations.Required;

/**
 * @author hejiadong
 * @date 2022/3/11
 * @description
 */
public class DeviceInfo extends RealmObject {
    @PrimaryKey
    private int id;
    @Required
    private String deviceName;
    @Required
    private String deviceMacAddress;
    @Index
    private String productTypeName;

    private String hwVersion;
    private String fwVersion;
    private String blVersion;
    private String branchCode;
    private int deviceType;
    private String protocolVersion;
//    private DeviceTime currentTime;
    private int protocolDataMaxLen;
    private byte snLength;
    private String serialNum;

    private byte[] data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceMacAddress() {
        return deviceMacAddress;
    }

    public void setDeviceMacAddress(String deviceMacAddress) {
        this.deviceMacAddress = deviceMacAddress;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getHwVersion() {
        return hwVersion;
    }

    public void setHwVersion(String hwVersion) {
        this.hwVersion = hwVersion;
    }

    public String getFwVersion() {
        return fwVersion;
    }

    public void setFwVersion(String fwVersion) {
        this.fwVersion = fwVersion;
    }

    public String getBlVersion() {
        return blVersion;
    }

    public void setBlVersion(String blVersion) {
        this.blVersion = blVersion;
    }

    public String getBranchCode() {
        return branchCode;
    }

    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public int getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(int deviceType) {
        this.deviceType = deviceType;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }

    public void setProtocolVersion(String protocolVersion) {
        this.protocolVersion = protocolVersion;
    }

    public int getProtocolDataMaxLen() {
        return protocolDataMaxLen;
    }

    public void setProtocolDataMaxLen(int protocolDataMaxLen) {
        this.protocolDataMaxLen = protocolDataMaxLen;
    }

    public byte getSnLength() {
        return snLength;
    }

    public void setSnLength(byte snLength) {
        this.snLength = snLength;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
