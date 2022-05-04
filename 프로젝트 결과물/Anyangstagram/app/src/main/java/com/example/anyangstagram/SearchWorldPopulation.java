package com.example.anyangstagram;

/**
 * Created by 문경태 on 2018-06-21.
 */

public class SearchWorldPopulation {
    private String sort;
    private String name;
    private String place;
    private String address;
    private String number;
    private String price;
    private String price2;
    private String price3;
    private String newprice;

    public SearchWorldPopulation(String sort, String name, String place, String address, String number, String price, String price2, String price3, String newprice) {
        this.sort = sort;
        this.name = name;
        this.place = place;
        this.address = address;
        this.number = number;
        this.price = price;
        this.price2 = price2;
        this.price3 = price3;
        this.newprice = newprice;

    }

    public String getSort() {
        return this.sort;
    }

    public String getName() {
        return this.name;
    }

    public String getPlace() {
        return this.place;
    }

    public String getAddress() { return this.address; }

    public String getNumber() { return this.number; }

    public String getPrice() { return this.price; }

    public String getPrice2() { return this.price2; }

    public String getPrice3() { return this.price3; }

    public String getNewprice() { return this.newprice; }


}
