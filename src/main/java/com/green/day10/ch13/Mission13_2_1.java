package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_1 {
    public static void main(String[] args) {
        /*
        다음 메소드는 int 형 1차원 배열에 저장된 값을 두번째 매개변수로 전달된
        값의 크기만큼 전부 증가시킨다.

        public static void addOneDArr(int[] arr, int add){}
         */
        int[] arr = {1, 2, 3, 4, 5};
        addOneDArr(arr,3); // arr의 모든 배열값이 3씩 더해짐
        System.out.println(Arrays.toString(arr));
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        addTwoDArr(arr2, 4);
        System.out.println(Arrays.deepToString(arr2));
    }
    public static void addTwoDArr(int[][] arr2, int add){
        for (int n=0;n<arr2.length;n++){
            addOneDArr(arr2[n],add);
        }

    }
    public static void addOneDArr(int[] arr, int add){

        for(int i=0;i<arr.length;i++){
            arr[i] += add;
        }

//    public static String addOneDArr(int[] arr, int add){
//
//        for(int i=0;i<arr.length;i++){
//           arr[i] += add;
//        }
//        return String.format("%s",arr);

        // 위에서 void문이라고 티를 내줫는데 왜 이걸로 했냐??


//        for(int b: arr){
//            b+=add;
//        }
//        return String.format("%s",arr);
        // 읽어 올 때는 좋지만 수정할때는 사용하기 힘들다.
        // 이게 안되는 이유는 b의 값을 바꾸고 저장했는데 그것을 불러올 수 없었기에
        // (arr을 b에 복사한 뒤 그 b에서 값을 바뀌고 나서 arr을 찾았으므로)

    }
//    public static String addOneDArr(int[] arr, int add){
//        int[] ar1 = arr;
//        for(int i=0;i<arr.length;i++){
//            ar1[i] = arr[i] + add;
//        }
//        return String.format("%s",ar1);
//    }
    // 처음에 썻던거 굳이 arr을 따로 나눌 필요가 없었다.
}
