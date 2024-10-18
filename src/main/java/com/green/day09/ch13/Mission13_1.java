package com.green.day09.ch13;

public class Mission13_1 {
    /*
    int형 1차원 배열을 매개변수로 전달받아서 배열에 저장된 최댓값, 최솟값을 찾아서 반환하는 메소드를 각각
    다음의 형태로 정의하자.

    public static int minValue(int[] arr) 최솟값
    public static int maxValue(int[] arr) 최댓값

    단 반복문을 사용할떄 min에선 일반적인 for
    max에서는 enhanced-for
     */
    public static void main(String[] args) {
        int[] arr = {45, 88, 100, 3, 220};
        int min = minValue(arr);
        System.out.println(min);
        int max = maxValue(arr);
        System.out.println(max);
    }

    public static int minValue(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int min = arr[0];
        for (int i=1; i<arr.length; i++) {
            // 작은걸 냅두는식
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int maxValue(int[] arr){
        int max = arr[0];
        // 어쳐피 한번더 비교될뿐이지만 상관은 없어도 여기도 arr[0]부터 해주는것이 좋다
        // 만약에 내부의 숫자들이 모두 음수였다면 0이 출력되었을것
        for(int item: arr){
            if(max < item){
                max = item;
            }
            // 또또또 실수했었음 item 자체에 이미 arr[i]가 포함됫다는걸 망각 ㄴ
        }
        return max;
    }
}
