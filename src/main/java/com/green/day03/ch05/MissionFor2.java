package com.green.day03.ch05;

public class MissionFor2 {
    public static void main(String[] args) {
        // 구구단 5단 출력하는 프로그렘 for문으로
        int dan = 5;
        for(int i=1; i<10; i++){
            System.out.println("5 x " + i + " = " + (5 * i));
            System.out.printf("%d x %d = %d\n", 5, i, (5 * i));
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
            //5가 중복되니 미리 int로 변수를 지정해서 사용 이때 int dan = 5; 이것을 매직 넘버 라고 한다.
        }
    }
}
