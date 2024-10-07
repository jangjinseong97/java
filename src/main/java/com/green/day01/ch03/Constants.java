package com.green.day01.ch03;

public class Constants {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        final char CONST_CHAR = '상';
        final int CONST_ASSIGNED;

        CONST_ASSIGNED = 12;
        System.out.printf("상수1 : %d\n", MAX_SIZE);
        System.out.printf("상수1 : %o\n", MAX_SIZE); //8진수로 표현 %o
        System.out.printf("상수2 : %c %n", CONST_CHAR); //문자형은 %c printf에선 %n로도 개행가능
        System.out.printf("상수3 : %d %n", CONST_ASSIGNED);
    }
}
