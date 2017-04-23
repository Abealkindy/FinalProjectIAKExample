package com.abraham24.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    EditText editText_buah;
    String sjawaban;
    int nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

     int nilais = getIntent().getIntExtra("nilai ke 2",0);
        nilai = nilais;

        editText_buah = (EditText) findViewById(R.id.edit_text_buah);

    }
    // method next sebagai pusat pemrosesan dari button, karena disini saya menaruh perintah onClick di kode xml nya bukan di kode java

    public void next(View v){
//        menaruh action dari EditText ke dalam variabel sjawaban yang mempunyai tipe data String
        sjawaban = editText_buah.getText().toString();
        // memilih kondisi dari EditText
        //di dalam if adalah pilihan, atau action yang akan di eksekusi
        // arti dari kode yang ada di dalam if, adalah, jika kita menginput text buah ke dalam kolom text atau EditText maka akan terjadi eksekusi terhadap perintah yang
        // ada di dalam kurung kurawal if
        if (sjawaban.equals("buah")){
            nilai = nilai + 80;
// else untuk pemilihan kondisi jika yang terjadi adalah input ke kolom textnya selain buah
        }else {
        }
        Intent a = new Intent(getApplicationContext(),ActivityFinal.class);
        a.putExtra("lemparlagi", nilai);
        startActivity(a);

    }
}
