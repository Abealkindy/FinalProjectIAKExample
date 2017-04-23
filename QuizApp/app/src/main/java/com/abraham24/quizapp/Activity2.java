package com.abraham24.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    CheckBox checkBox_buah, checkBox_makanan, checkBox_minuman, checkBox_sampah;
    Button button_next_2;
    int nilai;
    int tangkap_intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        // pengambilan nilai yang di lempar oleh Activity Sebelumnya menggunakan method getIntent() lalu digabungkan dengan pemberian method getIntExtra(), sesuai dengan tipe
        // data yang sudah dilemparkan activity sebelumnya
        tangkap_intent = getIntent().getIntExtra("nilai", 0);
        // menyamakan nilai dari variabel nilai dengan nilai dari variabel tangkap_intent
        nilai = tangkap_intent;
        //Casting Widget
        checkBox_buah = (CheckBox) findViewById(R.id.checkbox_buah);
        checkBox_makanan = (CheckBox) findViewById(R.id.checkbox_makanan);
        checkBox_minuman = (CheckBox) findViewById(R.id.checkbox_minuman);
        checkBox_sampah = (CheckBox) findViewById(R.id.checkbox_sampah);
        button_next_2 = (Button) findViewById(R.id.button_next_2);



    }

//  Method hitungNilai sebagai pusat penghitungan nilai
    private int hitungNilai(boolean buah, boolean makanan) {
// memasukkan if-else sebagai pemilihan kondisi jika chechbox dipilih
        //disini saya hanya memproses dua checkbox
        if (buah) {
            // menghitung nilai dari variabel nilai yang sudah disamakan nilainya dengan variabel tangkap_intent
            nilai = nilai + 5;
        }
        if (makanan) {
            nilai = nilai + 5;
        }
// pengembalian nilai dari method hitungNilai
        return nilai;
    }
// method coba sebagai pusat pemrosesan dari button, karena disini saya menaruh perintah onClick di kode xml nya bukan di kode java
    public void coba(View v) {
        //memasukkan nilai boolean kepada checkbox
        boolean buah = checkBox_buah.isChecked();
        boolean makanan = checkBox_makanan.isChecked();
        // meletakkan method hitung nilai di dalam variabel tambah yang mempunyai tipe data integer
        int tambah = hitungNilai(buah, makanan);
        Intent i = new Intent(getApplicationContext(), Activity3.class);
        i.putExtra("nilai ke 2", tambah);
        startActivity(i);

    }
}
