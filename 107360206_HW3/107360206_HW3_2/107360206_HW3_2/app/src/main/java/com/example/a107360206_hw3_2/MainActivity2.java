package com.example.a107360206_hw3_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mShowCount = (TextView) findViewById(R.id.textView4);

        Bundle bundle = getIntent().getExtras();
        String txt = bundle.getString("Hello") + "\n" + bundle.getString("number");

        mShowCount.setText(txt);
    }
}