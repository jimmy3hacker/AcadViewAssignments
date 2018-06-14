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

        Toast.makeText(MainActivity.this,"onCreate",Toast.LENGTH_SHORT).show();

        Log.d("test","I am in onCreate()");

    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("test","I am in onStart()");
        Toast.makeText(MainActivity.this,"onStart",Toast.LENGTH_SHORT).show();


    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("test","I am in onPause()");
        Toast.makeText(MainActivity.this,"onPause",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("test","I am in onDestory()");
        Toast.makeText(MainActivity.this,"onDestroy",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("test","I am in onStop()");
        Toast.makeText(MainActivity.this,"onStop",Toast.LENGTH_SHORT).show();
        }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("test","I am in onRestart()");
        Toast.makeText(MainActivity.this,"onRestart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("test","I am in onResume()");
        Toast.makeText(MainActivity.this,"onResume",Toast.LENGTH_SHORT).show();



    }
}
