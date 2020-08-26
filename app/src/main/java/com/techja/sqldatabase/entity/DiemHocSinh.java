package com.techja.sqldatabase.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;

@Entity
public class DiemHocSinh {

    @ColumnInfo(name = "MaHS")
    public int maHS;
    @ColumnInfo(name = "Ten")
    public String ten;
    @ColumnInfo(name = "MaMH")
    public String maMH;
    @ColumnInfo(name = "TenMH")
    public String tenMH;
    @ColumnInfo(name = "SoTinChi")
    public int soTinChi;
    @ColumnInfo(name = "Diem")
    public int diem;

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

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

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }

    @Override
    public String toString() {
        return "diemHocSinh{" +
                "maHS=" + maHS +
                ", ten='" + ten + '\'' +
                ", maMH='" + maMH + '\'' +
                ", tenMH='" + tenMH + '\'' +
                ", soTinChi=" + soTinChi +
                ", diem=" + diem +
                '}';
    }
}
