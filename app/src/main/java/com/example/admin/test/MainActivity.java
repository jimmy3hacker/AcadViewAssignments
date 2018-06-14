package com.example.admin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(MainActivity.this,"THis is my first toast",Toast.LENGTH_SHORT).show();

        Log.d("test","I am in onCreate()");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("test","I am in onCreate()");

    }

    @Override
    protected void onResume() {
        super.onResume();



    }
}
