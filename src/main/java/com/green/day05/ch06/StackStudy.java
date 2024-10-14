package com.green.day05.ch06;

public class StackStudy {
    public static void main(String[] args) {
        System.out.println("-- main [start] --");
        methodA();
        System.out.println("-- main [end] --");
    }
    static void methodA(){
        System.out.println("-- methodA[start] --");
        methodB();
        System.out.println("-- methodA[end] --");
    }
    static void methodB(){
        System.out.println("-- methodB[start] --");
        //methodB();
        System.out.println("-- methodB[end] --");
    }
    // 위에서부터 내려오면서 실행이 되는것이라
    // 메인스타트 >> 메소드a>> 메소드a스타트 >> 메소드b >> 메소드b스타트 >> 메소드b 로 인한 무한루프
    // 중간의 methodB(); 가 없다면 정상적으로 종료

}
