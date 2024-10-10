package com.green.day03.ch05;

public class DoWhileBasic {
    public static void main(String[] args) {
        int n = 5;

        while(n < 5){
            System.out.println("I like Java " + n);
            n++;
        }

        int n2 = 5;
        do {
            System.out.println("I like Java " + (n2++));

        } while(n2 < 5);

        // while 문은 조건문이 true 인지 확인하고 실행을 하는 반면
        // do while 문은 먼저 실행을 한 뒤 조건문이 true 인지 확인한다.
    }
}
