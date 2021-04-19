package com.example.a107360206_hw7_1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    public void activity2(View view) {
        Intent intent = new Intent(MainActivity.this,
                MainActivity2.class);
        startActivity(intent);
    }

    public void activity4(View view) {
        Intent intent = new Intent(MainActivity.this,
                MainActivity3.class);
        startActivity(intent);
    }

    public void activity3(View view) {
        Intent intent = new Intent(MainActivity.this,
                MainActivity4.class);
        startActivity(intent);
    }

    /*
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                Toast.makeText(getApplicationContext(), "Message",
                        Toast.LENGTH_SHORT).show();
                return true;
            default:
                // Do nothing
        }
        return super.onOptionsItemSelected(item);
    }
     */

}