package com.ticket;

public class Station {
    public static final  Station TAIPEI_STATION=new Station(100,"Taipei");
    public static final  Station TAICHUNG_STATION=new Station(100,"Taichung");
    public static final  Station KAOHSIUNG_STATION=new Station(100,"kaohsung");
    int id;
    String  name;
    public Station(int id,String name){
        this.name=name;
        this.id=id;

    }
}
