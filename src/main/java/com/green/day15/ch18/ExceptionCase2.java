package com.green.day15.ch18;

public class ExceptionCase2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {
        System.out.printf("%d / %d = %d\n", n1, n2, (n1 / n2));// 0으로 나눌수 없어서 런타임에러 발생
        } catch (ArithmeticException e) { // 에러와 관련된 모든 정보가 들어간 객체를 e에 저장하고
            System.out.println(e.getMessage()); // getMessage(); 로 그걸 받은것
            e.printStackTrace();// try-catch문이 없었다면 콘솔에서 나왔을 에러의 이유를 출력해줌
        } // 이를 try catch 문(예외처리)
        // try 문에 에러가 날 가능성이 있는 코드를 위치 예외 발생시 catch 부분이 실행 예외 비발생시 catch부분 실행x
        // catch문 안에서도 try catch문을 추가로 더 작성가능
    }
}
