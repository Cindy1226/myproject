package com.cindy;

public class Vip {
    public static void main(String[] args) {
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",800);
        Customer c3 = new SilverCostumer("0003",2000);
        c1.print();
        c2.print();
        c3.print();
    }
}