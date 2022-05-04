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
 * Created by 문경태 on 2018-05-25.
 */

public class Cafe_listActivity extends Activity {
    ArrayList<RestraurantCf> rscf = new ArrayList<RestraurantCf>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_list);
        setTitle("카페/디저트");

        rscf.add(new RestraurantCf("엔젤리너스 범계점",R.drawable.cf_01, "안양시 동안구 평촌대로223번길 56"));
        rscf.add(new RestraurantCf("탐앤탐스 범계점", R.drawable.cf_02, "안양시 동안구 평촌대로223번길 68"));
        rscf.add(new RestraurantCf("빽다방 범계점", R.drawable.cf_03, "안양시 동안구 평촌대로223번길 42"));
        rscf.add(new RestraurantCf("스타벅스 범계점", R.drawable.cf_04, "안양시 동안구 평촌대로 223"));
        rscf.add(new RestraurantCf("설빙 안양1번가", R.drawable.cf_05, "안양시 만안구 장내로139번길 35"));
        rscf.add(new RestraurantCf("도쿄빙수 안양1번가", R.drawable.cf_06, "안양시 만안구 안양로304번길 19 2층 도쿄빙수"));
        rscf.add(new RestraurantCf("kafe await 안양1번가", R.drawable.cf_07, "안양시 만안구 장내로139번길 51"));
        rscf.add(new RestraurantCf("쁘띠렌 안양1번가", R.drawable.cf_08, "안양시 만안구 안양로304번길 22"));
        rscf.add(new RestraurantCf("개와 고양이의 시간 만안구점", R.drawable.cf_09, "안양시 만안구 냉천로 31"));
        rscf.add(new RestraurantCf("본아미치 성결대", R.drawable.cf_10, "안양시 만안구 성결대학로 2"));
        rscf.add(new RestraurantCf("EDIYA 커피 성결대", R.drawable.cf_11, "안양시 만안구 냉천로2"));


        MyAdapterCf adapter = new MyAdapterCf(
                getApplicationContext(),
                R.layout.cf_row,
                rscf);

        ListView listView = (ListView)findViewById(R.id.listviewCf);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        CfListDetail.class);

                intent.putExtra("title", rscf.get(position).title);
                intent.putExtra("img", rscf.get(position).img);
                intent.putExtra("address", rscf.get(position).address);

                if(position == 0){
                    Intent intent0 = new Intent(Cafe_listActivity.this, Cf00AngelinusBg.class);
                    startActivity(intent0);
                }
                if(position == 1){
                    Intent intent1 = new Intent(Cafe_listActivity.this, Cf01TomnToms.class);
                    startActivity(intent1);
                }
                if(position == 2){
                    Intent intent2 = new Intent(Cafe_listActivity.this, Cf02Bback.class);
                    startActivity(intent2);
                }
                if(position == 3){
                    Intent intent3 = new Intent(Cafe_listActivity.this, Cf03StarBucks.class);
                    startActivity(intent3);
                }
                if(position == 4){
                    Intent intent4 = new Intent(Cafe_listActivity.this, Cf04SnowIceBg.class);
                    startActivity(intent4);
                }
                if(position == 5){
                    Intent intent5 = new Intent(Cafe_listActivity.this, Cf05TokyoIceBg.class);
                    startActivity(intent5);
                }
                if(position == 6){
                    Intent intent6 = new Intent(Cafe_listActivity.this, Cf06KafeawaitA1.class);
                    startActivity(intent6);
                }
                if(position == 7){
                    Intent intent7 = new Intent(Cafe_listActivity.this, Cf07PetitereineA1.class);
                    startActivity(intent7);
                }
                if(position == 8){
                    Intent intent8 = new Intent(Cafe_listActivity.this, Cf08DogandCat.class);
                    startActivity(intent8);
                }
                if(position == 9){
                    Intent intent9 = new Intent(Cafe_listActivity.this, Cf09BuonAmici.class);
                    startActivity(intent9);
                }
                if(position == 10){
                    Intent intent10 = new Intent(Cafe_listActivity.this, Cf10EDIYA.class);
                    startActivity(intent10);
                }
            }
        });
    }
}

class MyAdapterCf extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<RestraurantCf> rscf;
    LayoutInflater inf;

    public MyAdapterCf(Context context, int layout, ArrayList<RestraurantCf> rs) {
        this.context = context;
        this.layout = layout;
        this.rscf = rs;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return rscf.size();
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
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivcf01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvcf01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvcf02);

        RestraurantCf m = rscf.get(position);
        imageView.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.address);

        return convertView;
    }
}

class RestraurantCf {
    String title = ""; // 점포명
    int img; // 점포 사진
    String address = ""; // 점포 주소
    public RestraurantCf(String title, int img, String address) {
        super();
        this.title = title;
        this.img = img;
        this.address = address;
    }
    public RestraurantCf() {}
}