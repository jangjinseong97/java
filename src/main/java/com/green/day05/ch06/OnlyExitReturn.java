package com.green.day05.ch06;

public class OnlyExitReturn {
    public static void main(String[] args) {
        divide(4,2);
        divide(6,2);
        divide(9,0);
        System.out.println("---ㄲㅌ---");

        // 수학적으로 0으로 나눌수 없으니 예외가 발생 이러한 예외가 발생되지 않도록 하는 작업을
        // "예외처리" 라고 한다. 이때 예외처리는 두가지 방법으로 가능하다
        // 예외가 발생되는 상황을 나오지 않게 한다.
        // 예외가 발생되는 상황을 try-catch로 해결한다.
    }
    static void divide(int n1, int n2){
        if(n2 == 0){
            System.out.println("0으로 나눌 수 없습니다.");
            return;
        }
        System.out.printf("나눗셈 결과: %d\n", (n1 / n2));

        // 해당 방식이 예외가 발생되는 상황을 나오지 않게 한것.
    }
}
