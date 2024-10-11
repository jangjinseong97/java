package com.green.day04.ch06;

public class MethodLogicalOp {
    public static void main(String[] args) {
        int n1 = 81;
        boolean b = logicalOp(n1);
        System.out.println(b);
        boolean b2 = logicalOp2(n1); // 2배수거나 3배수 true 아님 false
        System.out.println(b2);
    }
    static boolean logicalOp(int n){
        return (n>=1 && n<=100);
    }// 호출이 될때만 메모리에서 사용
    static boolean logicalOp2(int n){
        System.out.println("중간 출력"); // 호출된후 차례대로 사용된 후 리턴을 주기 때문에
        // 위의 글자가 출력 된 후 return 값을 b2에 반환하게 되는것
        return  ((n % 2 == 0) || (n % 3 == 0));
    }
}
