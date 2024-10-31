package com.green.day16.ch26;

import java.util.function.Function;

public class FunctionMemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40,60,50};
        // 배열 안에서 가장 큰 숫자 리턴
        Function<int[], Integer> fn = arr2 -> {// 스코프 이슈로 arr도 여기서 쓸수있으니 조심
            int temp = arr2[0];
            for (int i = 1; i < arr2.length; i++) {
                if (temp < arr2[i]) {
                    temp = arr2[i];
                }
            }
            return temp;
        };
        int maxValue = fn.apply(arr);
        // fn 작성전에 호출해서 컴파일 에러가 나왔던 것 항상 위치에 조심

        System.out.println(maxValue);

    }
}
