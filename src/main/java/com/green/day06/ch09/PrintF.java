package com.green.day06.ch09;

public class PrintF {
    public static void main(String[] args) {
        final int MAX_SIZE = 100;
        // final 변수를 고정할떄(즉 상수로 만드는것)
        final char CONST_CHAR= '상';
        final int CONST_ASSIGNED;

        int a = 100;
        System.out.printf("%s \n", a);
        CONST_ASSIGNED=12;

        //System.out.printf("상수 1: %d\n", MAX_SIZE + "\n"); //문제가 있음.
        System.out.printf("상수 1: %d\n", MAX_SIZE); //해결방법(1)
        System.out.printf("상수 1: %s\n", MAX_SIZE);
        // 문자열을 반환하지만 int와 double등의 값을 자동으로 문자열로 바꾸어 출력도 해줌
        // 그래서 100이 출력이 되는것 하지만 이떄 출력된 100은 int가 아닌 String
        System.out.printf("상수 1: %s", MAX_SIZE + "\n"); //해결방법(2)
        System.out.printf("상수 2: %c\n", CONST_CHAR);
        System.out.printf("상수 3: %d\n", CONST_ASSIGNED);

    }
}
