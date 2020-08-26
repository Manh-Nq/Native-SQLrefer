package com.techja.sqldatabase.event;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.techja.sqldatabase.entity.DiemHocSinh;
import com.techja.sqldatabase.entity.HocSinh;
import com.techja.sqldatabase.entity.MonHoc;

import java.util.List;

@Dao
public interface HocSinhDAO {

    @Query("SELECT * FROM HocSinh")
    List<HocSinh> getALLHocSinh();


    @Query("SELECT * FROM MonHoc")
    List<MonHoc> getAllMonHoc();


    @Query("SELECT HocSinh.MaHS, HocSinh.ten, HocSinh.tuoi,MonHoc.tenMH, SoTinChi,Diem.diem " +
            "FROM HocSinh" +
            " INNER JOIN diem ON HocSinh.MaHS = Diem.MaHS" +
            "  INNER JOIN MonHoc ON monhoc.MaMH = Diem.MaMH" +
            " WHERE HocSinh.MaHS = :MaHS")
    DiemHocSinh getAllDiemHS(String MaHS);



    @Insert
    void themHS(HocSinh... hs);
}
