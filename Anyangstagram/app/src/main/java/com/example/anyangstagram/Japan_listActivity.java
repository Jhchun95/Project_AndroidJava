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

public class Japan_listActivity extends Activity {
    ArrayList<Restraurant> rs = new ArrayList<Restraurant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.japan_list);
        setTitle("일 식");

        rs.add(new Restraurant("하카타",R.drawable.jp_hakata, "안양시 만안구 성결대학로 33-1"));
        rs.add(new Restraurant("고베규카츠 안양1번가점", R.drawable.jp_kobegyu, "안양시 만안구 안양로304번길 31"));
        rs.add(new Restraurant("고베규카츠 안양범계점", R.drawable.jp_kobe_gyu, "안양시 동안구 평촌대로223번길 11"));
        rs.add(new Restraurant("교토가츠규 안양범계역점", R.drawable.jp_kyoto, "안양시 동안구 평촌대로223번길 41"));
        rs.add(new Restraurant("스시히로바미니 안양점", R.drawable.jp_sushihiro, "안양시 만안구 만안로 214-1"));
        rs.add(new Restraurant("홍대개미 안양일번가점", R.drawable.jp_hondaiari, "안양시 만안구 장내로149번길 28"));
        rs.add(new Restraurant("아오리라멘 범계점", R.drawable.jp_aoriramen, "안양시 동안구 평촌대로217번길 27"));
        rs.add(new Restraurant("라멘키분", R.drawable.jp_ramenkibun, "안양시 동안구 평촌대로223번길 16"));
        rs.add(new Restraurant("오늘은 수제돈까스", R.drawable.jp_kyoutezukuri, "안양시 만안구 안양로111번길 33"));
        rs.add(new Restraurant("하쿠하쿠", R.drawable.jp_hakuhaku, "안양시 만안구 장내로143번길 12"));
        rs.add(new Restraurant("우마이식당", R.drawable.jp_umai, "안양시 동안구 평촌대로227번길 26"));
        rs.add(new Restraurant("사조회참치 인덕원점", R.drawable.jp_sazosasimi, "안양시 동안구 흥안대로 516"));
        rs.add(new Restraurant("마루샤브 평촌점", R.drawable.jp_marusyabu, "안양시 동안구 시민대로 281"));

        MyAdapter adapter = new MyAdapter(
                getApplicationContext(),
                R.layout.jp_row,
                rs);

        ListView listView = (ListView)findViewById(R.id.listviewJp);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        JpListDetail.class);

                intent.putExtra("title", rs.get(position).title);
                intent.putExtra("img", rs.get(position).img);
                intent.putExtra("address", rs.get(position).address);

                if(position == 0){
                    Intent intent0 = new Intent(Japan_listActivity.this, Jp00Hakata.class);
                    startActivity(intent0);
                }
                if(position == 1){
                    Intent intent1 = new Intent(Japan_listActivity.this, Jp01KobegyuA1.class);
                    startActivity(intent1);
                }
                if(position == 2){
                    Intent intent2 = new Intent(Japan_listActivity.this, Jp02KobegyuBg.class);
                    startActivity(intent2);
                }
                if(position == 3){
                    Intent intent3 = new Intent(Japan_listActivity.this, Jp03Kyotokatsugyu.class);
                    startActivity(intent3);
                }
                if(position == 4){
                    Intent intent4 = new Intent(Japan_listActivity.this, Jp04Sushihiro.class);
                    startActivity(intent4);
                }
                if(position == 5){
                    Intent intent5 = new Intent(Japan_listActivity.this, Jp05Hongdaiari.class);
                    startActivity(intent5);
                }
                if(position == 6){
                    Intent intent6 = new Intent(Japan_listActivity.this, Jp06Aoriramen.class);
                    startActivity(intent6);
                }
                if(position == 7){
                    Intent intent7 = new Intent(Japan_listActivity.this, Jp07Ramenkibun.class);
                    startActivity(intent7);
                }
                if(position == 8){
                    Intent intent8 = new Intent(Japan_listActivity.this, Jp08Kyoutezukuri.class);
                    startActivity(intent8);
                }
                if(position == 9){
                    Intent intent9 = new Intent(Japan_listActivity.this, Jp09Hakuhaku.class);
                    startActivity(intent9);
                }
                if(position == 10){
                    Intent intent10 = new Intent(Japan_listActivity.this, Jp10Umaishokudou.class);
                    startActivity(intent10);
                }
                if(position == 11){
                    Intent intent11 = new Intent(Japan_listActivity.this, Jp11Sazosasimi.class);
                    startActivity(intent11);
                }
            }
        });
    }
}

class MyAdapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<Restraurant> rs;
    LayoutInflater inf;

    public MyAdapter(Context context, int layout, ArrayList<Restraurant> rs) {
        this.context = context;
        this.layout = layout;
        this.rs = rs;
        inf = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return rs.size();
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
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivjp01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvja01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvja02);

        Restraurant m = rs.get(position);
        imageView.setImageResource(m.img);
        tvName.setText(m.title);
        tvInfo.setText(m.address);

        return convertView;
    }
}

class Restraurant {
    String title = ""; // 점포명
    int img; // 점포 사진
    String address = ""; // 점포 주소
    public Restraurant(String title, int img, String address) {
        super();
        this.title = title;
        this.img = img;
        this.address = address;
    }
    public Restraurant() {}
}