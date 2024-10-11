package com.green.day04.ch05;

public class LableBreakPoint {
    public static void main(String[] args) {
        //구구단에서 곱의 결과가 72인 결과만 보여라
        abc:
        for(int i=1; i<10;i++){
            for(int z=1; z<10 ; z++){
                if((i*z) == 72){
                    System.out.printf("%d x %d = %d\n", i, z, (i*z));
                    break abc;
                }
                // 이런식으로 name(아무이름): 을 주면 name: 이후에 해당된 조건문을 break 하게 된다.
                // 예시에선 outer를 사용
            }
        }
        System.out.println("--ㄲㅌ--");
    }
}
