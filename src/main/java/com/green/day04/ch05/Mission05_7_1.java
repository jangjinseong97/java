package com.green.day04.ch05;

public class Mission05_7_1 {
    public static void main(String[] args) {
        /*
        구구단의 짝수단인 2, 4, 6, 8단만 출력하는 프로그렘작성
        여기서 2단은 2x2까지 4단는 4x4 ... 8단은 8x8까지
         */
        for (int i=2;i<10;i+=2){
            for (int k=1;k<=i;k++){
                System.out.printf("%d x %d = %d\t", i, k, (i*k));
                if(k==i){
                    System.out.println();
                    break;
                }
            }
        }
        // 이 방법도 되긴 하지만 if문을 계속 돌려야되므로 위에 비해 안좋음
        for(int i=1;i<10;i++){
            if((i % 2) ==0){
                for (int k=1;k<=i;k++){
                    System.out.printf("%d x %d = %d\t", i, k, (i*k));
                    if(k==i){
                        System.out.println();
                        break;
                    }
                }
            }

        }
    }
}
