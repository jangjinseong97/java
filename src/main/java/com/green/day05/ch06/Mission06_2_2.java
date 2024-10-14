package com.green.day05.ch06;

public class Mission06_2_2 {
    /*
    전달된 값이 소수인지 아닌지 판단하여 소수인경우를 true. 아니면 false를 반환하는 메소드 정의
    이 메소드의 호출을 결과로 1~100사이소수를 출력
     */
    public static void main(String[] args) {
        prime(100);
    }
    public static void prime(int n){
        for(int i=3; i<101; i++){
            for(int k=2; k<i; k++){
                if (i % k ==0 ){
                    break;
                } else {
                    System.out.printf("%d 는 소수 입니다. \n",i);
                    break;
                }
            }
        }
    }
}
