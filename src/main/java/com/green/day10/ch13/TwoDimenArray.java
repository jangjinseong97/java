package com.green.day10.ch13;

public class TwoDimenArray {
    // 2차원 배열
    public static void main(String[] args) {
        int[][] arr = new int[3][5]; // 2차원 배열안에 배열이 있는것
        int[][] arr3 = {
                {0,0,7,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        // 3행 5열이 만들어졌다고 생각하면 된다. 행을 한 덩어리라고 생각해야되는
        // 각 방의 타입이 int[]

        int[][][] arr2 = new int[3][5][2]; // 3차원
        // 행열이 위로 쌓이게 된느낌 혹은 3차원 좌표공간을 생각하면 될듯
        // 각방의 타입은 int[][]

        System.out.println("arr.length: " + arr.length);
        System.out.println("arr3.length: " + arr3.length);
        System.out.println("arr2.length: " + arr2.length);
        // 크기가 3이 나오는 모습

        int[] tmp1 = arr3[0];
        System.out.println(tmp1[2]);
        // 1번째 배열(행)을 tmp1로 지정 했으므로 tmp1은 배열이 된것
        System.out.println(arr3[0][2]);
        // 위와 같은 값이 된다. tmp1 = arr3[0] 로 해줬으므로
        int n = 1;
        for(int i=0; i<arr.length; i++){
            for(int i2=0; i2<arr[i].length; i2++){
                // 여기서 위에 arr[i] 로 하면 가변이 생길수 있다
                // 1행은 5칸 2행은 7칸 이런식이 될 수 있다는것
                // 그래서 arr[0]을 주는것이 고정이라 안전하지만 큰상관은 없다.
                arr[i][i2] = n++;
            }
        }
        System.out.println("-----------");
        for(int i=0; i<arr.length;i++){
            for(int i2=0; i2<arr[i].length; i2++){
                System.out.printf("%d, ", arr[i][i2]);
            }
            System.out.println();
        }
    }
}
