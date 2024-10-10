package com.green.day03.ch05;

public class WhileBasic {
    public static void main(String[] args) {
        int n = 0;
        while(n < 5){
            System.out.println("I like Java " + n);
            n++;

//            System.out.println("I like Java " + (n++)); 위의 코드를 1줄로 줄이면
        }
        // while 문은 소괄호 안의 답이 true 가 되는 한 반복하고
        // false 가 되는 순간 while 문을 종료한다.
        /*
        3가지 요소가 필수
        1. 인덱스 초기화(값 초기화)  int n = 0;
        2. 비교문(식)              n < 0
        3. 증감식 >>              n++
         */
        System.out.println("--ㄲㅌ--");
    }
}
