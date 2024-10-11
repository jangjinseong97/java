package com.green.day02.ch05;

public class IEBasic {
    public static void main(String[] args) {
        int n1 = 5, n2 = 7;
        if(n1 < n2) { // if(true) 가 되었을때만 중괄호 사이의 모든 코드들이 실행
            System.out.printf("%d < %d is %b\n", n1, n2, (n1 < n2));
        }
        if(n1 > n2){ // if(false)여서 실행이 되지 않음
            System.out.printf("%d > %d is %b\n", n1, n2, (n1 > n2));
        }
        System.out.println("---ㄲㅌ---");
        // if문, 분기문으로 갈림길을 만들수 있다.
        // a아니면 b로 구분되어도 상관 없는 경우

        if(n1 == n2){
            System.out.printf("%d == %d is %b\n", n1, n2, (n1 == n2));
        } else {
            System.out.printf("%d == %d is %b\n", n1, n2, (n1 == n2));
        }// if else 중에선 무조건 둘중 하나만 실행됨
        // if(true) 면 if 뒤의 중괄호가 if(false)이면 else 뒤의 중괄호가 실행
    }
}

