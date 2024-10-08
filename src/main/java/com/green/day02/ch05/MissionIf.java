package com.green.day02.ch05;

public class MissionIf {
    public static void main(String[] args) {
        int n = 120;
        if(n > 0){
            if((n % 2) == 0){
                System.out.printf("%d는 양수이면서 짝수이다.\n", n);
            }
        }
        System.out.println("---ㄲㅌ---");

        if((n > 0) && ((n % 2) == 0)){
            System.out.printf("%d는 양수이면서 짝수이다.\n", n);
        }
    }
}
