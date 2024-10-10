package com.green.day03.ch05;

public class ContinueBasic {
    public static void main(String[] args) {
        int n = 0;
        int count = 0;
        while((n++) < 100){
            // n++ 이 먼저 실행됬으므로  n == 1인 상태에서 시작하는것
            if(((n % 5) != 0) || ((n % 7) != 0)){
                continue;
            }
            // continue 는 만난 순간 반복문의 처음(조건문 구간) 으로 돌아가는것
            count++;
            System.out.println("n: " + n);
        }
        System.out.println("count:" + count);
    }

}
