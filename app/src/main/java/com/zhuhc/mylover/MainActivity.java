package com.zhuhc.mylover;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStop() {
        // TODO Auto-generated method stub
        Intent intent = new Intent(MainActivity.this, myService.class);
        stopService(intent);
        super.onStop();
    }

    @Override
    public void onResume() {
        Intent intent = new Intent(MainActivity.this, myService.class);
        startService(intent);
        super.onResume();  // Always call the superclass method first
    }
}
