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

public class Buffet_listActivity extends Activity {
    ArrayList<RestraurantBf> rsb = new ArrayList<RestraurantBf>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buffet_list);
        setTitle("뷔 페");

        rsb.add(new RestraurantBf("쿠우쿠우 범계점",R.drawable.bf_qooqoo1, "안양시 동안구 평촌대로223번길 52"));
        rsb.add(new RestraurantBf("계절밥상 범계점", R.drawable.bf_season2, "안양시 동안구 시민대로 180"));
        rsb.add(new RestraurantBf("애슐리 범계점", R.drawable.bf_ashley3, "안양시 동안구 동안로 119"));
        rsb.add(new RestraurantBf("끌레드쉐프 범계점", R.drawable.bf_ccledor4, "안양시 동안구 시민대로 180 롯데백화점평촌점 10F"));
        rsb.add(new RestraurantBf("스시스미스 안양1번가", R.drawable.bf_sushi5, "안양시 만안구 안양로304번길 18"));
        rsb.add(new RestraurantBf("착한돼지 안양1번가", R.drawable.bf_goodpig6, "안양시 만안구 장내로143번길 37"));
        rsb.add(new RestraurantBf("풀잎채 안양1번가", R.drawable.bf_grass7, "안양시 만안구 만안로 232 롯데백화점 안양점 지하 1층"));
        rsb.add(new RestraurantBf("호남한식 만안구", R.drawable.bf_honam10, "안양시 만안구 수리산로 32"));

        MyAdapterBf adapter = new MyAdapterBf(
                getApplicationContext(),
                R.layout.bf_row,
                rsb);

        ListView listView = (ListView)findViewById(R.id.listviewBF);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        BfListDetail.class);

                intent.putExtra("title", rsb.get(position).title);
                intent.putExtra("img", rsb.get(position).img);
                intent.putExtra("address", rsb.get(position).address);

                if(position == 0){
                    Intent intent0 = new Intent(Buffet_listActivity.this, Bf00Qooqoo.class);
                    startActivity(intent0);
                }
                if(position == 1){
                    Intent intent1 = new Intent(Buffet_listActivity.this, Bf01Season.class);
                    startActivity(intent1);
                }
                if(position == 2){
                    Intent intent2 = new Intent(Buffet_listActivity.this, Bf02Ashley.class);
                    startActivity(intent2);
                }
                if(position == 3){
                    Intent intent3 = new Intent(Buffet_listActivity.this, Bf03Ccledor.class);
                    startActivity(intent3);
                }
                if(position == 4){
                    Intent intent4 = new Intent(Buffet_listActivity.this, Bf04Sumith.class);
                    startActivity(intent4);
                }
                if(position == 5){
                    Intent intent5 = new Intent(Buffet_listActivity.this, Bf05Goodpork.class);
                    startActivity(intent5);
                }
                if(position == 6){
                    Intent intent6 = new Intent(Buffet_listActivity.this, Bf06Grass.class);
                    startActivity(intent6);
                }
                if(position == 7){
                    Intent intent7 = new Intent(Buffet_listActivity.this, Bf07Honam.class);
                    startActivity(intent7);
                }
            }
        });
    }
}

class MyAdapterBf extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<RestraurantBf> rsb;
    LayoutInflater inf;

    public MyAdapterBf(Context context, int layout, ArrayList<RestraurantBf> rs) {
        this.context = context;
        this.layout = layout;
        this.rsb = rs;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return rsb.size();
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
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivbf01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvbf01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvbf02);

        RestraurantBf m = rsb.get(position);
        imageView.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.address);

        return convertView;
    }
}

class RestraurantBf {
    String title = ""; // 점포명
    int img; // 점포 사진
    String address = ""; // 점포 주소
    public RestraurantBf(String title, int img, String address) {
        super();
        this.title = title;
        this.img = img;
        this.address = address;
    }
    public RestraurantBf() {}
}