package com.green.day02.ch05;

public class IEIE2 {
    public static void main(String[] args) {
        int n = 120;

        if(n < 0) {
            System.out.printf("%d는 0미만", n);
        } else if (n < 50) {
            System.out.printf("%d는 50미만", n);
        } else if (n < 100){
            System.out.printf("%d는 100미만", n);
        } else {
            System.out.printf("%d는 100이상", n);
        }// 순서 주의 n < 100이 가장 위로가고 n = 40이였다면 50미만이 아닌 100미만이 출력된다.
        // 위에서 부터 가장 먼저 true가 될때 출력하기 때문
        // else문이 없을 수도 있으며 이때는 앞에서 모두 조건 불충족시 한개도 실행되지 않는다.
    }
}
