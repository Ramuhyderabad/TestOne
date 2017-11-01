package com.aakruti.watchearn.UI;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.aakruti.watchearn.R;

public class ExampleScrollActivity extends AppCompatActivity {

    CollapsingToolbarLayout toolbar_layout;
    TextView designation,age;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example_scroll);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar_layout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);

        designation = (TextView) findViewById(R.id.designation);
        age = (TextView) findViewById(R.id.age);
        toolbar_layout.setTitle("Mokshith Reddy");
        designation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Mokshith Reddy",Toast.LENGTH_SHORT).show();
            }
        });
        age.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Mokshith Reddy",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
