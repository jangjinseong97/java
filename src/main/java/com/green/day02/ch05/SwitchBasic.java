package com.green.day02.ch05;

public class SwitchBasic {
    public static void main(String[] args) {
        int n = 3;
        switch (n){
            case 1:
                System.out.println("Simple Java");
            case 2:
                System.out.println("Funny Java");
            case 3:
                System.out.println("Fantastic Java");
            default:
                System.out.println("The best programming language");
        }
        // break; 가 없어서 아래의 case 까지 다 실행이됨
        System.out.println("Do you like Java?");
    }
}
