package com.example.steadtlot.westernfoods;

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

public class western_listActivity extends Activity {
    ArrayList<Restraurant> rs = new ArrayList<Restraurant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.western_list);
        setTitle("양 식");

        rs.add(new Restraurant("구스테이블 범계점",R.drawable.cf_W1, "경기 안양시 동안구 평촌대로223번길 28"));
        rs.add(new Restraurant("서가앤쿡 범계점", R.drawable.cf_W2, "경기 안양시 동안구 평촌대로223번길 31"));
        rs.add(new Restraurant("어글리스토브 범계점", R.drawable.cf_W3, "경기 안양시 동안구 평촌대로223번길 36"));
        rs.add(new Restraurant("블랙스톤 안양1번가", R.drawable.cf_W4, "경기 안양시 만안구 장내로149번길 49"));
        rs.add(new Restraurant("로렌스308 안양1번가", R.drawable.cf_W5, "경기 안양시 만안구 장내로139번길 7"));
        rs.add(new Restraurant("서가앤쿡 안양1번가", R.drawable.cf_W6, "경기 안양시 만안구 장내로149번길 15"));
        rs.add(new Restraurant("어반시크 안양1번가", R.drawable.cf_W7, "경기 안양시 만안구 안양로292번길 27"));
        rs.add(new Restraurant("코벤트가든 안양1번가", R.drawable.cf_W8, "경기 안양시 만안구 만안로 232"));
        rs.add(new Restraurant("lululala 안양1번가", R.drawable.cf_W9, "경기 안양시 만안구 안양로304번길 25"));
        rs.add(new Restraurant("The pan 성결대점", R.drawable.cf_W10, "경기도 안양시 만안구 안양동 601-18"));
        rs.add(new Restraurant("기지개 피자 성결대점", R.drawable.cf_W11, "경기도 안양시 만안구 안양8동 594-1"));



        MyAdapter adapter = new MyAdapter(
                getApplicationContext(),
                R.layout.western_row,
                rs);

        ListView listView = (ListView)findViewById(R.id.listviewWestern);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        WesternListDetail.class);

                intent.putExtra("title", rs.get(position).title);
                intent.putExtra("img", rs.get(position).img);
                intent.putExtra("address", rs.get(position).address);

                startActivity(intent);
            }
        });
        //final String[] jpr = {"하카타", "이찌방", "고베규카츠 안양1번가점", "아오리라멘 범계점", "교토가츠규", "라멘키분", "산쪼메 안양점",
        //"도쿄라멘 안양일번가점", "홍대돈부리 안양1번가점", "고베규카츠 안양범계점", "오늘은 수제돈까스", "스시히로바미니 안양점"};

        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, jpr);
        //listView.setAdapter(adapter);


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
        TextView tvName = (TextView)convertView.findViewById(R.id.tvwta01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvwta02);

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