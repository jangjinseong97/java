package com.green.day03.ch05;

public class MissionForInFor {
    public static void main(String[] args) {
        // 중첩 for문으로 구구단 출력
        for(int i=2; i<10; i++){
            for(int k=1; k<10; k++){
                System.out.printf("%d x %d = %d\n", i, k, (i * k));
            }
            System.out.println("----------");
        }
    }
}
