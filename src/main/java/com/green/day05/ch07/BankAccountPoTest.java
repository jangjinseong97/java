package com.green.day05.ch07;

public class BankAccountPoTest {
    public static void main(String[] args) {
        System.out.println("BankAccountPo의 balance 를 불러 오고 싶으면 \n"
                + BankAccountPo.balance);
        // int deposit = BankAccountPo.deposit(41000);
        int depo = BankAccountPo.deposit(41000);
        // int 바로 뒤에는 어디까지나 변수명 그 뒷부분의 불러오는 부분이 중요
        System.out.println(BankAccountPo.balance);
        System.out.println(depo);

        depo = BankAccountPo.withdraw(20000);
        System.out.println(depo);
        BankAccountPo.checkMoney();
    }
}
