package com.green.etc.poker;

public class MiddleValue {
    public static void main(String[] args) {
        int [] arr = {3,5, 6, 2, 1, 7, 10,11, 2};
        solution(arr);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
    }
    public static void solution(int [] arr){
        int temp;
        for(int i=0;i<arr.length;i++){
            for(int n=0;n<i;n++){
                if(arr[i]<arr[n]){
                    temp = arr[n];
                    arr[n] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        if((arr.length%2) == 0){
            int a = arr.length/2;
            System.out.println((arr[a-1]+arr[a])/2);
        } else{
            int a = (arr.length+1)/2;
            System.out.println(arr[a-1]);
        }
    }
}
