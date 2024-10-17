package com.green.day08.ch13;

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 15, 23, 1, 8, 10, 12, 100, 222, 333};
        int[] copyArr = new int[arr.length]; // arr와 같은크기로 하나 만들어줌

        for(int i=0; i<arr.length; i++){
            copyArr[i] = arr[i];
        }

        System.out.println("arr = copyArr: " + (arr == copyArr));
        // 값을 넣은것이지 주소값이 다르다고 나옴

        int[] arr2 = copyArr; // 이게 주소값 복사 이를 얕은 복사
        System.out.println("arr2 = copyArr: " + (arr2 == copyArr));


        //copyArr의 각 방은 arr의 각 방의 값과 같은 값을 가질 수 있도록 해주세요.
        for(int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
        System.out.println("--------");
        // 위는 고정

        for(int i=0; i<copyArr.length; i++) {
            System.out.printf("copyArr[%d]: %d\n", i, copyArr[i]);
        }
    }
}
