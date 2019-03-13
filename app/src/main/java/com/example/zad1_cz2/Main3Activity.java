package com.example.zad1_cz2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    EditText email,number,lines;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        email = (EditText) findViewById(R.id.editTextEmail);
        number = (EditText) findViewById(R.id.editTextNumber);
        lines = (EditText) findViewById(R.id.editTextLines);


    }

    public void goback(View v){
        finish();
    }

    public void toast(View v){

        Toast.makeText(this, email.getText() + "\n" + number.getText() + "\n" + lines.getText(), Toast.LENGTH_SHORT).show();
    }
}
