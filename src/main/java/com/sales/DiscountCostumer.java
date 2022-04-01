package com.sales;

public class DiscountCostumer extends Customer{
    public DiscountCostumer(String level, int spent) {
        super(level, spent);
    }

    @Override
    public float backMoney() {
        return super.backMoney();
    }

    public void print(){
        System.out.println(level+"\t"+spent+"\t"+spent*0.9);
    }
}
