package com.example.anyangstagram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by 문경태 on 2018-04-20.
 */

public class MainmenuActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        ImageButton searchbtn = (ImageButton) findViewById(R.id.searchBtn);
        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(intent);
            }
        });
        ImageButton categorybtn = (ImageButton) findViewById(R.id.cateBtn);
        categorybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CategoryActivity.class);
                startActivity(intent);
            }
        });

        ImageButton bookmarkbtn = (ImageButton) findViewById(R.id.bookmarkBtn);
        bookmarkbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), CouponBookActivity.class);
                startActivity(intent);
            }
        });

        ImageButton mypagebtn = (ImageButton) findViewById(R.id.mypageBtn);
        mypagebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyPageActivity.class);
                startActivity(intent);
            }
        });

        ImageButton mapbtn = (ImageButton) findViewById(R.id.mapBtn);
        mapbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MapActivity.class);
                startActivity(intent);
            }
        });
    }
}
