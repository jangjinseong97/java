package com.green.day03.ch05;

public class MissionFor2 {
    public static void main(String[] args) {
        // 구구단 5단 출력하는 프로그렘 for문으로
        for(int i=1; i<10; i++){
            System.out.println("5 x " + i + " = " + (5 * i));
            System.out.printf("%d x %d = %d\n", 5, i, (5 * i));
        }
    }
}
