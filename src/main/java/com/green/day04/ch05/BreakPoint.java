package com.green.day04.ch05;

public class BreakPoint {
    public static void main(String[] args) {
        //구구단에서 곱의 결과가 72인 결과만 보여라
        for(int i=1; i<10;i++){
            for(int z=1; z<10 ; z++){
                if((i*z) == 72){
                    System.out.printf("%d x %d = %d\n", i, z, (i*z));
                    break;
                    // 해당 break; 는 가장 가까운 for문인 z에 대한 for문에 해당됬기 때문에 2개가 출력
                }
            }
        }
        System.out.println("--ㄲㅌ--");
    }
}
