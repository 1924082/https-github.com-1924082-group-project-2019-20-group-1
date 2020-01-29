package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnEditInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnEditInfo = findViewById(R.id.btnUpdate);

        btnEditInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveToUpdate();
            }

        });
    }

        public void moveToUpdate() {
            Intent intent = new Intent(MainActivity.this, UpdateInfo.class);
            startActivity(intent);
        }

    }


