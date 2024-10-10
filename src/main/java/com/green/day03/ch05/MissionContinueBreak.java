package com.green.day03.ch05;

public class MissionContinueBreak {
    public static void main(String[] args) {
        // 자연수 1부터 모든 홀수를 더하고 그 합이 1000천을 넘어설때의 값과 숫자를 출력

        int i = 1, sum = 0;
        while(true){
            if((i % 2) != 0){
                sum +=i;
            }
            if(sum > 1000){
                break;
            }
            i++;
        }
        System.out.println(i + "  " + sum);
    }
}
