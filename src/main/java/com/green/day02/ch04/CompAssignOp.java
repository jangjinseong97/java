package com.green.day02.ch04;

public class CompAssignOp {
    public static void main(String[] args) {
        // 복합 대입 연산자
        int n1 = 10;
        // 기존 n1에 +2를 하고 싶을때
        n1 = n1 + 2;

        int n2 = 10;
        n2 += 2; // 이런식으로 줄여서 쓸수 있는데 이를 복합 대입 연산자
        System.out.printf("n1 : %d \nn2 : %d\n", n1, n2);

        int n3 = 5;
        n3 %= 3;
        int n4 = 5;
        n4 *=3;
        System.out.println(n3 + "   " + n4);
        // 복합 대입 연산자는 모든 연산자들을 사용 가능
    }
}
