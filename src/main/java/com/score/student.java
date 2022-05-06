package com.score;

public class student implements Printable {
    String name;
    int Eng;
    int Math;
    int thesis;
    public student(String name){
        this.name=name;
    }
    public student(){
        this("joy",-1,-1);
    }
    public student(String name,int Eng,int Math){
        this(name);
        // this.name=name;
        this.Eng=Eng;
        this.Math=Math;
    }

    @Override
    public void print() {
        int average = (Eng + Math) / 2;
        System.out.print(name + "\t" + Eng + "\t" + Math + "\t" + Getaverage());
        if (average < 60) {
            System.out.print("*");

        }
        System.out.println();
    }
    /* public void print(){
        int average =(Eng+Math)/2;
        System.out.print(name+"\t"+Eng+"\t"+Math+"\t"+Getaverage());
        if (average<60){
            System.out.print("*");
        }
        System.out.println();

    }*/

        public int Getaverage () {
            return (Eng + Math) / 2;

        }
    }

