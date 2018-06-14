package com.example.admin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast centerToast = null;
        centerToast.makeText(getApplicationContext(),"this is my toast",Toast.LENGTH_SHORT);
        centerToast.setGravity(Gravity.CENTER,0,0);

        centerToast.show();

        Log.d("test","I am in onCreate()");

    }
}
