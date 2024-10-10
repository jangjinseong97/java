package com.green.day03.ch05;

public class MissionForInFor2 {
    public static void main(String[] args) {
        // 중첩 for문 구구단
        for (int i=1; i<10; i++) {
            for (int k=2; k<10; k++) {
                System.out.printf("%d x %d = %d\t", k, i, (i * k));
            }
            System.out.println();
        }
    }
}
