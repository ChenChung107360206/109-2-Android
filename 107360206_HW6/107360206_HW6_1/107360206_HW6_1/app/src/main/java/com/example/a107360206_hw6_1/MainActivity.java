package com.example.a107360206_hw6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Submit(View view) {
        StringBuffer toppings = new
                StringBuffer().append(getString(R.string.toppings_label));
        if  (((CheckBox) findViewById(R.id.checkBox1)).isChecked()) {
            toppings.append(getString(R.string.Chocolate_syrup_text));
        }
        if  (((CheckBox) findViewById(R.id.checkBox2)).isChecked()) {
            toppings.append(getString(R.string.Sprinkles_text));
        }
        if  (((CheckBox) findViewById(R.id.checkBox3)).isChecked()) {
            toppings.append(getString(R.string.Crushed_nuts_text));
        }
        if  (((CheckBox) findViewById(R.id.checkBox4)).isChecked()) {
            toppings.append(getString(R.string.Cherries_text));
        }
        if  (((CheckBox) findViewById(R.id.checkBox5)).isChecked()) {
            toppings.append(getString(R.string.Orio_cookie_crumbles_text));
        }

        Toast toast = Toast.makeText(this, toppings,
                Toast.LENGTH_SHORT);
        toast.show();

    }

}