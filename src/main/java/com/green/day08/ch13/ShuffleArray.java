package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for(int i = 0;i<arr.length;i++){
            arr[i] = i+1;
        }

        // 0~19 랜덤값
        for(int i = 0;i<arr.length;i++){
            int rIdx = (int)(Math.random()*arr.length);
            int temp = arr[i];
            arr[i] = arr[rIdx];
            arr[rIdx] = temp;
            // 랜덤값 생성
            // for문의 순차적 arr 생성
            // 위에서 만들어진 arr에 랜덤값이 들어간 arr 대입
            // 다시 위에서 생성된 값에 temp arr[i]  ???

        }
        System.out.println(Arrays.toString(arr));
    }
}
