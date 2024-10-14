package com.green.day05.ch06;

public class Mission06_1_2 {
    public static void main(String[] args) {
        /*
        정수 둘을 인자로 전달받아 두 수의 '차의 절댓값'을 계산하여 출력하는 메소드와
        이 메소드를 호출하는 main 메소드를 정의
         */
        absolute(108, 10);
        absolute2(107,70);
    }
    public static void absolute2(int n1, int n2){
        System.out.printf("%d와 %d의 차의 절댓값은 %d 입니다.", n1, n2,
                (n1 > n2 ? (n1-n2) : (n2-n1)));
    }
    // 내가 한 방법

    public static void absolute(int n1, int n2){
        int r = n1 - n2;
        System.out.println(r < 0 ? -r : r);
    }
    // 또 다른 방법
}
