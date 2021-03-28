package com.example.a107360206_hw4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.textView2);

        if (savedInstanceState != null) {
            String number = savedInstanceState.getString("number");
            if (mShowCount != null)
                mShowCount.setText(number);
                mCount = Integer.parseInt(number);
        }

    }


    public void counting(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString( "number", Integer.toString(mCount) );
    }

}