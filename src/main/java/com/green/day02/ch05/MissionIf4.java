package com.green.day02.ch05;

public class MissionIf4 {
    public static void main(String[] args) {
        int score = (int) (Math.random() * 101.0);
        System.out.printf("score: %d\n", score);

        if (score == 100) {
            System.out.println("A+");
        } else if (score >= 98) {
            System.out.println("A+");
        } else if (score >= 94) {
            System.out.println("A0");
        } else if (score >= 90) {
            System.out.println("A-");
        } else if (score >= 88) {
            System.out.println("B+");
        } else if (score >= 84) {
            System.out.println("B0");
        } else if (score >= 80) {
            System.out.println("B-");
        } else if (score >= 78) {
            System.out.println("C+");
        } else if (score >= 74) {
            System.out.println("C0");
        } else if (score >= 70) {
            System.out.println("C-");
        } else {
            System.out.println("D");
        }

        if (score >= 90) {
            if (score >= 98) {
                System.out.println("A+");
            } else if (score >= 94) {
                System.out.println("A0");
            } else {
                System.out.println("A-");
            }
        } else if (score >= 80) {
            if (score >= 88) {
                System.out.println("B+");
            } else if (score >= 84) {
                System.out.println("B0");
            } else {
                System.out.println("B-");
            }
        } else if (score >= 70) {
            if (score >= 78) {
                System.out.println("C+");
            } else if (score >= 74) {
                System.out.println("C0");
            } else {
                System.out.println("C-");
            }
        } else {
            System.out.println("D");
        }

        if (score / 10 == 10) {
            System.out.print("A+");
        } else if (score / 10 == 9) {
            System.out.print("A");
        } else if (score / 10 == 8) {
            System.out.print("B");
        } else if (score / 10 == 7) {
            System.out.print("C");
        } else {
            System.out.print("D\n");
        }
        if (score >= 70){
           if(score % 10 >= 8){
                System.out.print("+\n");
            } else if(score % 10 >= 4){
                System.out.print("0\n");
            } else {
                System.out.print("-\n");
            }
        }



//        if(score % 10>=8){
//            String str2 = "+";
//        } else if(score % 10 >= 4){
//            String str2 = "0";
//        } else {
//            String str2 = "-";
//        }
//        System.out.printf("%s%s", str1, str2); str1과 2가
//        if 문안에서만 지정되기 때문에 안되는건가?

        char grade = 'D', opt = '0';
        if (score >= 90) {
            grade = 'A';
            if (score >= 98) {
                opt = '+';
            } else if (score < 94) {
                opt = '-';
            }
        } else if (score >= 80) {
            grade = 'B';
            if (score >= 88) {
                opt = '+';
            } else if (score < 84) {
                opt = '-';
            }
        } else if (score >= 70) {
            grade = 'C';
            if (score >= 78) {
                opt = '+';
            } else if (score < 74) {
                opt = '-';
            } else {
                opt = ' '; // char 이기에 ' ' 중간에 띄어쓰기를 해줘야된다
                // String 이라면 ""띄어쓰기 없이도 사용가능
            }
        } // opt에 기본적으로 0 grade에 D가 있어서 생략되는 부분이 많아짐


        String gr1 = "D", op1 = "";
        int gs1 = score / 10;
        int gs2 = score % 10;

        switch(gs1) {
            case 9, 10:
                gr1 = "A";
                break;
            case 8:
                gr1 = "B";
                break;
            case 7:
                gr1 = "C";
                break;
        }
        if(gs1 >6) {
            if (gs2 >= 8 || score == 100) {
                op1 = "+";
            } else if (gs2 >= 4) {
                op1 = "0";
            } else {
                op1 = "-";
            }
        }
        System.out.printf("%s%s\n", gr1, op1);
    }
}


