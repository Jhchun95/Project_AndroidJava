package com.example.anyangstagram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by 문경태 on 2018-06-16.
 */

public class Ch10Haohao extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ch_10_haohao);

        ImageButton ch10wrbtn = (ImageButton) findViewById(R.id.wrBtn_Ch10);

        ch10wrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wrintent = new Intent(getApplicationContext(), MultiMemoActivity.class);
                startActivity(wrintent);
            }
        });
    }
}
