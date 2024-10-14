package com.green.day05.ch06;

public class Mission06_2_1 {

    /*
    인자로 원의 반지름 정보를 전달하면 원의 넓이를 계산하여 반환하는
    메소드와 원의 둘레를 계산하여 반환하는 메소드를 각각 정의
    이 둘을 호출하는 main메소드 정의
     */
    public static void main(String[] args) {
        circleImpo(7);
    }
    static void circleImpo(double n){
        length(n);
        extent(n);
    }
    static void length(double n){
        System.out.printf("둘레는 %f 입니다.\n", 2 * 3.14 * n);
    }
    static void extent(double n){
        System.out.printf("넓이는 %f 입니다.\n", 3.14 * n * n);

    }
}
