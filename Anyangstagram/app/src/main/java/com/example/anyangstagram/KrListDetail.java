package com.example.anyangstagram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 문경태 on 2018-05-27.
 */

public class KrListDetail extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kr_list_detail);

        TextView tvTitle = (TextView)findViewById(R.id.tvkr01);
        TextView tvAddress = (TextView)findViewById(R.id.tvkr02);
        ImageView imageView = (ImageView)findViewById(R.id.ivkr01);

        Intent intent = getIntent();
        tvTitle.setText(intent.getStringExtra("titlekr"));
        tvAddress.setText(intent.getStringExtra("addresskr"));
        imageView.setImageResource(intent.getIntExtra("imgkr", 0));

    }
}
