package com.example.anyangstagram;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 문경태 on 2018-05-28.
 */

public class Snack_listActivity extends Activity {
    ArrayList<RestraurantSn> rsn = new ArrayList<RestraurantSn>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.snack_list);
        setTitle("분 식");

        rsn.add(new RestraurantSn("고봉민김밥인 범계점",R.drawable.sn_bggobong, "안양시 동안구 평촌대로217번길 45"));
        rsn.add(new RestraurantSn("신전떡볶이 범계점",R.drawable.sn_bgsigeon, "안양시 동안구 평촌대로211번길 16"));
        rsn.add(new RestraurantSn("진미떡볶이 범계점",R.drawable.sn_bgzinmi, "안양시 동안구 평촌대로223번길 42"));
        rsn.add(new RestraurantSn("신포우리만두 범계점",R.drawable.sn_bgsinpo, "안양시 동안구 동안로 128"));

        rsn.add(new RestraurantSn("빨봉분식 안양1번가",R.drawable.sn_a1thebalbong, "안양시 만안구 안양로292번길 8"));
        rsn.add(new RestraurantSn("모이세분식 안양1번가",R.drawable.sn_a1mo2sa, "안양시 만안구 장내로 141"));
        rsn.add(new RestraurantSn("두끼떡볶이 안양1번가",R.drawable.sn_a1dogi, "안양시 만안구 안양로304번길 28"));
        rsn.add(new RestraurantSn("청년다방 안양1번가",R.drawable.sn_a1teenager, "안양시 만안구 만안로 214-2"));

        rsn.add(new RestraurantSn("남촌김밥 성결대점",R.drawable.sn_ssnamchon, "안양시 만안구 성결대학로 21"));
        rsn.add(new RestraurantSn("동대문 엽기떡볶이 성결대점",R.drawable.sn_ssdongdamoon, "안양시 만안구 성결대학로 28 1"));
        rsn.add(new RestraurantSn("벧엘김밥 성결대점",R.drawable.sn_ssbedel, "안양시 만안구 성결대학로23번길 65"));
        rsn.add(new RestraurantSn("신전떡볶이 성결대점",R.drawable.sn_sssingeon, "안양시 만안구 성결대학로 27"));

        MyAdapterSn adapter = new MyAdapterSn(
                getApplicationContext(),
                R.layout.sn_row,
                rsn);

        ListView listView = (ListView)findViewById(R.id.listviewSn);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        SnListDetail.class);

                intent.putExtra("title", rsn.get(position).title);
                intent.putExtra("img", rsn.get(position).img);
                intent.putExtra("address", rsn.get(position).address);

                if(position == 0){
                    Intent intent0 = new Intent(Snack_listActivity.this, Sn00Gobongmin.class);
                    startActivity(intent0);
                }
                if(position == 1){
                    Intent intent1 = new Intent(Snack_listActivity.this, Sn01Sinjun.class);
                    startActivity(intent1);
                }
                if(position == 2){
                    Intent intent2 = new Intent(Snack_listActivity.this, Sn02Jinmi.class);
                    startActivity(intent2);
                }
                if(position == 3){
                    Intent intent3 = new Intent(Snack_listActivity.this, Sn03Sinpo.class);
                    startActivity(intent3);
                }
                if(position == 4){
                    Intent intent4 = new Intent(Snack_listActivity.this, Sn04Bbalbong.class);
                    startActivity(intent4);
                }
                if(position == 5){
                    Intent intent5 = new Intent(Snack_listActivity.this, Sn05Moise.class);
                    startActivity(intent5);
                }
                if(position == 6){
                    Intent intent6 = new Intent(Snack_listActivity.this, Sn06Dukki.class);
                    startActivity(intent6);
                }
                if(position == 7){
                    Intent intent7 = new Intent(Snack_listActivity.this, Sn07Youthcafe.class);
                    startActivity(intent7);
                }
                if(position == 8){
                    Intent intent8 = new Intent(Snack_listActivity.this, Sn08Namchon.class);
                    startActivity(intent8);
                }
                if(position == 9){
                    Intent intent9 = new Intent(Snack_listActivity.this, Sn09Dongdaemun.class);
                    startActivity(intent9);
                }
                if(position == 10){
                    Intent intent10 = new Intent(Snack_listActivity.this, Sn10Bedel.class);
                    startActivity(intent10);
                }
                /*if(position == 11){
                    Intent intent11 = new Intent(Snack_listActivity.this, Kr00Daebak.class);
                    startActivity(intent11);
                } */
            }
        });
    }
}

class MyAdapterSn extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<RestraurantSn> rsn;
    LayoutInflater inf;

    public MyAdapterSn(Context context, int layout, ArrayList<RestraurantSn> rs) {
        this.context = context;
        this.layout = layout;
        this.rsn = rs;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return rsn.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inf.inflate(layout, null);
        }
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivsn01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvsn01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvsn02);

        RestraurantSn m = rsn.get(position);
        imageView.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.address);

        return convertView;
    }
}

class RestraurantSn {
    String title = ""; // 점포명
    int img; // 점포 사진
    String address = ""; // 점포 주소
    public RestraurantSn(String title, int img, String address) {
        super();
        this.title = title;
        this.img = img;
        this.address = address;
    }
    public RestraurantSn() {}
}
