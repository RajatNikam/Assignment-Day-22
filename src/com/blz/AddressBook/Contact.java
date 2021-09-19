package com.blz.Assignment22;

public class Contact {
    String fname;
    String sname;
    String adrs;
    String city;
    String state;
    String zipcode;
    String no;
    String mail;

    @Override
    public String toString() {
        return "Contact{" +
                "fname='" + fname + '\'' +
                ", sname='" + sname + '\'' +
                ", adrs='" + adrs + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipcode='" + zipcode + '\'' +
                ", no='" + no + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }

    public Contact(String fname, String sname, String adrs, String city, String state, String zipcode, String no, String mail) {
        this.fname = fname;
        this.sname = sname;
        this.adrs = adrs;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
        this.no = no;
        this.mail = mail;
    }
}