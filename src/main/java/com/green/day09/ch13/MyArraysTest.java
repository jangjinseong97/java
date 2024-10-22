package com.green.day09.ch13;

import java.util.Arrays;

public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = {3,6, 10, 12};
        System.out.println(Arrays.toString(arr));
        System.out.println(MyArrays.toString(arr));
        System.out.println(MyArrays.toString2(arr));
        System.out.println(MyArrays.toString3(arr));
        System.out.println(MyArrays.toString4(arr));
        // .으로 바로 호출했으므로 static 따로 추가적인 작성이 있었으므로 리턴이 void가 아님

        int[] arr2 = Arrays.copyOf(arr, arr.length);
        // 위에서 arr.length 부분에 원한는만큼 크기를 직접 조정 가능
        System.out.println(arr == arr2);
        System.out.println(MyArrays.toString(arr2));
        System.out.println("------------");
        int[] arr3 = MyArrays.copyOf(arr);
        System.out.println(arr == arr3); // false >> true찍히는데?
        System.out.println(MyArrays.toString(arr3)); // 같은값

        int[] arr4 = MyArrays.copyOf(arr,2);
        System.out.println(arr == arr4);
        System.out.println(MyArrays.toString(arr4));
    }
}
