package com.abraham24.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //  Pengenalan Wiget
    RadioButton radioButtonDurian, radioButtonMangga, radioButtonJambu, radioButtonAlpukat;
    Button button_next_1;
    //bikin integer, dikasih variabel nilai
    int nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //method yg digunakkan untuk mengambil acuan View/tampilan
        // untuk yang satu ini, method setContentView mengambil tampilan/View dari layout activity_main
        setContentView(R.layout.activity_main);
//      Casting Widget
        radioButtonDurian = (RadioButton) findViewById(R.id.radio_button_durian);
        radioButtonMangga = (RadioButton) findViewById(R.id.radio_button_mangga);
        radioButtonJambu = (RadioButton) findViewById(R.id.radio_button_jambu);
        radioButtonAlpukat = (RadioButton) findViewById(R.id.radio_button_alpukat);

        button_next_1 = (Button) findViewById(R.id.button_next_1);
//      Pemberian action kepada widget
        radioButtonDurian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = 10;
            }
        });
        radioButtonMangga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = 0;
            }
        });
        radioButtonJambu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = 0;
            }
        });
        radioButtonAlpukat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nilai = 0;
            }
        });

        button_next_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent, berguna untuk berpindah dari activity ke activity yang lain
                Intent intent = new Intent(getApplicationContext(),Activity2.class);
                //untuk melempar nilai dari activity ke activity yang lain
                intent.putExtra("nilai", nilai);
                //untuk untuk menjalankan intentnya
                startActivity(intent);

                //startActivity(new Intent(getApplicationContext(),Activity2.class));
            }
        });

    }
}
