package com.techja.sqldatabase.activity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.techja.sqldatabase.R;
import com.techja.sqldatabase.manager.HocSinhManager;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        findViewById(R.id.lay_ds_hs).setOnClickListener(this);
//        HocSinhEntity hs = new HocSinhEntity();
//        hs.setMaHS(191);
//        hs.setTen("quang");
//        hs.setTuoi(22);
//        HocSinhManager.getInstance().themHS(hs);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.lay_ds_hs) {
            HocSinhManager.getInstance().getAllHocSinh();
        }
    }
}
