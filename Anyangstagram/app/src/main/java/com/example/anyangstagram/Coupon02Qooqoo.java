package com.example.anyangstagram;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by 문경태 on 2018-06-21.
 */

public class Coupon02Qooqoo extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.coupon_02_qooqoo);

    }
}
