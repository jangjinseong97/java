package com.green.day15.ch18;

import com.sun.jdi.Value;

public class ExceptionStudy {
    public static void main(String[] args) {
        String str1 = "123";
        int intVal1 = myParseInt(str1);
        System.out.println(intVal1);

        String str2 = "12a3";
        int intVal2 = myParseInt(str2);
        System.out.println(intVal2);
    }
    public static int myParseInt(String str){
        try{
            return Integer.parseInt(str);
        } catch(NumberFormatException e){
            return 0;
        }
    }
}
