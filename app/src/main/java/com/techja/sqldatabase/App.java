package com.techja.sqldatabase;

import android.app.Application;

import androidx.room.Room;

import com.techja.sqldatabase.manager.AppDB;

public class App extends Application {
    private static App instance;
    private AppDB appDB;

    public AppDB getAppDB() {
        return appDB;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        appDB = Room.databaseBuilder(this, AppDB.class, "hoc-sinh").createFromAsset("databases/test.db")
                .build();

    }

    public static App getInstance() {
        return instance;

    }
}
