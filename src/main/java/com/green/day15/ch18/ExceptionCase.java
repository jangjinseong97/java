package com.green.day15.ch18;

public class ExceptionCase {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;


        System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));// 0으로 나눌수 없어서 런타임에러 발생
    }
}
