package com.example.latihan3akb1.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.latihan3akb1.R;
import com.example.latihan3akb1.sharedpreferences.Preferences;

/*
  Nama        : Dirza Aulia
  NIM         : 10118705
  Kelas       : IF6-K
  Tanggal     : 25 April 2020
  Deskripsi   : Membuat halaman Home dari segi logika pemrogramannya beserta dengan desain tampilannya.
  */

public class MainActivity extends AppCompatActivity {

    TextView textViewName, textViewKeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();

        textViewKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Preferences.setLogout(getBaseContext());

                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });
    }

    private void bindViews(){

        textViewKeluar = findViewById(R.id.txt_logout);
        textViewName = findViewById(R.id.txtName);

        textViewName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
