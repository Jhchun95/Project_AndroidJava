package com.example.anyangstagram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by 문경태 on 2018-05-22.
 */

public class CategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.category);

        ImageButton jpbtn = (ImageButton) findViewById(R.id.jpBtn);
        jpbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Japan_listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton krbtn = (ImageButton) findViewById(R.id.krBtn);
        krbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Korea_listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton chbtn = (ImageButton) findViewById(R.id.chBtn);
        chbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        China_listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton snbtn = (ImageButton) findViewById(R.id.snBtn);
        snbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Snack_listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton brbtn = (ImageButton) findViewById(R.id.brBtn);
        brbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Bar_listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton ffbtn = (ImageButton) findViewById(R.id.ffBtn);
        ffbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Fastfood_listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton bfbtn = (ImageButton) findViewById(R.id.bfBtn);
        bfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Buffet_listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton wtbtn = (ImageButton) findViewById(R.id.wtBtn);
        wtbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Western_listActivity.class);
                startActivity(intent);
            }
        });

        ImageButton cfbtn = (ImageButton) findViewById(R.id.cafeBtn);
        cfbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),
                        Cafe_listActivity.class);
                startActivity(intent);
            }
        });
    }
}
