package com.green.day02.ch04;

public class LogicalOp {
    public static void main(String[] args) {
        // 논리연산자 : &&, ||, !
        //           and, or, not
        // && 는 하나라도 false 가 나오면 false 처리 전부 true 이면 true
        // || 은 하나라도 true 가 나오면 true 처리 전부 false 이면 false
        // ! 은 부정 true 면 false false 면 true
        int n1 = 11, n2 = 22;
        boolean result;
        result = (1 < n1) && (n1 < 100);
        System.out.printf("%d은 1초과 100미만인가? %b\n", n1, result);

        result = ((n2 % 2) == 0) || ((n2 & 3) == 0);
        System.out.printf("%d는 2의 배수 혹은 3의 배수인가? %b\n", n2, result);

        System.out.printf("%d 와 %d은 다른가? %b\n", n2, 21, (n2 != 21));
        System.out.printf("%d 와 %d은 다르다 가 아닌가? %b\n", n2, 21, !(n2 != 21));
    }
}
