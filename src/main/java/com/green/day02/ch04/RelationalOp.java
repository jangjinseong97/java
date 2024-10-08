package com.green.day02.ch04;

public class RelationalOp {
    public static void main(String[] args) {
        //관계연산자 "결과 타입은 boolean"
        int n1 = 3, n2 = 2, n3 = 7;
        float n4 = 7.0f;
        float n5 = (float)7.1; // f없이 작성하고싶으면
        System.out.printf("%d >= %d : %b\n", n1, n2, (n1 >= n2));
        System.out.printf("%d >= %d : %b\n", n1, n2, (n1 <= n2));
        System.out.printf("%f == %d : %b\n", n4, n3, (n4 == n3));
        // n4와 n3은 타입이 달라 계산이 안되지만
        // 실제로는 float으로 인해 자동형변환이 되어 7.0 7.0으로 되어 true가 된다.
    }
}
