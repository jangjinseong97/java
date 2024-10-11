package com.green.etc;

public class ForInFor {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6.0)+3;
        for(int i=1;i<=star;i++){
            for(int k=star;k>0;k--){
                if(k>i){
                    System.out.printf("_");
                } else {
                    System.out.printf("*");
                }
                // 여기서 if else문을 print( k>i ? "_" : "*")로 바꾸면 조금더 보기 편해짐
            }
            System.out.println();
        }
        System.out.println(star);
    }
}
