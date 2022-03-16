package com.example.anyangstagram;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by 문경태 on 2018-06-19.
 */

public class MyPageActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mypage);

        Button facebookBtn = (Button) findViewById(R.id.accountBtn);

        facebookBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lunchIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://m.facebook.com"));
                startActivity(lunchIntent);
            }
        });

        Button interBtn = (Button) findViewById(R.id.interBtn);

        interBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), InterestActivity.class);
                startActivity(intent);
            }
        });

        /*Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.example.anyangstagram");
        startActivity(launchIntent);*/

        /*
        String facebookID = "OOOOOOOOOOOOOOOO";
        try
        {
            Uri uri = Uri.parse( "fb://page/" + facebookID );
            startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
        }
        catch ( Exception e )
        {
            Intent i = new Intent( Intent.ACTION_VIEW );
            Uri u = Uri.parse( "http://www.facebook.com/" + facebookID );
            i.setData( u );
            startActivity( i );
        }*/
    }
}
