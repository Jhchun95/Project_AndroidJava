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

public class Bar_listActivity extends Activity {
    ArrayList<RestraurantBar> rsb = new ArrayList<RestraurantBar>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bar_list);
        setTitle("주 점");

        rsb.add(new RestraurantBar("하쿠하쿠 안양1번가",R.drawable.bar_a1hakuhaku, "안양시 만안구 장내로143번길 12"));
        rsb.add(new RestraurantBar("지스타에일 안양1번가",R.drawable.bar_a1gstaroil, "안양시 만안구 장내로143번길 30"));
        rsb.add(new RestraurantBar("아지트 안양1번가",R.drawable.bar_a1agit, "안양시 만안구 장내로139번길 58"));
        rsb.add(new RestraurantBar("임창정의 소주한잔",R.drawable.bar_a1sojuhanzan, "안양시 만안구 안양동 674-149"));
        rsb.add(new RestraurantBar("알콜트리 안양1번가",R.drawable.bar_a1alcholtree, "안양시 만안구 만안로 221"));
        rsb.add(new RestraurantBar("삼구포차 안양1번가",R.drawable.bar_a139pocha, "안양시 만안구 안양로292번길 13"));

        rsb.add(new RestraurantBar("교동전선생 범계점",R.drawable.bar_bggyodong, "안양시 동안구 평촌대로223번길 19"));
        rsb.add(new RestraurantBar("포차어게인 범계점",R.drawable.bar_bgpochaagain, "안양시 동안구 평촌대로223번길 31"));
        rsb.add(new RestraurantBar("에잇피스 범계점",R.drawable.bar_bgeightpiece, "안양시 동안구 평촌대로223번길 49"));
        rsb.add(new RestraurantBar("사니스펍앤그릴 범계점",R.drawable.bar_bgpopandgril, "안양시 동안구 평촌대로223번길 28"));

        rsb.add(new RestraurantBar("술도가전집 만안구청점",R.drawable.bar_sssouldoga, "안양시 만안구 성결대학로 12"));
        rsb.add(new RestraurantBar("옥이네칼국수 철이네포차",R.drawable.bar_ssoakpocha, "안양시 만안구 안양로 137"));
        rsb.add(new RestraurantBar("종로빈대떡 성결대점",R.drawable.bar_ssjongro, "안양시 만안구 만안로 25"));
        rsb.add(new RestraurantBar("자갈치회포차 성결대점",R.drawable.bar_ssjagalchi, "안양시 만안구 성결대학로 31"));



        MyAdapterBar adapter = new MyAdapterBar(
                getApplicationContext(),
                R.layout.bar_row,
                rsb);

        ListView listView = (ListView)findViewById(R.id.listviewBar);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        BarListDetail.class);

                intent.putExtra("title", rsb.get(position).title);
                intent.putExtra("img", rsb.get(position).img);
                intent.putExtra("address", rsb.get(position).address);

                if(position == 0){
                    Intent intent0 = new Intent(Bar_listActivity.this, Bar00Hakuhaku.class);
                    startActivity(intent0);
                }
                if(position == 1){
                    Intent intent1 = new Intent(Bar_listActivity.this, Bar01Gstar.class);
                    startActivity(intent1);
                }
                if(position == 2){
                    Intent intent2 = new Intent(Bar_listActivity.this, Bar02Agit.class);
                    startActivity(intent2);
                }
                if(position == 3){
                    Intent intent3 = new Intent(Bar_listActivity.this, Bar03Limchangjung.class);
                    startActivity(intent3);
                }
                if(position == 4){
                    Intent intent4 = new Intent(Bar_listActivity.this, Bar04Alcholtree.class);
                    startActivity(intent4);
                }
                if(position == 5){
                    Intent intent5 = new Intent(Bar_listActivity.this, Bar05ThreeNinePocha.class);
                    startActivity(intent5);
                }
                if(position == 6){
                    Intent intent6 = new Intent(Bar_listActivity.this, Bar06Gyodong.class);
                    startActivity(intent6);
                }
                if(position == 7){
                    Intent intent7 = new Intent(Bar_listActivity.this, Bar07Pochaagain.class);
                    startActivity(intent7);
                }
                if(position == 8){
                    Intent intent8 = new Intent(Bar_listActivity.this, Bar08Eightpiece.class);
                    startActivity(intent8);
                }
                if(position == 9){
                    Intent intent9 = new Intent(Bar_listActivity.this, Bar09PopandGril.class);
                    startActivity(intent9);
                }
                if(position == 10){
                    Intent intent10 = new Intent(Bar_listActivity.this, Bar10Souldoga.class);
                    startActivity(intent10);
                }
                if(position == 11){
                    Intent intent11 = new Intent(Bar_listActivity.this, Bar11OkChul.class);
                    startActivity(intent11);
                }
                if(position == 12){
                    Intent intent12 = new Intent(Bar_listActivity.this, Bar12Jongro.class);
                    startActivity(intent12);
                }
                if(position == 13){
                    Intent intent13 = new Intent(Bar_listActivity.this, Bar13Jagalchi.class);
                    startActivity(intent13);
                }
            }
        });
    }
}

class MyAdapterBar extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<RestraurantBar> rsb;
    LayoutInflater inf;

    public MyAdapterBar(Context context, int layout, ArrayList<RestraurantBar> rs) {
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
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivbar01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvbar01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvbar02);

        RestraurantBar m = rsb.get(position);
        imageView.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.address);

        return convertView;
    }
}

class RestraurantBar {
    String title = ""; // 점포명
    int img; // 점포 사진
    String address = ""; // 점포 주소
    public RestraurantBar(String title, int img, String address) {
        super();
        this.title = title;
        this.img = img;
        this.address = address;
    }
    public RestraurantBar() {}
}