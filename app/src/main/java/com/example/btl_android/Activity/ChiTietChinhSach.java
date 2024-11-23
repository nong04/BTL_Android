package com.example.btl_android.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.btl_android.R;

public class ChiTietChinhSach extends AppCompatActivity {

    TextView nameChinhSach,detailChinhSach;
    ImageView imgBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.adapter_chinh_sach);

        nameChinhSach = findViewById(R.id.nameChinhSach);
        detailChinhSach = findViewById(R.id.detailChinhSach);
        imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        Intent intent = getIntent();
        String chinhsachname = intent.getStringExtra("storyName");
        String chinhsachdetail = intent.getStringExtra("storyDetail");
        detailChinhSach.setText(chinhsachdetail);
        nameChinhSach.setText(chinhsachname);
    }
}