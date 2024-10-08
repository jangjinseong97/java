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
        } // 중복된 구간이 많아져서 작동은 해도 좋은 코드는 아님

        switch(gender){
            case "m":
                System.out.printf("당신은 평균보다 %s니다.\n",height >= 172 ? "큽":"작습");
                break;
            case "w":
                System.out.printf("당신은 평균보다 %s니다.\n",height >= 160 ? "큽":"작습");
                break;
            default:
                System.out.printf("성별을 잘못 입력하였습니다.\n");
        } // 다 좋지만 딱 평균일때를 나타낼만한 방법이 귀찮아짐
        // 한다고 하면 if(height== 172)와 else로 작성정도

        // 가장 올바를만한 답안

        int standHeight = 159;
        switch(gender){
            case "m":
                standHeight = 172;
        }
        if(standHeight < height){
            System.out.println("당신은 평균보다 큽니다.");
        } else if(standHeight > height){
            System.out.println("당신은 평균보다 작습니다.");
        } else {
            System.out.println("당신은 평균입니다.");
        }

        int i = 0;
        while(i==0){
            Scanner scan1 = new Scanner(System.in);
            System.out.print("성별을 입력해 주세요. (w/m)");
            String gender1 = scan.next();
            System.out.print("키를 정수값으로 입력해 주세요.(cm)");
            int height1 = scan.nextInt();

            switch(gender1){
                case "m":
                    System.out.printf("당신은 평균보다 %s니다.\n",height1 >= 172 ? "큽":"작습");
                    i++; // i가 계속 0이였으므로 내가 원하는 답이 나오면 i값의 변화를 주어 나올수 있게
                    break;
                case "w":
                    System.out.printf("당신은 평균보다 %s니다.\n",height1 >= 160 ? "큽":"작습");
                    i++;
                    break;
                default:
                    System.out.printf("성별을 잘못 입력하였습니다. 다시 입력해주세요\n");
            }
        }
    }
}
