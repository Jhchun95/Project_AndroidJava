package com.example.anyangstagram;

/**
 * Created by 문경태 on 2018-06-21.
 */

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InterestActivity extends Activity {

    myDBHelper myHelper;
    EditText edtName, edtNameResult;
    Button btnInit, btnInsert, btnSelect, btnDelete;
    SQLiteDatabase sqlDB;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtName = (EditText) findViewById(R.id.edtName);
        edtNameResult = (EditText) findViewById(R.id.edtNameResult);

        btnInit = (Button) findViewById(R.id.btnInit);
        btnInsert = (Button) findViewById(R.id.btnInsert);
        btnSelect = (Button) findViewById(R.id.btnSelect);
        btnDelete = (Button) findViewById(R.id.btnDelete);


        myHelper = new myDBHelper(this);
        btnInit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();
                myHelper.onUpgrade(sqlDB, 1, 2);
                sqlDB.close();
            }
        });

        btnInsert.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();
                sqlDB.execSQL("INSERT INTO groupTBL VALUES ( '"
                        + edtName.getText().toString() + "' );");
                sqlDB.close();
                Toast.makeText(getApplicationContext(), "입력됨",
                        Toast.LENGTH_SHORT).show();
            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB = myHelper.getWritableDatabase();
                sqlDB.execSQL("DELETE FROM groupTBL WHERE gName = '" +  edtName.getText().toString() + "'; ");
                sqlDB.close();
                Toast.makeText(getApplicationContext(), "삭제됨",
                        Toast.LENGTH_SHORT).show();
            }

        });


        btnSelect.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sqlDB = myHelper.getReadableDatabase();
                Cursor cursor;
                cursor = sqlDB.rawQuery("SELECT * FROM groupTBL;", null);

                String strNames = "음식점 이름" + "\r\n" + "--------" + "\r\n";


                while (cursor.moveToNext()) {
                    strNames += cursor.getString(0) + "\r\n";
                }

                edtNameResult.setText(strNames);
                edtNameResult.setGravity(Gravity.CENTER);
                edtNameResult.setTextSize(30);


                cursor.close();
                sqlDB.close();
            }
        });

    }

    public class myDBHelper extends SQLiteOpenHelper {
        public myDBHelper(Context context) {
            super(context, "groupDB", null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL("CREATE TABLE  groupTBL ( gName CHAR(20) PRIMARY KEY);");
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS groupTBL");
            onCreate(db);
        }
    }
}