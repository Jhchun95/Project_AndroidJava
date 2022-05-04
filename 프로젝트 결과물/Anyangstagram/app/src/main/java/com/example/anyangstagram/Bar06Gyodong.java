package com.example.anyangstagram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by 문경태 on 2018-06-16.
 */

public class Bar06Gyodong extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_06_gyodong);

        ImageButton bar06wrbtn = (ImageButton) findViewById(R.id.wrBtn_Bar06);

        bar06wrbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wrintent = new Intent(getApplicationContext(), MultiMemoActivity.class);
                startActivity(wrintent);
            }
        });
    }
}
