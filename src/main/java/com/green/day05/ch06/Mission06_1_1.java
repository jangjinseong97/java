package com.green.day05.ch06;

public class Mission06_1_1 {
    public static void main(String[] args) {
        //calc(10, 3);
        /*
        10 + 3 = 13
        10 - 3 = 7
        10 / 3 = 3.3333
        10 * 3 = 30
        10 % 3 = 1
         */
        calc(10, 3);
    }
    public static void calc(int n1, int n2){
        System.out.printf("%d + %d = %d\n", n1 , n2, (n1 + n2));
        System.out.printf("%d - %d = %d\n", n1 , n2, (n1 - n2));
        System.out.printf("%d / %d = %f\n", n1 , n2, ((float)n1 / n2));
        System.out.printf("%d * %d = %d\n", n1 , n2, (n1 * n2));
        System.out.printf("%d %% %d = %d\n", n1 , n2, (n1 % n2));

    }
}
