package com.green.day09.ch13;

// 296pg
public class EnhancedFor {
    // 강화된/향상된 for문 foreach 문
    public static void main(String[] args) {
        int[] arr = {1, 5, 34, 12, 62};

        for(int i=0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("------------------");

        for(int item : arr){
//             item 이 1개씩이고 arr이 여러개 포함된것 두개의 타입은 같아야 된다.
            if(item == 34){
                break;
            }
            System.out.println(item);
        }
        // 위의 for문과 같은 결과가 나옴
        /*
        sequence가 있는 콜렉션에서 사용가능
        0, 1, 2번방 같은 순차적으로 값을 읽어오고 쓰는 콜렉션에서는 사용가능
        ex) array, ArrayList
        보통 값을 읽어올 때 사용.
        수정할 때는 사용하기 힘들어서 보통 for문을 사용함
        정확히는
        int item = arr[0];
        System.out.println(item);
        int item = arr[1];
        System.out.println(item);

        이런식으로 반복하며 이는 마지막 인덱스값 까지 반복한다.
         */
    }
}
