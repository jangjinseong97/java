package com.green.day02;

public class Mission1 {
    public static void main(String[] args) {
        int n1  = 10;
        int n2  = 3;
        //n1을 n2로 나누어 3.3333이 나오도록
        int n3= n1/n2;
        System.out.println((float)n1/(float)n2);
        System.out.printf("%d / %d = %f\n", n1, n2, ((float)n1/(float)n2));
        System.out.printf("%d / %d = %f\n", n1, n2, (n1/(float)n2));
        System.out.printf("%d / %d = %f\n", n1, n2, ((float)n1/n2));
        //둘중 하나만 해주어도 자동형변환이 되어 따라간다.
        System.out.printf("%d / %d = %f\n", n1, n2, (float)(n1/n2));
        // n1/n2이후 float을 해준거라 3으로 정수가 출력
    }
}
