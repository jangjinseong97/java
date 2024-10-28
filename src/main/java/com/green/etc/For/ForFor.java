package com.green.etc.For;

public class ForFor {
    public static void main(String[] args) {
        // 구구단 5단 출력하는 프로그렘 for문으로
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, (j * i));
            }
            System.out.println("----------");
        }
    }
}
