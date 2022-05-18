package com.caotuyen.btvnb2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {
private Button btnBai1, btnBai2,btnBai3,btnBai4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnBai1 = (Button) findViewById(R.id.btn_bai1);
        btnBai2 = (Button) findViewById(R.id.btn_bai2);
        btnBai3 = (Button) findViewById(R.id.btn_bai3);
        btnBai4 = (Button)findViewById(R.id.btn_bai4);

        btnBai1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity3.this, MainActivity.class);
                startActivity(intent1);
            }
        });
        btnBai2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity3.this, MainActivity2.class);
                startActivity(intent2);
            }
        });
        btnBai3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent3);
            }
        });
        btnBai4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity3.this, MainActivity5.class);
                startActivity(intent4);
            }
        });
    }
}