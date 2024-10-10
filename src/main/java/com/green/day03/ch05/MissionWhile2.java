package com.green.day03.ch05;

public class MissionWhile2 {
    public static void main(String[] args) {
        /*
        1~100 까지 출력,
        100~1까지 출력
         */
        int i = 1;
        while(i <= 100){
            System.out.println(i++);

        }
        // 해당시점 i는 101
        System.out.println("지금 i의 값은 " + i);
        i -= 1;
        do{
            System.out.println(i--);
        } while(i > 0);
        // 여기서 --i로 하고 i > 1로 했으면 i -= 1; 를 넣을 필요가 없었다.

        int n = 0;
        while(n < 100){
            System.out.println(++n);
        }
        do{
            System.out.println(n--);
        }while(n > 0);
    }
}
