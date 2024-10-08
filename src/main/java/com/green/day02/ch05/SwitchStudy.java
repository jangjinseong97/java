package com.green.day02.ch05;

import java.util.Scanner;

public class SwitchStudy {
    public static void main(String[] args) {
        String name = new String("홍길동");
        String name2 = new String("홍길동");
        // new String 으로 안하면 ==을 사용해도 true 가 나온다

        System.out.printf("name: %s\n", name);
        System.out.printf("name2: %s\n", name2);
        System.out.printf("name == name2: %b\n", name == name2);
        System.out.printf("name.equals(name2): %b\n", name.equals(name2));

        Scanner scan = new Scanner(System.in);
        System.out.print("문자열을 입력해 주세요 >>");
        String input = scan.next();
        if("abc".equals(input)){
            System.out.println("def");
        }
        switch(input){
            case "abc":
                System.out.println("switch-def");
                break;
        }
        // if와 다르게 .equal()을 사용하지 않아도 된다.
        System.out.println("---ㄲㅌ---");
    }
}
