package com.green.day06.ch07;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        // BankAccount.deposit(4000); 가 오류가남 왜냐하면
        // 해당 메소드들은 " static이 없이 만들어졌기 때문에 " 위처럼 변수 선언을 하고나서
        // 내가 해당 변수를 직접 지정하여 정보를 전달해줘야됨
        // 이러한 방식을 주소값을 찍어준다고 생각해도 될듯
        ba.deposit(1000);
        ba.checkMyBalance();
        ba.deposit(2000);
        ba.checkMyBalance();

        BankAccount ba3 = new BankAccount();
        ba3.checkMyBalance(); // 위의 ba2와 다른 새로운 ba3이므로 0원이 저장
        ba3.deposit(30000);

        ba3.checkMyBalance();
        ba.checkMyBalance();
        // ba 와 ba3가 각각 다른 변수로 기억되어 따로 값이 저장되는 모습

        // BankAccount ba2 = new String("안녕"); BankAccount에는 String이 담기지 않는 모습
    }
}
