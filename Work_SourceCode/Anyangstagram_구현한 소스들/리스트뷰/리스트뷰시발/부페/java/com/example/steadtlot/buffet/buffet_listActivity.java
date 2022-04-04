package com.example.steadtlot.buffet;



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

public class buffet_listActivity extends Activity {
    ArrayList<Restraurant> rs = new ArrayList<Restraurant>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buffet_list);
        setTitle("부 페");

        rs.add(new Restraurant("쿠우쿠우 범계점",R.drawable.cf_BFqooqoo1, "경기 안양시 동안구 평촌대로223번길 52"));
        rs.add(new Restraurant("계절밥상 범계점", R.drawable.cf_BFseason2, "경기 안양시 동안구 시민대로 180"));
        rs.add(new Restraurant("애슐리 범계점", R.drawable.cf_BFashley3, "경기 안양시 동안구 동안로 119"));
        rs.add(new Restraurant("끌레드쉐프 범계점", R.drawable.cf_BFccledor4, "경기 안양시 동안구 시민대로 180 롯데백화점평촌점 10F"));
        rs.add(new Restraurant("스시스미스 안양1번가", R.drawable.cf_BFSushi5, "경기 안양시 만안구 안양로304번길 18"));
        rs.add(new Restraurant("착한돼지 안양1번가", R.drawable.cf_BFgoodpig6, "경기 안양시 만안구 장내로143번길 37"));
        rs.add(new Restraurant("풀잎채 안양1번가", R.drawable.cf_BFGrass7, "경기 안양시 만안구 만안로 232 롯데백화점 안양점 지하 1층"));
        rs.add(new Restraurant("우리뷔페 안양1번가", R.drawable.cf_BFWoori8, "경기 안양시 만안구 안양로 303"));
        rs.add(new Restraurant("한맛외식 명학역", R.drawable.cf_BFHan9, "경기 안양시 만안구 만안로 49 호정타워"));
        rs.add(new Restraurant("호남한식 만안구", R.drawable.cf_BFHonam10, "경기 안양시 만안구 수리산로 32"));


        MyAdapter adapter = new MyAdapter(
                getApplicationContext(),
                R.layout.bf_row,
                rs);

        ListView listView = (ListView)findViewById(R.id.listviewBF);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        BFListDetail.class);

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
        ImageView imageView = (ImageView)convertView.findViewById(R.id.ivbf01);
        TextView tvName = (TextView)convertView.findViewById(R.id.tvbfa01);
        TextView tvInfo = (TextView)convertView.findViewById(R.id.tvbfa02);

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