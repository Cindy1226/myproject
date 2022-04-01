package com.sales;

public class PlatinumCostumer extends GoldenCustomer{
    public PlatinumCostumer(String level, int spent) {
        super(level, spent);
        off=0.3f;
    }
    public float platinumMoney(){
        float off2;
        off2 = 0.2f;
        return (spent/1000)*off2*1000;
    }
    @Override
    public void print() {
        System.out.println(level+"\t"+spent+"\t"+(spent-backMoney())+"\t"+"("+platinumMoney()+")");
    }
}
