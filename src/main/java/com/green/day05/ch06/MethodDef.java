package com.green.day05.ch06;

public class MethodDef {
    static void hiEveryone(int age){
        System.out.printf("좋은 아침 \n 제 나이는 %d세 입니다. \n", age);
    }

    public static void main(String[] args) {
        System.out.println("프로그렘 시작");
        hiEveryone(11);
        // 위에 작성한 메소드를 실행됨
        hiEveryone(30);
        // 위에 작성한 메소드가 동일하게 실행되지만 age는 지금걸로 전송되어 실해
    }
}
