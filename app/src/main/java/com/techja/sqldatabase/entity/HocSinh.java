package com.techja.sqldatabase.entity;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class HocSinh{
    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "MaHS")
    int maHS;
    @NonNull
    @ColumnInfo(name = "Ten")
    String ten;
    @NonNull
    @ColumnInfo(name = "Tuoi")
    int tuoi;

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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
}
