package com.techja.sqldatabase.manager;

import android.widget.Toast;

import com.techja.sqldatabase.App;
import com.techja.sqldatabase.entity.DiemHocSinh;
import com.techja.sqldatabase.entity.HocSinh;
import com.techja.sqldatabase.utils.MTask;

import java.util.List;

public class HocSinhManager implements MTask.OnMTaskCallBack {
    private static final String KEY_HS = "KEY_HS";
    private static final String KEY_GETALL_HS = "KEY_GETALL_HS";
    private static final String KEY_GET_HS = "KEY_GET_HS";
    private static HocSinhManager instance;
    private MTask mTask1, mTask2, mTask3;


    private HocSinhManager() {

    }

    public static HocSinhManager getInstance() {
        if (instance == null) {
            instance = new HocSinhManager();
        }
        return instance;
    }

    public void themHS(HocSinh... hs) {
        mTask1 = new MTask(KEY_HS, this);
        mTask1.startAsync(hs);

    }

    public void getAllHocSinh() {
        mTask2 = new MTask(KEY_GETALL_HS, this);
        mTask2.startAsync();
    }

    public void getHocSinh() {
        mTask3 = new MTask(KEY_GET_HS, this);
        mTask3.startAsync();
    }


    @Override
    public Object executeTask(String key, Object... value) {
        try {

            if (key.equals(KEY_HS)) {
                App.getInstance().getAppDB().hocSinhDAO().themHS((HocSinh) value[0]);
            } else if (key.equals(KEY_GETALL_HS)) {
                return App.getInstance().getAppDB().hocSinhDAO().getALLHocSinh();
            } else if (key.equals(KEY_GET_HS)) {
                return App.getInstance().getAppDB().hocSinhDAO().getAllDiemHS("1");
            }

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public void taskComplete(String key, Object value) {
        if (key.equals(KEY_GETALL_HS)) {
            List<HocSinh> listData = (List<HocSinh>) value;
            Toast.makeText(App.getInstance(), "size:" + listData.size(), Toast.LENGTH_SHORT).show();
        } else if (key.equals(KEY_HS)) {
            Toast.makeText(App.getInstance(), (boolean) value ? "them hoc sinh thanh cong" : "themm hoc sinh that bai", Toast.LENGTH_SHORT).show();

        } else if (key.equals(KEY_GET_HS)) {
            DiemHocSinh diemHocSinh = (DiemHocSinh) value;
            Toast.makeText(App.getInstance(), diemHocSinh.toString(), Toast.LENGTH_SHORT).show();
        }

    }


}
