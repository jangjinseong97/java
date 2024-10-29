package com.green.day15.ch18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("a/b ... a?");
        int n1 = 0;
        try{
            n1 = scan.nextInt();
            System.out.println("a/b ... b?");
            int n2 = scan.nextInt(); // 여기서 0이 나오면 에러가 발생해버림
            System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
//            try {
//                System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
//            } catch(Exception e){
//                System.out.println(e.getMessage());
//            } // 그래서 try catch 안에 다시 try catch 문을 사용
        } catch(InputMismatchException e ){ // catch의 소괄호에 넣는것은 오류 발생시 나오는 문구 참조
            System.out.println(e.getMessage());
        } catch(ArithmeticException e ){
            System.out.println(e.getMessage());
            e.printStackTrace(); // catch문 뒤에 바로 이어서 사용가능
        }
        System.out.printf("%d/ \n", n1);
        System.out.println("-------------");
        System.out.println("-- 종료 --");
        try{
            n1 = scan.nextInt();
            System.out.println("a/b ... b?");
            int n2 = scan.nextInt();
            System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
        } catch(InputMismatchException | ArithmeticException e){
            System.out.println(e.getMessage());
            e.printStackTrace();  // 예외처리의 내용이 똑같다면 이런식으로도 가능
        }
        System.out.println("--------------");

        try{
            n1 = scan.nextInt();
            System.out.println("a/b ... b?");
            int n2 = scan.nextInt();
            System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));
        } catch(Exception e){ // 모든 예외를 다 잡아줌 왠만한 예외의 상위 class
            // 내가 처리하고 싶은 예외들을 위에 Exception 말고 다른 예외검사하는 것들로 하고 가장 아랫쪽에 적어주는것
            // 위에 적으면 여기서 모든 예외가 걸려져서 아래의 따른 예외검사하는 곳들이 전부 컴파일에러
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (Throwable e){ // 예외의 최상위 class 잘안쓰임
            e.getMessage();
        }
    }
}
