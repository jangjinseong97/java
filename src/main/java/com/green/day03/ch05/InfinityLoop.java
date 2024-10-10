package com.green.day03.ch05;

public class InfinityLoop {
    public static void main(String[] args) {
        int n = 1;
        while(true){
            if((n % 6) == 0 && (n % 14) == 0){
                break;
            }
            // 해당 if문이 없었더라면 무한루프로 인해 아래의 printf가 아무것도 출력되지 않았을것
            n++;
        } // true를 주어서 무한루프를 만든것
        System.out.printf("n: %d\n", n);
    }
}
