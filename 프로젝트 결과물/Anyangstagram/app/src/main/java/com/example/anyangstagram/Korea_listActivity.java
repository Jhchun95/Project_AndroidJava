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

public class Korea_listActivity extends Activity {
    ArrayList<RestraurantKr> rsk = new ArrayList<RestraurantKr>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korea_list);
        //setTitle("한 식");

        rsk.add(new RestraurantKr("대박집",R.drawable.kr_daebak, "안양시 만안구 성결대학로 8"));
        rsk.add(new RestraurantKr("북창동순두부 안양범계점", R.drawable.kr_bukchang, "안양시 동안구 평촌대로223번길 56"));
        rsk.add(new RestraurantKr("듬박이 범계점", R.drawable.kr_dumbak, "안양시 동안구 평촌대로223번길 36"));
        rsk.add(new RestraurantKr("허가네맛집", R.drawable.kr_heogane, "안양시 만안구 냉천로 4"));
        rsk.add(new RestraurantKr("무한갈비고수", R.drawable.kr_muhangalbi, "안양시 만안구 장내로139번길 56-5"));
        rsk.add(new RestraurantKr("곱창폭식", R.drawable.kr_gobchangpoksik, "안양시 만안구 장내로149번길 12"));
        rsk.add(new RestraurantKr("안양감자탕", R.drawable.kr_anyanggamjatang, "안양시 만안구 장내로 145"));
        rsk.add(new RestraurantKr("밥사랑", R.drawable.kr_babsarang, "안양시 동안구 평촌대로223번길 52"));
        rsk.add(new RestraurantKr("홍가네 영양센타", R.drawable.kr_honggane, "안양시 만안구 장내로140번길 11-13"));
        rsk.add(new RestraurantKr("호윤식당", R.drawable.kr_hoyun, "안양시 만안구 장내로140번길 11"));
        rsk.add(new RestraurantKr("순남시래기 안양범계역점", R.drawable.kr_sunnam, "안양시 동안구 평촌대로217번길 45"));
        rsk.add(new RestraurantKr("찌개마을502", R.drawable.kr_jjigaemaeul502, "안양시 만안구 장내로 151"));

        MyAdapterKr adapter = new MyAdapterKr(
                getApplicationContext(),
                R.layout.kr_row,
                rsk);

        ListView listview/*kr*/ = (ListView)findViewById(R.id.listviewKr);
        listview/*kr*/.setAdapter(adapter);

        listview/*kr*/.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        KrListDetail.class);

                intent.putExtra("titlekr", rsk.get(position).titlekr);
                intent.putExtra("imgkr", rsk.get(position).imgkr);
                intent.putExtra("addresskr", rsk.get(position).addresskr);

                /*startActivity(intent);*/

                if(position == 0){
                    Intent intent0 = new Intent(Korea_listActivity.this, Kr00Daebak.class);
                    startActivity(intent0);
                }
                if(position == 1){
                    Intent intent1 = new Intent(Korea_listActivity.this, Kr01Bukchang.class);
                    startActivity(intent1);
                }
                if(position == 2){
                    Intent intent2 = new Intent(Korea_listActivity.this, Kr02Dumbak.class);
                    startActivity(intent2);
                }
                if(position == 3){
                    Intent intent3 = new Intent(Korea_listActivity.this, Kr03Heogane.class);
                    startActivity(intent3);
                }
                if(position == 4){
                    Intent intent4 = new Intent(Korea_listActivity.this, Kr04Muhangalbi.class);
                    startActivity(intent4);
                }
                if(position == 5){
                    Intent intent5 = new Intent(Korea_listActivity.this, Kr05Gobchangpoksik.class);
                    startActivity(intent5);
                }
                if(position == 6){
                    Intent intent6 = new Intent(Korea_listActivity.this, Kr06Anyanggamjatang.class);
                    startActivity(intent6);
                }
                if(position == 7){
                    Intent intent7 = new Intent(Korea_listActivity.this, Kr07Ricesarang.class);
                    startActivity(intent7);
                }
                if(position == 8){
                    Intent intent8 = new Intent(Korea_listActivity.this, Kr08Honggane.class);
                    startActivity(intent8);
                }
                if(position == 9){
                    Intent intent9 = new Intent(Korea_listActivity.this, Kr09Hoyun.class);
                    startActivity(intent9);
                }
                if(position == 10){
                    Intent intent10 = new Intent(Korea_listActivity.this, Kr10Sunnam.class);
                    startActivity(intent10);
                }
                if(position == 11){
                    Intent intent11 = new Intent(Korea_listActivity.this, Kr11Jjigae.class);
                    startActivity(intent11);
                }
            }
        });
    }
}

class MyAdapterKr extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<RestraurantKr> rsk;
    LayoutInflater inf;

    public MyAdapterKr(Context context, int layout, ArrayList<RestraurantKr> rsk) {
        this.context = context;
        this.layout = layout;
        this.rsk = rsk;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return rsk.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
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
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivkr01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvkr01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvkr02);

        RestraurantKr m = rsk.get(position);
        imageView.setImageResource(m.imgkr);
        tvName.setText(m.titlekr);
        tvInfo.setText(m.addresskr);

        return convertView;
    }
}

class RestraurantKr {
    String titlekr = ""; // 점포명
    int imgkr; // 점포 사진
    String addresskr = ""; // 점포 주소
    public RestraurantKr(String titlekr, int imgkr, String addresskr) {
        super();
        this.titlekr = titlekr;
        this.imgkr = imgkr;
        this.addresskr = addresskr;
    }
    public RestraurantKr() {}
}
