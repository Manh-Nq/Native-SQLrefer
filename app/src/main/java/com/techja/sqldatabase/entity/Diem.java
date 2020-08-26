package com.techja.sqldatabase.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(primaryKeys = {"MaHS", "MaMH"})
public class Diem {
    @NonNull
    @ColumnInfo(name = "MaHS")
    int maHS;
    @NonNull
    @ColumnInfo(name = "MaMH")
    String maMH;
    @NonNull
    @ColumnInfo(name = "Diem")
    int diem;

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public String getMaMH() {
        return maMH;
    }

    public void setMaMH(String maMH) {
        this.maMH = maMH;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
}
