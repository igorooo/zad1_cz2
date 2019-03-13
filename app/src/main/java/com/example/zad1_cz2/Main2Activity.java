package com.example.zad1_cz2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Main2Activity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    ToggleButton toggleButton;
    ImageView imgV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        radioGroup = findViewById(R.id.RBG);
        textView = findViewById(R.id.radio_buttons_text);

        imgV = (ImageView) findViewById(R.id.img_toogle);

        final int imageSun = getResources().getIdentifier("@drawable/sun",null, this.getPackageName());
        final int imageMoon = getResources().getIdentifier("@drawable/moon",null, this.getPackageName());
        imgV.setImageResource(imageMoon);

        toggleButton = (ToggleButton) findViewById(R.id.toggleButton1);

        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    imgV.setImageResource(imageSun);
                }
                else {
                    imgV.setImageResource(imageMoon);
                }
            }
        });


    }

    public void RBclick(View v){

        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        textView.setText(radioButton.getText() + " selected");

    }


    public void goback(View v){
        finish();
    }

    public void toast(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);

        String toggle = toggleButton.isChecked() ? "On" : "Off";

        Toast.makeText(this, radioButton.getText() + " selected\n" + "Sun " + toggle, Toast.LENGTH_SHORT).show();


    }
}
