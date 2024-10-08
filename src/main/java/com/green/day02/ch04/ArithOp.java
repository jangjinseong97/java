package com.green.day02.ch04;

public class ArithOp {
    public static void main(String[] args) {
        int n1 = 7;
        int n2 = 3;
        System.out.printf("%d + %d = %d\n",n1, n2, (n1 + n2));
        System.out.printf("%d - %d = %d\n",n1, n2, (n1 - n2));
        System.out.printf("%d * %d = %d\n",n1, n2, (n1 * n2));
        System.out.printf("%d / %d = %d\n",n1, n2, (n1 / n2)); //  / 몫
        System.out.printf("%d %% %d = %d\n",n1, n2, (n1 % n2)); // %(mod) 나머지
        // printf에선 %%로 해야지 %가 나온다 %한번은 명령어로 작동하기 때문
        // %는 홀짝을 구할때 혹은 배수를 구할때 자주 사용
    }
}
