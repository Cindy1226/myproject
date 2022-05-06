package com.sales;

import java.util.ArrayList;
import java.util.List;

public class Vip {
    public static void main(String[] args) {
        List<Customer>custumers=new ArrayList<>();
        custumers.add(new Customer("0001",1200));
        custumers.add(new Customer("0002",800));
        custumers.add( new SilverCostumer("0003",2000));


        //Customer c1 = new Customer("0001",1200);
        //Customer c2 = new Customer("0002",800);
        //Customer c3 = new SilverCostumer("0003",2000);
        //Customer c4 = new GoldenCustomer("0004",5000);
        //DiscountCostumer c5 = new DiscountCostumer("006",900);
        //PlatinumCostumer c6 = new PlatinumCostumer("007",1000);
        for (int i = 0; i <6 ; i++) {
            custumers.get(i).print();
        }


        //c1.print();
        //c2.print();
        //c3.print();
        //c4.print();
        //c5.print();
        //c6.print();
    }
}