package com.example.camping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }
    public nextScreen(View view){
        Intent intent=new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void close(View view){
        finish();
    }
}