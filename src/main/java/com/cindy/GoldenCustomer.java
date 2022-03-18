package com.cindy;

public class GoldenCustomer extends SilverCostumer{
    public GoldenCustomer(String level, int spent) {
        super(level, spent);
        off=0.2f;
    }
}
