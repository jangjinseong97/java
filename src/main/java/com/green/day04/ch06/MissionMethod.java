package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {
        printStar(5); // *****
        printStar(2); // **
        printStar2(3); // **
    }
    static void printStar(int star){
        for(int i = star;i>0;i--){
            System.out.printf("*");
        }
        System.out.println();
    }
    static void printStar2(int star){
        for(int i=0;i<star;i++){
            System.out.printf("*");
        }
        System.out.println();
    }
}
