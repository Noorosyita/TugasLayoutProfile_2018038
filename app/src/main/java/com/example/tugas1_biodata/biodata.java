package com.example.tugas1_biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class biodata extends AppCompatActivity {
    EditText nama, nim, fakultas, prodi, angkatan, alamat;
    TextView nama_t, nim_t, fakultas_t, prodi_t, angkatan_t, alamat_t;
    Button tampil;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        nama = findViewById(R.id.input_nama);
        nim = findViewById(R.id.input_nim);
        fakultas = findViewById(R.id.input_fakultas);
        prodi = findViewById(R.id.input_prodi);
        angkatan = findViewById(R.id.input_angkatan);
        alamat = findViewById(R.id.input_alamat);
        nama_t = findViewById(R.id.output_nama);
        nim_t = findViewById(R.id.output_nim);
        fakultas_t = findViewById(R.id.output_fakultas);
        prodi_t = findViewById(R.id.output_prodi);
        angkatan_t = findViewById(R.id.output_angkatan);
        alamat_t = findViewById(R.id.output_alamat);
        tampil = findViewById(R.id.btn_tampil);
        tampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama_t.setText(nama.getText().toString());
                nim_t.setText(nim.getText().toString());
                fakultas_t.setText(fakultas.getText().toString());
                prodi_t.setText(prodi.getText().toString());
                angkatan_t.setText(angkatan.getText().toString());
                alamat_t.setText(alamat.getText().toString());
            }
        });
    }
}