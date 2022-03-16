package com.example.anyangstagram;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by 문경태 on 2018-05-27.
 */

public class China_listActivity extends Activity{
    ArrayList<RestraurantCh> rsc = new ArrayList<RestraurantCh>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.china_list);
        setTitle("중 식");

        rsc.add(new RestraurantCh("짬뽕타임 범계점",R.drawable.ch_chyamppongtime, "안양시 동안구 평촌대로223번길 42"));
        rsc.add(new RestraurantCh("홍콩반점0410 안양1번가점", R.drawable.ch_hongkongbanjeom0410, "안양시 만안구 안양로304번길 15"));
        rsc.add(new RestraurantCh("드래곤", R.drawable.ch_drangon, "안양시 동안구 시민대로 202"));
        rsc.add(new RestraurantCh("북경짜장2900 안양1번가점", R.drawable.ch_bukkyeong2900, "안양시 만안구 안양로292번길 14"));
        rsc.add(new RestraurantCh("황궁쟁반짜장 춘자 성결대점", R.drawable.ch_hwanggung, "안양시 만안구 성결대학로 29"));
        rsc.add(new RestraurantCh("산해원 범계점", R.drawable.ch_sanhaewon, "안양시 동안구 평촌대로 217"));
        rsc.add(new RestraurantCh("홍콩반점0410 범계역점", R.drawable.ch_hongkong0410beomgye, "안양시 동안구 평촌대로223번길 49"));
        rsc.add(new RestraurantCh("니뽕내뽕 안양1번가점", R.drawable.ch_nippongnaeppong, "안양시 만안구 장내로149번길 37"));
        rsc.add(new RestraurantCh("찰스탕수육", R.drawable.ch_charlestangsuyuk, "안양시 만안구 안양로268번길 20"));
        rsc.add(new RestraurantCh("만리장성", R.drawable.ch_manrijangsung, "안양시 동안구 장내로149번길 53"));
        rsc.add(new RestraurantCh("하오하오 만안구청점", R.drawable.ch_haohao, "안양시 만안구 안양로 131"));

        MyAdapterCh adapter = new MyAdapterCh(
                getApplicationContext(),
                R.layout.ch_row,
                rsc);

        ListView listView = (ListView)findViewById(R.id.listviewCh);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        ChListDetail.class);

                intent.putExtra("title", rsc.get(position).title);
                intent.putExtra("img", rsc.get(position).img);
                intent.putExtra("address", rsc.get(position).address);

                if(position == 0){
                    Intent intent0 = new Intent(China_listActivity.this, Ch00Chyamppongtime.class);
                    startActivity(intent0);
                }
                if(position == 1){
                    Intent intent1 = new Intent(China_listActivity.this, Ch01HongkongA1.class);
                    startActivity(intent1);
                }
                if(position == 2){
                    Intent intent2 = new Intent(China_listActivity.this, Ch02Dragon.class);
                    startActivity(intent2);
                }
                if(position == 3){
                    Intent intent3 = new Intent(China_listActivity.this, Ch03BukkyeongA1.class);
                    startActivity(intent3);
                }
                if(position == 4){
                    Intent intent4 = new Intent(China_listActivity.this, Ch04Hwanggung.class);
                    startActivity(intent4);
                }
                if(position == 5){
                    Intent intent5 = new Intent(China_listActivity.this, Ch05Sanhaewon.class);
                    startActivity(intent5);
                }
                if(position == 6){
                    Intent intent6 = new Intent(China_listActivity.this, Ch06HongkongBg.class);
                    startActivity(intent6);
                }
                if(position == 7){
                    Intent intent7 = new Intent(China_listActivity.this, Ch07Nippongnaeppong.class);
                    startActivity(intent7);
                }
                if(position == 8){
                    Intent intent8 = new Intent(China_listActivity.this, Ch08Charles.class);
                    startActivity(intent8);
                }
                if(position == 9){
                    Intent intent9 = new Intent(China_listActivity.this, Ch09Manrijangsung.class);
                    startActivity(intent9);
                }
                if(position == 10){
                    Intent intent10 = new Intent(China_listActivity.this, Ch10Haohao.class);
                    startActivity(intent10);
                }
            }
        });
    }
}

class MyAdapterCh extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<RestraurantCh> rsc;
    LayoutInflater inf;

    public MyAdapterCh(Context context, int layout, ArrayList<RestraurantCh> rsc) {
        this.context = context;
        this.layout = layout;
        this.rsc = rsc;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return rsc.size();
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
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivch01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvch01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvch02);

        RestraurantCh m = rsc.get(position);
        imageView.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.address);

        return convertView;
    }
}

class RestraurantCh {
    String title = ""; // 점포명
    int img; // 점포 사진
    String address = ""; // 점포 주소
    public RestraurantCh(String title, int img, String address) {
        super();
        this.title = title;
        this.img = img;
        this.address = address;
    }
    public RestraurantCh() {}
}