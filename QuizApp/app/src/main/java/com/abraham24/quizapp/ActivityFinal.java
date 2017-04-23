package com.abraham24.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityFinal extends AppCompatActivity {
TextView text_nilai;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        int tangkap = getIntent().getIntExtra("lemparlagi",0);
        text_nilai = (TextView)findViewById(R.id.text_nilai);
        // menampilkan text melalui kode java
        text_nilai.setText("Nilai Kamu : " + tangkap );
    }
}
