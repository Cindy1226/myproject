package com.cindy;

public class GraduateStudent extends student{
    public GraduateStudent(String name,
                           int Eng,
                           int Math,
                           int thesis){
        super(name, Eng, Math);
        //this.name=name;
        //this.Eng=Eng;
        //this.Math=Math;
        this.thesis=thesis;
    }


    public void print() {
        System.out.println(name+"\t"+Eng+"\t"+ Math+"\t"+Getaverage()+"\t"+thesis);
    }
}
