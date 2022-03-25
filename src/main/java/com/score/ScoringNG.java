package com.score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] name ={"Tom","Amy","Bob","Ray","Ivy"};
        int[] Eng={80,90,85,70,75};
        int[] Math={60,85,74,80,79};
        for (int i = 0; i < 5; i++) {
            if (i!=1){
                System.out.println(name[i]+"\t"+Eng[i]+"\t"+Math[i]+"\t"+(Eng[i]+Math[i])/2);
            }

        }

    }
}
