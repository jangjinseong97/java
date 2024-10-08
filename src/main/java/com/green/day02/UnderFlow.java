package com.green.day02;

public class UnderFlow {
    public static void main(String[] args) {
        byte var1 = -128;
        byte var2 = (byte)-129;
        System.out.printf("var1 : %d \nvar2 : %d\n",var1, var2);
    }
}
