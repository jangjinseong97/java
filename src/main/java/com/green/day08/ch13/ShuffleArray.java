package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] arr = new int[20];
        for(int i = 0;i<arr.length;i++){
            arr[i] = i+1;
        }

        // 0~19 랜덤값
        // rIdx가 가리키는 공간과 i가 가르키는 공간의 값을 swap
        // 20번 반복하면 값이 섞인다?
        for(int i = 0;i<arr.length;i++){
            int rIdx = (int)(Math.random()*arr.length);
            // rIdx는 0~19 랜덤값
            int temp = arr[i];
            // 그 랜덤값을 arr[0]부터
            arr[i] = arr[rIdx];
            // arr[0] = arr[랜덤값];
            arr[rIdx] = temp;
            //arr[랜덤값] = temp( arr[0])

            // 랜덤값 생성
            // for문의 순차적 arr 생성
            // 위에서 만들어진 arr에 랜덤값이 들어간 arr 대입
            // 다시 위에서 생성된 값에 temp arr[i]  ???

            // 위에서 1~20값을 생성해둿으므로 그 자리를 바꾸는것이다
            /*
            int rIdx = (int)(Math.random()*arr.length);
            랜덤으로 0~19의 방번호 생성
            int temp = arr[i];
            미리 바꾸기 전값을 temp에 저장
            arr[i] = arr[rIdx]; 이후 랜덤 방번호 생성된 값을 i에 저장
            arr[rIdx] = temp;
            이후 아까 처음 저장(백업)해둔 arr[i]값을 아까 사용한 랜덤 방에 저장

            으로 두개의 위치를 서로 바꾸는것
             */

        }
        System.out.println(Arrays.toString(arr));
        // toString 오버라이딩(여기의 경우 문자열로 만들어줌)
    }
}
