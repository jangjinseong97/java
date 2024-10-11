package com.green.etc;

class BankAccount{
    int balance = 0;
    public int deposit(int amunt){
        balance+=amunt;
        return balance;
    }
    public int withdraw(int amunt){
        balance-=amunt;
        return balance;
    }
    public int checkMy(){
        System.out.println("잔액" + balance);
        return balance;
    }
    // class BankAccount 에 대한 코드 작성
}

public class CannotListen {
    public static void main(String[] args) {
        BankAccount as = new BankAccount();
        as.withdraw(700); // 이 두개의 코드는 int amunt로 할당을 해주엇기에 바로 값이 리턴
        as.deposit(5000); // 이 두개의 코드는 int amunt로 할당을 해주엇기에 바로 값이 리턴
        check(as);
        as = null; // as는 BankAccount를 참조하는중인데 이것을 종료 하는것 즉 이 식이후로는

//        as.deposit(5000);
//        check(as);  이 코드를 주석해제 하여도 런타임 오류가 발생한다 (BankAccount와의 연계를 끉엇기에)

        // 이런방식으로 안하고 as.checkMy(); 로도 바로 값을 확인해볼수 있다.
    }
    public static void check(BankAccount ex1){
        ex1.checkMy();
        // ac가 참조하는 메소드를 호출시킴(check가 사용 되었을떄)
        // 즉 check(as) 에서 as가 check의 ac로 들어오고 그다음 ac.checkMy()가 실행이 됨
    }
    // 굳이 이렇게 한 이유는 호출에 호출을 보여주기 위함인듯?
}
