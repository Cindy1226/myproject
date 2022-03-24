package com.practice;

public class Student {
    String name;
    int chi;
    int eng;
    int math;

    public Student(String name,int chi,int eng ,int math){
        this.name=name;
        this.chi=chi;
        this.eng=eng;
        this.math=math;
    }
    public int avg(){
        return (chi+eng+math)/3;
    }
    public void print(){
        System.out.println(name+"\t"+chi+"\t"+eng+"\t"+math+"\t"+avg());
    }
}

