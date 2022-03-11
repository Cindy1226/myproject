package com.cindy;

public class Scoring {
    public static void main(String[] args) {
        student tom = new student("tom",80,60);
       // tom.name="Tom";
       // tom.Eng=80;
       // tom.Math=60;
        student amy=new student("amy",90,85);
        tom.print();
        amy.print();

        student s = new student();
        s.print();
        student bob = new student("bob",85,74);
        //bob.name="Bob";
        bob.Eng=85;
        bob.Math=74;
        bob.print();
        student ray = new student("ray",70,80);
       // ray.name="Ray";
        ray.Eng=70;
        ray.Math=80;
        ray.print();
        student ivy = new student("ivy",75,79);
       // ivy.name="Ivy";
        ivy.Eng=75;
        ivy.Math=79;
        ivy.print();
        GraduateStudent jay=new GraduateStudent("jay",65,82,79);
        jay.name="jay";
        jay.print();
    }
}
