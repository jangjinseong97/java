package com.green.day05.ch06;

public class ReculFatorial {
    public static void main(String[] args) {
        // 팩토리얼 만들기
        System.out.println(fatorial(4));
    }
    static int fatorial(int n){
        if(n == 1){
            return 1;
        } else {
            return n*fatorial(n-1);
        }
    }
}
