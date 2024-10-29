package com.green.day15.ch18;

public class ExceptionStudy2 {
    public static void main(String[] args) {
        int r = 0; // Unhandled Exception 이라는 이유로 빨간줄이 그이면
        try {
            r = div(10,0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        // 호출하는 부분에서 try-catch 를 사용해야 된다.
        System.out.println(r);
    }

    public static int div(int a, int b) throws Exception{  // 예외가 있던말던 보내는것
        return a / b;

    }
}
