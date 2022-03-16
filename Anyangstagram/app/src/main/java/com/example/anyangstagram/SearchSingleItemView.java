package com.example.anyangstagram;

/**
 * Created by 문경태 on 2018-06-21.
 */

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.TextView;

public class SearchSingleItemView extends Activity {
    // Declare Variables
    TextView txtsort;
    TextView txtname;
    TextView txtplace;
    TextView txtaddress;
    TextView txtnumber;
    TextView txtprice;
    TextView txtprice2;
    TextView txtprice3;
    TextView txtnewprice;


    String sort;
    String name;
    String place;
    String address;
    String number;
    String price;
    String price2;
    String price3;
    String newprice;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search_singleitemview);
        // Retrieve data from MainActivity on item click event
        Intent i = getIntent();
        // Get the results of sort
        sort = i.getStringExtra("sort");
        // Get the results of name
        name = i.getStringExtra("name");
        // Get the results of place
        place = i.getStringExtra("place");

        address = i.getStringExtra("address");

        number = i.getStringExtra("number");

        price = i.getStringExtra("price");

        price2 = i.getStringExtra("price2");

        price3 = i.getStringExtra("price3");

        newprice = i.getStringExtra("newprice");


        // Locate the TextViews in singleitemview.xml
        txtsort = (TextView) findViewById(R.id.sort);
        txtname = (TextView) findViewById(R.id.name);
        txtplace = (TextView) findViewById(R.id.place);
        txtaddress = (TextView) findViewById(R.id.address);
        txtnumber = (TextView) findViewById(R.id.number);
        txtprice = (TextView) findViewById(R.id.price);
        txtprice2 = (TextView) findViewById(R.id.price2);
        txtprice3 = (TextView) findViewById(R.id.price3);
        txtnewprice = (TextView) findViewById(R.id.newprice);


        // Load the results into the TextViews
        txtsort.setText(sort);
        txtname.setText(name);
        txtplace.setText(place);
        txtaddress.setText(address);
        txtnumber.setText(number);
        txtprice.setText(price);
        txtprice2.setText(price2);
        txtprice3.setText(price3);
        txtnewprice.setText(newprice);
    }
}