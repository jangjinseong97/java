package com.green.day05.ch07;

public class BankAccountPoTest2 {
    public static void main(String[] args) {
        BankAccountPo po1 = new BankAccountPo();
        po1.deposit(1000);
        po1.checkMoney();

        BankAccountPo po2 = new BankAccountPo();
        po2.checkMoney();

        BankAccountPo.checkMoney();

        // day05에 ch07이 아닌곳에 있으니 오류가 뜬다 어째서?

    }
}
