package com.ticket;

public class Ticket {
    public static final int TAIPEI_STATION = 100;
    public static final int TAICHUNG_STATION = 200;
    public static final int KAOHSIUNG_STATION = 300;//類別層級的屬性,final:唯一常數,public:到處皆可用
    Station start;
    Station destination;
    int price;
    public Ticket(Station start,Station destination){
        this.start=start;
        this.destination=destination;

    }
    public void print(){
     //   taipeiStation=105;
    }
}
