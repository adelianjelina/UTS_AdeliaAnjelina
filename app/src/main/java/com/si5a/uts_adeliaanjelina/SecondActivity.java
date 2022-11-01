package com.si5a.uts_adeliaanjelina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvNama, tvNomor, tvJalur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        tvNama = findViewById(R.id.tvNama);
        tvNomor = findViewById(R.id.tvNomor);
        tvJalur = findViewById(R.id.tvJalur);

        Intent intent2 = getIntent();

        tvNama.setText(intent2.getStringExtra("VarNama"));
        tvNomor.setText(intent2.getStringExtra("VarNomor"));
        tvJalur.setText(intent2.getStringExtra("VarJalur"));



    }
}