package com.green.etc;

import java.util.Scanner;

public class SwitchLoof {
    public static void main(String[] args) {
        int male = 172, female = 159;
        int L = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("키를 정수값으로 입력해 주세요.(cm)");
        int height = scan.nextInt();

        // 어떤식으로 해야지 정수값이 아닌 값을 입력 받았을 때 다시 받을수 있게 루프를 만들 수 있을까?

        int averageHeight = 159;
        while (L == 1){
            System.out.print("성별을 입력해 주세요. (w/m)");
            String gender = scan.next();
            switch(gender){
                case "m":
                    averageHeight = 172;
                    L++;
                    break;
                case "w":
                    L++;
                    break;
                default:
                    System.out.println("성별을 잘못 입력하였습니다.");
            }
        }
        if (height > averageHeight){
            System.out.println("당신은 평균보다 큽니다.");
        } else if(height == averageHeight){
            System.out.println("당신은 평균보다 작습니다.");
        } else {
            System.out.println("당신은 평균 입니다.");
        }
    }
}
