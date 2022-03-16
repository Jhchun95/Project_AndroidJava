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

public class Western_listActivity extends Activity {
    ArrayList<RestraurantWt> rsw = new ArrayList<RestraurantWt>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.western_list);
        setTitle("양 식");

        rsw.add(new RestraurantWt("구스테이블 범계점",R.drawable.wt_01, "안양시 동안구 평촌대로223번길 28"));
        rsw.add(new RestraurantWt("서가앤쿡 범계점", R.drawable.wt_02, "안양시 동안구 평촌대로223번길 31"));
        rsw.add(new RestraurantWt("어글리스토브 범계점", R.drawable.wt_03, "안양시 동안구 평촌대로223번길 36"));
        rsw.add(new RestraurantWt("블랙스톤 안양1번가", R.drawable.wt_04, "안양시 만안구 장내로149번길 49"));
        rsw.add(new RestraurantWt("로렌스308 안양1번가", R.drawable.wt_05, "안양시 만안구 장내로139번길 7"));
        rsw.add(new RestraurantWt("서가앤쿡 안양1번가", R.drawable.wt_06, "안양시 만안구 장내로149번길 15"));
        rsw.add(new RestraurantWt("어반시크 안양1번가", R.drawable.wt_07, "안양시 만안구 안양로292번길 27"));
        rsw.add(new RestraurantWt("코벤트가든 안양1번가", R.drawable.wt_08, "안양시 만안구 만안로 232"));
        rsw.add(new RestraurantWt("lululala 안양1번가", R.drawable.wt_09, "안양시 만안구 안양로304번길 25"));
        rsw.add(new RestraurantWt("The pan 성결대점", R.drawable.wt_10, "안양시 만안구 안양동 601-18"));
        rsw.add(new RestraurantWt("기지개 피자 성결대점", R.drawable.wt_11, "안양시 만안구 안양8동 594-1"));



        MyAdapterWt adapter = new MyAdapterWt(
                getApplicationContext(),
                R.layout.wt_row,
                rsw);

        ListView listView = (ListView)findViewById(R.id.listviewWt);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        WtListDetail.class);

                intent.putExtra("title", rsw.get(position).title);
                intent.putExtra("img", rsw.get(position).img);
                intent.putExtra("address", rsw.get(position).address);

                if(position == 0){
                    Intent intent0 = new Intent(Western_listActivity.this, Wt00Gustable.class);
                    startActivity(intent0);
                }
                if(position == 1){
                    Intent intent1 = new Intent(Western_listActivity.this, Wt01SeogaBg.class);
                    startActivity(intent1);
                }
                if(position == 2){
                    Intent intent2 = new Intent(Western_listActivity.this, Wt02Uglystove.class);
                    startActivity(intent2);
                }
                if(position == 3){
                    Intent intent3 = new Intent(Western_listActivity.this, Wt03Blackstone.class);
                    startActivity(intent3);
                }
                if(position == 4){
                    Intent intent4 = new Intent(Western_listActivity.this, Wt04Laurens.class);
                    startActivity(intent4);
                }
                if(position == 5){
                    Intent intent5 = new Intent(Western_listActivity.this, Wt05SeogaA1.class);
                    startActivity(intent5);
                }
                if(position == 6){
                    Intent intent6 = new Intent(Western_listActivity.this, Wt06Urbanchic.class);
                    startActivity(intent6);
                }
                if(position == 7){
                    Intent intent7 = new Intent(Western_listActivity.this, Wt07Covent.class);
                    startActivity(intent7);
                }
                if(position == 8){
                    Intent intent8 = new Intent(Western_listActivity.this, Wt08Lululala.class);
                    startActivity(intent8);
                }
                if(position == 9){
                    Intent intent9 = new Intent(Western_listActivity.this, Wt09Thepan.class);
                    startActivity(intent9);
                }
                if(position == 10){
                    Intent intent10 = new Intent(Western_listActivity.this, Wt10Gijigae.class);
                    startActivity(intent10);
                }
            }
        });
    }
}

class MyAdapterWt extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<RestraurantWt> rsw;
    LayoutInflater inf;



    public MyAdapterWt(Context context, int layout, ArrayList<RestraurantWt> rs) {
        this.context = context;
        this.layout = layout;
        this.rsw = rs;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return rsw.size();
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
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivwt01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvwt01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvwt02);

        RestraurantWt m = rsw.get(position);
        imageView.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.address);

        return convertView;
    }
}

class RestraurantWt {
    String title = ""; // 점포명
    int img; // 점포 사진
    String address = ""; // 점포 주소
    public RestraurantWt(String title, int img, String address/*, int db*/) {
        super();
        this.title = title;
        this.img = img;
        this.address = address;
    }
    public RestraurantWt() {}
}