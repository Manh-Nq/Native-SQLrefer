package com.techja.sqldatabase.manager;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.techja.sqldatabase.entity.Diem;
import com.techja.sqldatabase.entity.HocSinh;
import com.techja.sqldatabase.entity.MonHoc;
import com.techja.sqldatabase.event.HocSinhDAO;

@Database(entities = {Diem.class, HocSinh.class, MonHoc.class}, version = 1)
public abstract class AppDB extends RoomDatabase {
    public abstract HocSinhDAO hocSinhDAO();
}
