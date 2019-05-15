package com.example.startservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnStartService;
    private Button btnStopService;

    private static final String TEN = "trung";
    private static final String MASV = "masv";
    private static final String AGE = "19";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnStartService = (Button) findViewById(R.id.btnStartService);
        btnStopService = (Button) findViewById(R.id.btnStopService);

        btnStartService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,StartService.class);
                intent.putExtra(TEN,"PHAN QUỐC TRUNG");
                intent.putExtra(MASV,"MÃ SV: PH06940");
                intent.putExtra(AGE,19);
                startService(intent);
            }

        });

        btnStopService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,StartService.class);
                stopService(intent);
            }
        });

    }
}
