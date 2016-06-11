package com.example.mdibrahim.demointent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    TextView textv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        textv=(TextView) findViewById(R.id.txt);
        String name=getIntent().getStringExtra("name");
        textv.setText(name);
    }
}
