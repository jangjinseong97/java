package com.green.day03.ch05;

public class MissionWhile1 {
    public static void main(String[] args) {
        /*
        while 문을 활용하여 1~99까지의 합을 구하는 프로그렘을 작성
         */
        int i = 1;
        int sum = 0;
        while(i <= 99){
            sum = sum + i;
            i++;

            // sum += (i++); 로 쓰는게 더 간결하게 된다.
        }
        System.out.println(sum);
    }
}
