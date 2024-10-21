package com.green.day06.ch07;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = ba1; //ba1에 할당된 주소값 == 얕은 복사 == shallow copy

        ba1.deposit(1000);
        // 참조변수인 ba1가 참조하는 인스턴트(작성해둔 BankAccount클래스)에서 deposit를 불러낸 것
        ba2.checkMyBalance();
        // ba2와 ba1의 주소값이 같으므로 ba1에 저장해둔 값이 ba2를 불러옴에도 동일하게 출력

        // BankAccount ba1가 의미하는것은
        // 참조변수를 만든것 변수명 ba1인 거기에 주소값을 저장
        // BankAccount객체 주소값만 저장가능
    }
}
