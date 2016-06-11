package com.example.mdibrahim.demointent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText firstname;
    EditText middlename;
    EditText lastname;
    Button fullName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void getfullname(View view){
        firstname=(EditText) findViewById(R.id.fname);
        middlename=(EditText) findViewById(R.id.mname);
        lastname=(EditText) findViewById(R.id.lname);
        fullName=(Button) findViewById(R.id.btn);

        String f=firstname.getText().toString();
        String m=middlename.getText().toString();
        String l=lastname.getText().toString();
        String fullname=f+" "+m+" "+l;
        Toast.makeText(this, fullname, Toast.LENGTH_LONG).show();

    }
}
