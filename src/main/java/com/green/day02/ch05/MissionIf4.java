package com.green.day02.ch05;

public class MissionIf4 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0);
        System.out.printf("score: %d\n", score);

        if(score == 100){
            System.out.println("A+");
        } else if(score >= 98){
            System.out.println("A+");
        } else if(score >= 94){
            System.out.println("A0");
        } else if(score >= 90){
            System.out.println("A-");
        } else if(score >= 88){
            System.out.println("B+");
        } else if(score >= 84){
            System.out.println("B0");
        } else if(score >= 80){
            System.out.println("B-");
        } else if(score >= 78){
            System.out.println("C+");
        } else if(score >= 74){
            System.out.println("C0");
        } else if(score >= 70){
            System.out.println("C-");
        } else {
            System.out.println("D");
        }

        if (score >= 90){
            if(score >= 98){
                System.out.println("A+");
            } else if(score >= 94){
                System.out.println("A0");
            } else {
                System.out.println("A-");
            }
        } else if(score >= 80){
            if(score >= 88){
                System.out.println("B+");
            } else if(score >= 84){
                System.out.println("B0");
            } else {
                System.out.println("B-");
            }
        } else if(score >= 70){
            if(score >= 78){
                System.out.println("C+");
            } else if(score >= 74){
                System.out.println("C0");
            } else {
                System.out.println("C-");
            }
        } else {
            System.out.println("D");
        }


        if(score / 10 == 10){
            System.out.print("A+");
        } else if(score / 10 == 9){
            System.out.print("A");
        } else if(score / 10 == 8){
            System.out.print("B");
        } else if(score / 10 == 7){
            System.out.print("C");
        } else {
            System.out.print("D");
        }
        if(score % 10 >= 8){
            System.out.print("+\n");
        } else if(score % 10 >= 4){
            System.out.print("0\n");
        } else {
            System.out.print("-\n");
        }
//        if(score % 10>=8){
//            String str2 = "+";
//        } else if(score % 10 >= 4){
//            String str2 = "0";
//        } else {
//            String str2 = "-";
//        }
//        System.out.printf("%s%s", str1, str2); str1과 2가 if 문안에서만 지정되기 때문
    }
}
