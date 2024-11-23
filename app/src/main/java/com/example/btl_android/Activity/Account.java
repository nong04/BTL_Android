package com.example.btl_android.Activity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.btl_android.R;

public class Account extends AppCompatActivity {
    Button btnDoiLuu, btnDoiHuy;
    ImageView imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_account);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btnDoiLuu = findViewById(R.id.btnDoiLuu);
        btnDoiHuy = findViewById(R.id.btnDoiHuy);
        imgBack = findViewById(R.id.imgBack);

        btnDoiLuu.setOnClickListener(v -> {
            finish();
        });
        btnDoiHuy.setOnClickListener(v -> {
            finish();
        });
        imgBack.setOnClickListener(v -> {
            finish();
        });
    }
}