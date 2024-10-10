package com.green.day03.ch05;

public class MissionWhile3 {
    public static void main(String[] args) {
        /*
        1000이하 자연수 중, 2의 배수이자 7의 배수인 수를 모두 출력하고,
        그 수들의 합을 구해서 출력하는 프로그렘 작성
         */
        int sum = 0, i = 1;

        while (i < 1001){
            if((i % 2 == 0) && (i % 7 ==0)){
                sum += i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println(sum);
    }
}
