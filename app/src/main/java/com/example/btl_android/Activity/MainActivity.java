package com.example.btl_android.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.btl_android.R;

public class MainActivity extends AppCompatActivity {
    ImageView imgTKNext, imgChinhSach;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imgTKNext = findViewById(R.id.imgTKNext);
        imgChinhSach = findViewById(R.id.imgCSNext);
        imgTKNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, Account.class);
            startActivity(intent);
        });
        imgChinhSach.setOnClickListener(v -> {
            Intent intent = new Intent(this, ChinhSach.class);
            startActivity(intent);
        });
    }
}