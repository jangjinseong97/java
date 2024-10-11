package com.green.day04.ch05;

public class Mission05_7_2 {
    public static void main(String[] args) {
        /*
        다음식을 만족하는 모든 a와 b를 구하는 프로그렘을 구하라
            A B
           +B A
           -----
            9 9
         */
        for (int i=0;i<10;i++){
            for(int k=0;k<10;k++){
                if(i+k==9){
                    System.out.printf("A: %d, B: %d\n",i,k);
                }
            }
        }
    }
}
