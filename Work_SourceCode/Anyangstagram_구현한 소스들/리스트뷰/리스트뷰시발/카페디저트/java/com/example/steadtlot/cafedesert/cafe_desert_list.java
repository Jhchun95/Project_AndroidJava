package com.example.steadtlot.cafedesert;

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

public class cafe_desert_list extends Activity {
    ArrayList<Restraurant> rs = new ArrayList<Restraurant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cafe_desert_list);
        setTitle("카페/디저트");

        rs.add(new Restraurant("엔젤리너스 범계점",R.drawable.cf_CD1, "경기 안양시 동안구 평촌대로223번길 56"));
        rs.add(new Restraurant("탐앤탐스 범계점", R.drawable.cf_CD2, "경기 안양시 동안구 평촌대로223번길 68"));
        rs.add(new Restraurant("빽다방 범계점", R.drawable.cf_CD3, "경기 안양시 동안구 평촌대로223번길 42"));
        rs.add(new Restraurant("스타벅스 범계점", R.drawable.cf_CD4, "경기 안양시 동안구 평촌대로 223"));
        rs.add(new Restraurant("설빙 안양1번가", R.drawable.cf_CD5, "경기 안양시 만안구 장내로139번길 35"));
        rs.add(new Restraurant("도쿄빙 안양1번가", R.drawable.cf_CD6, "경기 안양시 만안구 안양로304번길 19 2층 도쿄빙수"));
        rs.add(new Restraurant("kafe await 안양1번", R.drawable.cf_CD7, "경기 안양시 만안구 장내로139번길 51"));
        rs.add(new Restraurant("쁘띠렌 안양1번가", R.drawable.cf_CD8, "경기 안양시 만안구 안양로304번길 22"));
        rs.add(new Restraurant("개와 고양이의 시간 만안구점", R.drawable.cf_CD9, "경기 안양시 만안구 냉천로 31"));
        rs.add(new Restraurant("본아미치 성결대", R.drawable.cf_CD10, "경기 안양시 만안구 성결대학로 2"));
        rs.add(new Restraurant("EDIYA 커피 성결대", R.drawable.cf_CD11, "경기 안양 만안구 냉천로2"));


        MyAdapter adapter = new MyAdapter(
                getApplicationContext(),
                R.layout.cafe_desert_row,
                rs);

        ListView listView = (ListView)findViewById(R.id.listviewCf);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        CafeDesertListDetail.class);

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
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivCD01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvCDa01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvCDa02);

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