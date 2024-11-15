package com.example.chiketo;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Menampilkan halaman login terlebih dahulu
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
        finish(); // Menghentikan MainActivity agar tidak dapat kembali dengan tombol back
    }
}
