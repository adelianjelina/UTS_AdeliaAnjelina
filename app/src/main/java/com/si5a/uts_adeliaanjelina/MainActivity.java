package com.si5a.uts_adeliaanjelina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn_konfir;
    EditText et_nama, et_nomor_pendaftaran;
    CheckBox cb_konfirmasi;
    Spinner sp_jalurpendaftaran;

    String nama, no_pd, jalur_pd;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nama = findViewById(R.id.et_nama);
        et_nomor_pendaftaran = findViewById(R.id.et_nomor_pendaftaran);
        btn_konfir = findViewById(R.id.btn_konfir);
        cb_konfirmasi = findViewById(R.id.cb_konfirmasi);
        sp_jalurpendaftaran = findViewById(R.id.sp_jalurpendaftaran);

        btn_konfir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nama = et_nama.getText().toString();
                no_pd = et_nomor_pendaftaran.getText().toString();
                jalur_pd = sp_jalurpendaftaran.getSelectedItem().toString();


                if (nama.trim().equals("")){
                    et_nama.setError("Nama Tidak Boleh Kosong");
                }
                else if (nama.trim().equals("")){
                    et_nomor_pendaftaran.setError("Nomor Pendaftaran Tidak boleh kosong");
                } else{
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("VarNama", String.valueOf(nama));
                    intent.putExtra("VarNomor", String.valueOf(no_pd));
                    intent.putExtra("VarJalur", String.valueOf(jalur_pd));
                    startActivity(intent);
                }


            }
        });

        cb_konfirmasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb_konfirmasi.isChecked()) {
                    Toast.makeText(MainActivity.this, "Terkonfirmasi", Toast.LENGTH_SHORT).show();
                } else if (!cb_konfirmasi.isChecked()){
                    Toast.makeText(MainActivity.this, "Silahkan centang untuk melanjutkan pendaftaran", Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}