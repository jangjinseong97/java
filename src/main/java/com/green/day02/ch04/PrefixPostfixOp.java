package com.green.day02.ch04;

public class PrefixPostfixOp {
    public static void main(String[] args) {
        int n = 7;
        // ++이 앞에 붙으면 Prefix 뒤에 붙으면 Postfix
        System.out.printf("1_ n: %d\n", n);
        n++; // n을 쓰기만
        System.out.printf("2_ n: %d\n", n); // n을 읽기만
        ++n;
        System.out.printf("3_ n: %d\n", n);
        n+=1;
        System.out.printf("4_ n: %d\n", n);
        n--;
        System.out.printf("5_ n: %d\n", n);
        // 증가 감소 연산자
        System.out.println("-----------");
        int k = 0, i = 0;
        System.out.println("Prefix"+  " Postfix");
        System.out.println(k + "      " + i);
        System.out.println(++k +"      "+ i++);
        System.out.println(++k +"      "+ i++);
        System.out.println(k +"      "+ i);
        // 앞에 붙으면 먼저 증감 이후 값을 출력
        // 뒤에 붙으면 출력후 증감
    }
}
