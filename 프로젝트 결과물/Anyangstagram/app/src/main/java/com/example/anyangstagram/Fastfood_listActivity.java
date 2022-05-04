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

public class Fastfood_listActivity extends Activity {
    ArrayList<RestraurantFf> rsf = new ArrayList<RestraurantFf>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fastfood_list);
        setTitle("패스트푸드");

        rsf.add(new RestraurantFf("맘스터치 성결대점", R.drawable.ff_ssmomstouch, "안양시 만안구 성결대학로 38"));
        rsf.add(new RestraurantFf("요거프레소 성결대점", R.drawable.ff_ssyogur, "안양시 만안구 성결대학로 36"));
        rsf.add(new RestraurantFf("피자스쿨 성결대점", R.drawable.ff_sspizzaschool, "안양시 만안구 성결대학로 28"));
        rsf.add(new RestraurantFf("롯데리아 만안구청점", R.drawable.ff_sslotte, "안양시 만안구 안양로 122 만안빌딩"));

        rsf.add(new RestraurantFf("맘스터치 범계점", R.drawable.ff_momstouch, "안양시 동안구 평촌대로223번길 65"));
        rsf.add(new RestraurantFf("모스버거 범계점", R.drawable.ff_mosburger, "안양시 동안구 평촌대로223번길 41"));
        rsf.add(new RestraurantFf("미스터피자 범계점", R.drawable.ff_mrpizza, "안양시 동안구 평촌대로223번길 55"));
        rsf.add(new RestraurantFf("오리지널시카고피자 범계점", R.drawable.ff_originalcikagopizza, "안양시 동안구 시민대로 214"));

        rsf.add(new RestraurantFf("맘스터치 안양1번가", R.drawable.ff_a1momstouch, "안양시 만안구 안양로304번길 4"));
        rsf.add(new RestraurantFf("미스터피자 안양1번가", R.drawable.ff_a1mrpizza, "안양시 만안구 안양로304번길 13"));
        rsf.add(new RestraurantFf("맥도날드 안양1번가", R.drawable.ff_a1macdonald, "안양시 만안구 안양로292번길 22"));
        rsf.add(new RestraurantFf("KFC 안양1번가", R.drawable.ff_a1kfc, "안양시 만안구 안양로292번길 7"));

        MyAdapterFf adapter = new MyAdapterFf(
                getApplicationContext(),
                R.layout.ff_row,
                rsf);

        ListView listView = (ListView)findViewById(R.id.listviewFf);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        Fastfood_listActivity.class);

                intent.putExtra("title", rsf.get(position).title);
                intent.putExtra("img", rsf.get(position).img);
                intent.putExtra("address", rsf.get(position).address);

                if(position == 0){
                    Intent intent0 = new Intent(Fastfood_listActivity.this, Ff00MomsSku.class);
                    startActivity(intent0);
                }
                if(position == 1){
                    Intent intent1 = new Intent(Fastfood_listActivity.this, Ff01YogurpressoSku.class);
                    startActivity(intent1);
                }
                if(position == 2){
                    Intent intent2 = new Intent(Fastfood_listActivity.this, Ff02PizzaschoolSku.class);
                    startActivity(intent2);
                }
                if(position == 3){
                    Intent intent3 = new Intent(Fastfood_listActivity.this, Ff03LotteriaMago.class);
                    startActivity(intent3);
                }
                if(position == 4){
                    Intent intent4 = new Intent(Fastfood_listActivity.this, Ff04MomsBg.class);
                    startActivity(intent4);
                }
                if(position == 5){
                    Intent intent5 = new Intent(Fastfood_listActivity.this, Ff05MosBg.class);
                    startActivity(intent5);
                }
                if(position == 6){
                    Intent intent6 = new Intent(Fastfood_listActivity.this, Ff06MisterBg.class);
                    startActivity(intent6);
                }
                if(position == 7){
                    Intent intent7 = new Intent(Fastfood_listActivity.this, Ff07CikagoBg.class);
                    startActivity(intent7);
                }
                if(position == 8){
                    Intent intent8 = new Intent(Fastfood_listActivity.this, Ff08MomsA1.class);
                    startActivity(intent8);
                }
                if(position == 9){
                    Intent intent9 = new Intent(Fastfood_listActivity.this, Ff09MisterA1.class);
                    startActivity(intent9);
                }
                if(position == 10){
                    Intent intent10 = new Intent(Fastfood_listActivity.this, Ff10MacA1.class);
                    startActivity(intent10);
                }
                if(position == 11){
                    Intent intent11 = new Intent(Fastfood_listActivity.this, Ff11KfcA1.class);
                    startActivity(intent11);
                }
            }
        });
    }
}

class MyAdapterFf extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<RestraurantFf> rsf;
    LayoutInflater inf;

    public MyAdapterFf(Context context, int layout, ArrayList<RestraurantFf> rsf) {
        this.context = context;
        this.layout = layout;
        this.rsf = rsf;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return rsf.size();
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
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivff01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvff01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvff02);

        RestraurantFf m = rsf.get(position);
        imageView.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.address);

        return convertView;
    }
}

class RestraurantFf {
    String title = ""; // 점포명
    int img; // 점포 사진
    String address = ""; // 점포 주소
    public RestraurantFf(String title, int img, String address) {
        super();
        this.title = title;
        this.img = img;
        this.address = address;
    }
    public RestraurantFf() {}
}