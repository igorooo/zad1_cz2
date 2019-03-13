package com.example.zad1_cz2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main4Activity extends Activity {

    ImageView imgV;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        imgV = (ImageView) findViewById(R.id.act4imgV);

        final int imageBack = getResources().getIdentifier("@drawable/back",null, this.getPackageName());
        imgV.setImageResource(imageBack);



    }

    public void goback(View v){
        finish();
    }
}
