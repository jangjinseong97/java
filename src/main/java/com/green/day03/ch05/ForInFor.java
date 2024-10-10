package com.green.day03.ch05;

public class ForInFor {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println("------------------------------");

            for(int z=0; z<5; z++){
                System.out.printf("[%d, %d]", i, z);
            }
            System.out.println();
        }
    }
}
