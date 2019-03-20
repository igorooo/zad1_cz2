package com.example.zad1_cz2;

import android.graphics.Color;
import android.graphics.Typeface;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    EditText editText;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        radioGroup = (RadioGroup) findViewById(R.id.RGactiv5);
        editText = (EditText) findViewById(R.id.editTextAct5);
        checkBox = (CheckBox) findViewById(R.id.checkBoxAct5);

        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(checkBox.isChecked()){
                    setBold();
                }

            }
        });
    }


    public void RBclick(View v){

        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);


        if(radioButton.getId() == R.id.radioButton1act5){
            getWindow().getDecorView().setBackgroundColor(Color.RED);

        }

        else{
            getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        }
    }

    public void setBold(){
        String sourceString = "<b>" + editText.getText() + "</b> ";
        editText.setText(Html.fromHtml(sourceString));
    }

    public void setUnBold(){

        String val = editText.getText() + "";
        val = val.replaceAll("<b>", "");
        val = val.replaceAll("</b>","");
        editText.setText(val);
    }


}
