package com.green.day01.ch01;

public class Ch01Mission02 {
    public static void main(String[] args) {
        System.out.println("2 + 5 = " + 2 + 5);
        // 가장 왼쪽부터 연산하므로 앞에 2가 문자열로 고정이 된 후 뒤에 5도 문자열이 되어 2+5=25가 나온다
        System.out.println("2 + 5 = " + (2 + 5));
        // 소괄호로 묶어 주었기에 소괄호 안부터 계산이 된 이후 왼쪽부터 계산이 되어 정상적으로 2+5=7이 나온다
    }
}
