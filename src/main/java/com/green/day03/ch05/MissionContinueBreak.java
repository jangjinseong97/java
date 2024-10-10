package com.green.day03.ch05;

public class MissionContinueBreak {
    public static void main(String[] args) {
        // 자연수 1부터 모든 홀수를 더하고 그 합이 1000천을 넘어설때의 값과 숫자를 출력

        int i = 1, sum = 0;
        while(true){
            if((i % 2) != 0){
                sum +=i;
                if(sum >= 1000){
                    break;
                }
                // if sum >1000이 안에 있어야 실행이 덜되니 안에 넣는것이 좋아보임
            }
            i++;
        }
        System.out.printf("마지막에 더한 값은 %d이고 합은 %d이다.\n", i, sum);

        int ii = 1, sum1 = 0;
        while(sum1 <= 1000){
            if((ii % 2) != 0){
                sum1 += ii;
            }
            ii++;
        }
        // ii++; 를 위로 올리고 시작값을 0으로 했으면 됬다.
        System.out.println(ii + "   " + sum1);
        System.out.println((ii-1) + "   " + sum1);
        // break를 주지 않아 ii++까지 실행이 됬으므로 위와는 다르게 64까지 출력이 된것

        int i3 = 1, sum2 = 0;
        while(true){
            if(sum2 >= 1000){
                break;
            }
            i3 += 2;
        } // 어쳐피 홀수의 합이니 2씩 더해주면 됨
    }
}
