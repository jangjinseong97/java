package com.green.day04.ch05;

public class MissionForInFor4 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6.0)+3;
        // star 값만큼 피라미드 별 찍기

        for (int i = 1; i<=star; i++){
            for(int k=1; k<=i; k++){
                System.out.printf("*");
            }
            System.out.println();
        }
        // 0부터 시작하도록 익숙해지는것이 좋다
        System.out.println(star);
        int n = star;
        for (int i = 1; i<=star; i++){
            for(int m=n;m>1;m-- ) {
                System.out.printf(" ");
            }
            n--;
            int a = 2 * i;
            for(int k=1; k<=a; k++){
                System.out.printf("*");
            }
            System.out.println();


        }
    }
}