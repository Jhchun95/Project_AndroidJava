package com.example.anyangstagram;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 문경태 on 2018-05-26.
 */

public class BarListDetail extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_list_detail);

        TextView tvTitle = (TextView)findViewById(R.id.tvbar01);
        TextView tvAddress = (TextView)findViewById(R.id.tvbar02);
        ImageView imageView = (ImageView)findViewById(R.id.ivbar01);

        Intent intent = getIntent();
        tvTitle.setText(intent.getStringExtra("title"));
        tvAddress.setText(intent.getStringExtra("address"));
        imageView.setImageResource(intent.getIntExtra("img", 0));

    }
}