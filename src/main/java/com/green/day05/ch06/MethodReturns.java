package com.green.day05.ch06;

public class MethodReturns {
    public static void main(String[] args) {
        int result;
        result = adder(4,5);

        System.out.printf("%d + %d = %d\n", 4, 5, result);
        System.out.printf("%.2f x %.2f = %.2f\n", 3.5, 3.5, square(3.5));
    }
    static double square(double n){
        return n*n;
        // 사각형의 넓이
    }
    static int adder(int n1, int n2){
        // int r = n1 + n2;
        // return r; 과 같은방식
        return n1 + n2;
    }
}
