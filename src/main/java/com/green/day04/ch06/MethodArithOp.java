package com.green.day04.ch06;

public class MethodArithOp {
    public static void main(String[] args) {
        int n1 = 7, n2 = 3;
        subtract(n1,n2);
        multiply(4,5);
        float r = divide(10,3);
        System.out.println(r);
        int r2 = modulo(10,4);
        System.out.println(r2);
    }
    static void subtract(int n1, int n2){
        System.out.printf("%d - %d = %d\n", n1, n2, (n1-n2));
    }
    static void multiply(int n1, int n2){
        System.out.printf("%d x %d = %d\n", n1, n2, (n1 * n2));

    }
    static float divide(int n1, int n2){
        return (float)n1 / n2;
    }
    static int modulo(int n1, int n2){
        return n1 % n2;
    }
    // 앞의 리턴과 뒤의 파라미터가 꼭 같을 이유는 없다.
    // 메소드 이름만 달라도 같은 변수를 쓸수는 있다.
}
