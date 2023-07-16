package com.alperen.trytosolve;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void makeMusicians() {

        Musicians james = new Musicians("james","guitar",43);
        System.out.println(james.instrument);

    }

}