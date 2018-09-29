package com.caringal.luispaulo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4IT-H","tumakbo si onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4IT-H","onStart() has executed...");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4IT-H","onResume() has executed...");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4IT-H","onStop() has executed...");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4IT-H","onPause() has executed...");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4IT-H","onRestart() has executed...");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4IT-H","onDestroy() has executed...");
    }

    
}
