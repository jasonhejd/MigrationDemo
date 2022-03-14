package com.example.migrationdemo.bean;

import java.util.ArrayList;

/**
 * @author hejiadong
 * @date 2022/3/11
 * @description
 */
public class O2Device {
    private String mRegion;
    private String mModel;
    private String mHardwareVer;
    private String mSoftwareVer;
    private String mSN;
    private String mBootloaderVer;
    private String mCurTIME;
    private String mCurBAT;
    private String mCurBatState;
    private String mCurOxiThr;
    private String mCurMotor;

    private String mCurBuzzer;

    private String mCurPedtar;
    private String mCurMode;
    private String mFileList;
    private byte[] myFiles;
    private String mDeviceName;
    private String mLightStrength = "1";
    private String mLightingMode = "0";
    private String mHeartRateHighThr = "120";
    private String mHeartRateLowThr = "50";
    private String mHeartRateSwitch = "0";
    private String mOxiSwitch;

    private String mFileVer;
    private String mSPCPVer = "1";//区分新旧设备的一个重要属性，1.2以上就是新的设备

    private String mCurState = "1"; //CurState = 2不可升级可获取波形数据,    CurState = 1可升级可获取波形数据  ,    CurState = 0可升级不可以获取波形数据

    private String mBranchCode = "00000000";
    private boolean isInfoUpload = false;
    private String deviceID;

    private String[] mDeviceFiles;
    private ArrayList<String> mFiles;
    private StringBuffer mFileName;

    public String getmHardwareVer() {
        return mHardwareVer;
    }

    public void setmHardwareVer(String mHardwareVer) {
        this.mHardwareVer = mHardwareVer;
    }

    public String getmSoftwareVer() {
        return mSoftwareVer;
    }

    public void setmSoftwareVer(String mSoftwareVer) {
        this.mSoftwareVer = mSoftwareVer;
    }

    public String getmSN() {
        return mSN;
    }

    public void setmSN(String mSN) {
        this.mSN = mSN;
    }

    public String getmBootloaderVer() {
        return mBootloaderVer;
    }

    public void setmBootloaderVer(String mBootloaderVer) {
        this.mBootloaderVer = mBootloaderVer;
    }

    public String getmCurTIME() {
        return mCurTIME;
    }

    public void setmCurTIME(String mCurTIME) {
        this.mCurTIME = mCurTIME;
    }

    public String getmCurBAT() {
        return mCurBAT;
    }

    public void setmCurBAT(String mCurBAT) {
        this.mCurBAT = mCurBAT;
    }

    public String getmCurBatState() {
        return mCurBatState;
    }

    public void setmCurBatState(String mCurBatState) {
        this.mCurBatState = mCurBatState;
    }

    public String getmCurOxiThr() {
        return mCurOxiThr;
    }

    public void setmCurOxiThr(String mCurOxiThr) {
        this.mCurOxiThr = mCurOxiThr;
    }

    public String getmCurMotor() {
        return mCurMotor;
    }

    public void setmCurMotor(String mCurMotor) {
        this.mCurMotor = mCurMotor;
    }

    public String getmCurBuzzer() {
        return mCurBuzzer;
    }

    public void setmCurBuzzer(String mCurBuzzer) {
        this.mCurBuzzer = mCurBuzzer;
    }

    public String getmCurPedtar() {
        return mCurPedtar;
    }

    public void setmCurPedtar(String mCurPedtar) {
        this.mCurPedtar = mCurPedtar;
    }

    public String getmCurMode() {
        return mCurMode;
    }

    public void setmCurMode(String mCurMode) {
        this.mCurMode = mCurMode;
    }

    public String getmFileList() {
        return mFileList;
    }

    public void setmFileList(String mFileList) {
        this.mFileList = mFileList;
    }

    public byte[] getMyFiles() {
        return myFiles;
    }

    public void setMyFiles(byte[] myFiles) {
        this.myFiles = myFiles;
    }

    public String getmDeviceName() {
        return mDeviceName;
    }

    public void setmDeviceName(String mDeviceName) {
        this.mDeviceName = mDeviceName;
    }

    public String getmLightStrength() {
        return mLightStrength;
    }

    public void setmLightStrength(String mLightStrength) {
        this.mLightStrength = mLightStrength;
    }

    public String getmLightingMode() {
        return mLightingMode;
    }

    public void setmLightingMode(String mLightingMode) {
        this.mLightingMode = mLightingMode;
    }

    public String getmHeartRateHighThr() {
        return mHeartRateHighThr;
    }

    public void setmHeartRateHighThr(String mHeartRateHighThr) {
        this.mHeartRateHighThr = mHeartRateHighThr;
    }

    public String getmHeartRateLowThr() {
        return mHeartRateLowThr;
    }

    public void setmHeartRateLowThr(String mHeartRateLowThr) {
        this.mHeartRateLowThr = mHeartRateLowThr;
    }

    public String getmHeartRateSwitch() {
        return mHeartRateSwitch;
    }

    public void setmHeartRateSwitch(String mHeartRateSwitch) {
        this.mHeartRateSwitch = mHeartRateSwitch;
    }

    public String getmOxiSwitch() {
        return mOxiSwitch;
    }

    public void setmOxiSwitch(String mOxiSwitch) {
        this.mOxiSwitch = mOxiSwitch;
    }

    public String getmFileVer() {
        return mFileVer;
    }

    public void setmFileVer(String mFileVer) {
        this.mFileVer = mFileVer;
    }

    public String getmSPCPVer() {
        return mSPCPVer;
    }

    public void setmSPCPVer(String mSPCPVer) {
        this.mSPCPVer = mSPCPVer;
    }

    public String getmCurState() {
        return mCurState;
    }

    public void setmCurState(String mCurState) {
        this.mCurState = mCurState;
    }

    public String getmBranchCode() {
        return mBranchCode;
    }

    public void setmBranchCode(String mBranchCode) {
        this.mBranchCode = mBranchCode;
    }

    public boolean isInfoUpload() {
        return isInfoUpload;
    }

    public void setInfoUpload(boolean infoUpload) {
        isInfoUpload = infoUpload;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String[] getmDeviceFiles() {
        return mDeviceFiles;
    }

    public void setmDeviceFiles(String[] mDeviceFiles) {
        this.mDeviceFiles = mDeviceFiles;
    }

    public ArrayList<String> getmFiles() {
        return mFiles;
    }

    public void setmFiles(ArrayList<String> mFiles) {
        this.mFiles = mFiles;
    }

    public StringBuffer getmFileName() {
        return mFileName;
    }

    public void setmFileName(StringBuffer mFileName) {
        this.mFileName = mFileName;
    }
}
