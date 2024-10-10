package com.green.day03.ch05;

public class MissionContinue {
    public static void main(String[] args) {
        /*
        ContinueBasic의 while문을 for문으로
         */
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
        int ct = 0;
        for(int i = 1 ; i<100; i++){
            if(((i % 5) != 0) || ((i % 7) != 0)){
                continue;
            }
            ct++;
            System.out.println("i: " + i);
        }
        System.out.println("ct: " + ct);

        int count1 = 0;
        for(int k = 1 ; k<100; k++){
            if((k % 5) == 0 && (k % 7) == 0){
                count1++;
                System.out.println("k: " + k);
            }
        }
        System.out.println("count1: " +count1);
    }
}
