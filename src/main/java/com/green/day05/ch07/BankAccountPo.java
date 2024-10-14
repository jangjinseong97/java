package com.green.day05.ch07;

public class BankAccountPo {
    static int balance = 0; // static를 전역변수라고 한다

    static int deposit(int amunt){
        // balance 에 입금에 해당하는 메소드

        balance += amunt;
        return amunt;
    }
    static int withdraw(int amunt){
        // balance 에 출금에 해당하는 메소드
        balance -= amunt;
        return amunt;
    }
    static int checkMoney(){
        System.out.println("잔액:" + balance);
        return balance;
    }
}
