package com.example.latihan_uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class hasil extends AppCompatActivity {

    TextView username,nama_belakang,textView,textView2;
    String get_nama,get_namab;
    ImageView imageView;
    Animation btt,logosplah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        username = (TextView) findViewById(R.id.username);
        nama_belakang = (TextView) findViewById(R.id.nama_belakang);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        imageView = findViewById(R.id.imageView);
        btt = AnimationUtils.loadAnimation(this,R.anim.btt);
        logosplah = AnimationUtils.loadAnimation(this,R.anim.logosplah);

        imageView.startAnimation(logosplah);
        username.startAnimation(btt);
        nama_belakang.startAnimation(btt);
        textView.startAnimation(btt);
        textView2.startAnimation(btt);


        Bundle b = getIntent().getExtras();

        get_nama = b.getString("parse_nama");

        get_namab = b.getString("parse_namab");

        username.setText(" "+get_nama);
        nama_belakang.setText(" "+get_namab);

    }
}
