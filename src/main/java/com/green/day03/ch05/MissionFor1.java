package com.green.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        // 1부터 10까지의 곱의 결과를 출력하는 프로그렘을 for사용해서 작성
        int aa = 1;
        for(int i=1; i<11; i++){
            aa *= i;
        }
        // 곱이니 i=2부터 처리를하면 연산을 한번 줄일 수 있다.
        System.out.println(aa);
    }
}
