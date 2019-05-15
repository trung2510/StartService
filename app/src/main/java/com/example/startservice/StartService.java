package com.example.startservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class StartService extends Service {
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        String ten = null,masv = null;
        int age = 0;
        if(intent != null){
            ten = intent.getStringExtra("trung");
            masv = intent.getStringExtra("masv");
            age = intent.getIntExtra("19",0);
        }

        Toast.makeText(this, "onStartCommand: " + ten + " " + masv + " Tuổi: " + age, Toast.LENGTH_SHORT).show();
        return super.onStartCommand(intent, flags, startId);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
}
