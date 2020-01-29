package com.example.user;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UpdateInfo extends AppCompatActivity {

    private Button btnUpdate;


@Override
protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_info);

        btnUpdate=findViewById(R.id.btnUpdate);

        btnUpdate.setOnClickListener(new View.OnClickListener(){
@Override
public void onClick(View v){
        UpdateProfile();
        }

        });
        }

public void UpdateProfile(){
        Intent intent=new Intent(UpdateInfo.this,MainActivity.class);
        startActivity(intent);
        }

}
