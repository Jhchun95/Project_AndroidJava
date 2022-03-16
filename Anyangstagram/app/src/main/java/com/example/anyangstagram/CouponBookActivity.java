package com.example.anyangstagram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by 문경태 on 2018-06-19.
 */

public class CouponBookActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.couponbook);

        ImageButton coupon01 = (ImageButton)findViewById(R.id.couponBtn01);

        coupon01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), Coupon01Kyoto.class);
                startActivity(intent);
            }
        });

        ImageButton coupon02 = (ImageButton)findViewById(R.id.couponBtn02);

        coupon02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), Coupon02Qooqoo.class);
                startActivity(intent);
            }
        });

        ImageButton coupon03 = (ImageButton)findViewById(R.id.couponBtn03);

        coupon03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), Coupon03Seoga.class);
                startActivity(intent);
            }
        });

        ImageButton coupon04 = (ImageButton)findViewById(R.id.couponBtn04);

        coupon04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), Coupon04Sinjun.class);
                startActivity(intent);
            }
        });
    }
}
