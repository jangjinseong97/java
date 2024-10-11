package com.green.day04.ch05;

public class MissionForInFor5 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6.0)+3;
        int k = star;
        for(int i=0;i<star; i++){
            for(int n=k;n>1;n--){
                System.out.printf("_");
            }
            k--;
            for(int a=0;a<=i;a++){
                System.out.printf("*");
            }
            System.out.println();
        }
        System.out.println(star);
    }
}
