package com.example.utsandroid_if10k_10119916_dianarpian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class FormActivity extends AppCompatActivity {
    TextView tx_nik, tx_nama, tx_tgl_lahir, tx_jk, tx_hubungan,tx_tgl_konfirmasi, tx_jnstes;
    Button btn_ubah, btn_lanjut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        tx_nik=(TextView)findViewById(R.id.tx_nik);
        tx_nama=(TextView)findViewById(R.id.tx_nama);
        tx_tgl_lahir=(TextView)findViewById(R.id.tx_tgl_lahir);
        tx_jk=(TextView)findViewById(R.id.tx_jkelamin);
        tx_hubungan=(TextView)findViewById(R.id.tx_Hubungan);

        Intent i = getIntent();
        tx_jnstes.setText(i.getExtras().getString("Jenis Tes"));
        tx_tgl_konfirmasi.setText(i.getExtras().getString("Tanggal Terkonfirmasi"));
        tx_nik.setText(i.getExtras().getString("Nik"));
        tx_nik.setText(i.getExtras().getString("Nik"));
        tx_nama.setText(i.getExtras().getString("Nama"));
        tx_tgl_lahir.setText(i.getExtras().getString("Tgl_lahir"));
        tx_jk.setText(i.getExtras().getString("Jk"));
        tx_hubungan.setText(i.getExtras().getString("Hub"));


        btn_lanjut=(Button)findViewById(R.id.lanjut);
        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DialogView alert = new DialogView();
                alert.showDialog(FormActivity.this, "Terima kasih laporan anda membantu kami dalam melakukan penangan kasus secara tepat");
            }
        });

        btn_ubah=(Button)findViewById(R.id.ubah);
        btn_ubah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });

    }
}
