package com.sales;

public class SilverCostumer extends Customer{
    public SilverCostumer(String level, int spent) {
        super(level, spent);
    }
    @Override
    public void print(){
        //float offMoney=(spent/1000)*off*1000;
        System.out.println(level+"\t"+spent+"\t"+(spent-backMoney())+"\t"+"("+backMoney()+")");
    }
}
