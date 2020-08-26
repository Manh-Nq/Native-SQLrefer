package com.techja.sqldatabase.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class MonHoc {
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "MaMH")
    String maMH;
    @NonNull
    @ColumnInfo(name = "TenMH")
    String tenMH;
    @NonNull
    @ColumnInfo(name = "SoTinChi")
    int soTinChi;

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public String getTenMH() {
        return tenMH;
    }

    public void setTenMH(String tenMH) {
        this.tenMH = tenMH;
    }

    public int getSoTinChi() {
        return soTinChi;
    }

    public void setSoTinChi(int soTinChi) {
        this.soTinChi = soTinChi;
    }
}
