package com.green.day10.ch13;

import java.util.Arrays;

public class MIssion13_2_2 {
    /*
    다음 형태로 표현된 2차원 배열이 존재한다고 가정
    1   2   3 >> 1행
    4   5   6
    7   8   9 >> 3행

    1열     3열

    2차원 배열의 인자가 전달되면 다음의 형태로 배열의 구조를 바꾸는 메소드 정의
    7   8   9
    1   2   3
    4   5   6
     */
    public static void main(String[] args) {
        int[][] arr ={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        revers(arr);
        System.out.println(Arrays.deepToString(arr));
        // arr 에 저장되어 있음 >> 이의 주소값을 빼서 바꾸는것
        //
    }
    public static void revers(int[][] ar){
        int li =ar.length-1;
        int[] last = ar[li];
        // 가장 마지막 값을 last 의 배열에 저장해놓고
        for(int i=li;i>0;i--){
            ar[i] = ar[i-1];
        }
        // 값을 하나씩 올려가면서 바꾼 뒤
        ar[0] =last;
        // 가장 처음쪽을 저장해둔 마지막 값인 last를 대입
    }



//    public static void revers(int[][] ar){
//        int a = ar.length, b = ar[0].length;
//        int[][] arr2 = new int[a][b];
//        for (int i=0;i<a;i++){
//            if(i==a-1){
//                arr2[i]=ar[0];
//                break;
//            }
//            arr2[i]=ar[i+1];
//        }
//        System.out.println(Arrays.deepToString(arr2));
//    }

//        public static void revers(int[][] ar){
//        int a = ar.length;
//        int[] arr2 =ar[ar.length-1];
//        for (int i=0;i<a;i++){
//            if(i==a-1){
//                ar[i]=arr2;
//                break;
//            }
//            ar[i]=ar[i+1];
//        }
//    }
}
