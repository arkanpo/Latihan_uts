package com.example.latihan_uts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.app.AlertDialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.support.design.widget.Snackbar;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {



    EditText alamat,username,nama_belakang,telepon;
    RadioGroup lulusan;
    String var_nama,var_namab;
    ImageView coba;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alamat = findViewById(R.id.alamat);
        username = findViewById(R.id.username);
        nama_belakang = findViewById(R.id.nama_belakang);
        telepon = findViewById(R.id.telepon);
        lulusan = findViewById(R.id.lulusan);
        coba = findViewById(R.id.coba);

        coba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(v, "FAB Clicked!", Snackbar.LENGTH_SHORT)
                        .show();

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.save:
                var_nama = username.getText().toString();
                var_namab = nama_belakang.getText().toString();
                Intent abc = new Intent(MainActivity.this,hasil.class);
                Bundle b = new Bundle();
                b.putString("parse_nama", var_nama);
                b.putString("parse_namab", var_namab);
                abc.putExtras(b);

                startActivity(abc);

                return true;
            case R.id.hapus:
                alamat.getText().clear();
                username.getText().clear();
                nama_belakang.getText().clear();
                telepon.getText().clear();
                return true;
            case R.id.biodata:
                View view = findViewById(R.id.main_layout);
                String pesan="Ichlasul Arkan";
                int durasi = Snackbar.LENGTH_SHORT;
                Snackbar.make(view, pesan, durasi).show();
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}
