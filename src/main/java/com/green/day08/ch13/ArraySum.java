package com.green.day08.ch13;

public class ArraySum {
    public static void main(String[] args) {

        int[] ar = {10, 15, 23, 1, 8};
        //ar에 들어가 있는 모든 정수를 더한 값을 출력하시오
        int sum = 0;
        for(int i=0; i<ar.length; i++) {
            sum += ar[i];
        }

        System.out.println("sum: " + sum);
    }
}
