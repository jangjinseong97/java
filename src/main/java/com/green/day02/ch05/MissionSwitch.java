package com.green.day02.ch05;

import java.util.Scanner;

public class MissionSwitch {
    public static void main(String[] args) {
        int male = 172, female = 159;
        Scanner scan = new Scanner(System.in);
        System.out.print("성별을 입력해 주세요. (w/m)");
        String gender = scan.next();
        System.out.print("키를 정수값으로 입력해 주세요.(cm)");
        int height = scan.nextInt();

        switch(gender){
            case "m":
                if(height >= 172){
                    System.out.println("당신은 평균보다 큽니다.");
                } else {
                    System.out.println("당신은 평균보다 작습니다.");
                } break;
            case "w":
                if(height >= 160){
                    System.out.println("당신은 평균보다 큽니다.");
                } else {
                    System.out.println("당신은 평균보다 작습니다.");
                } break;
            default:

        }
        switch(gender){
            case "m":
                System.out.printf("당신은 평균보다 %s니다.\n",height >= 172 ? "큽":"작습");
                break;
            case "w":
                System.out.printf("당신은 평균보다 %s니다.\n",height >= 160 ? "큽":"작습");
                break;
            default:
                System.out.printf("성별을 잘못 입력하였습니다.");

        }
    }
}
