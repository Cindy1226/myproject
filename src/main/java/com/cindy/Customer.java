package com.cindy;

public class Customer {
    String level;
    int spent;
    float off=0.1f;
    int receive;


    public  Customer(String level, int spent) {
        this.level=level;
        this.spent=spent;

    }
    public float backMoney(){
        return (spent/1000)*off*1000;
    }
    public void print(){
        //float offMoney=(spent/1000)*off*1000;
        System.out.println(level+"\t"+spent+"\t"+(spent-backMoney()));
    }
}