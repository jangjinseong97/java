package com.green.etc;

class BankAccount2{
    // BankAccount로 하면 class명이 다른파일에 있는 class 와 겹쳐서 안됨
    int balance = 0;  // 잔액
    String acN;      //계좌번호
    String ssN;      //주민번호
    public void init(String acc, String ss, int bal){
        // 실행할때마다 초기화를 하기 위하여 작성하는 메소드
        acN=acc;
        ssN=ss;
        balance=bal;

        // void를 이용해 자료를 안보이는곳에 저장을 해 두는것
    }
    public int deposit(int amunt){
        balance+=amunt;
        return balance;
    }
    public int withdraw(int amunt){
        balance-=amunt;
        return balance;
    }
    public int checkMy(){
        System.out.println("계좌번호" + acN);
        System.out.println("주민번호" + ssN);
        System.out.println("잔액" + balance);
        return balance;
    }
}

public class CannotListen2 {
    public static void main(String[] args) {
        String str1 = "Ha";
        String str2 = "Bi";
        System.out.println(str1 + "  "  + str2);
        printS(str1);
        printS(" 이런식이라고 ");
        printS(str2);

        System.out.println("-------");
        BankAccount2 example = new BankAccount2(); //계좌 생성
        example.init("123-123(계좌번호)","621-31849(주민번호)", 10000); //계좌 초기화
        // 위에 BankAccount2에서 init에 정한 3개의 요소에 대해 입력

        BankAccount2 example2 = new BankAccount2();
        example2.init("123-213","123840-41700",0);

        example.deposit(1000);
        example2.deposit(1500);
        example.withdraw(8000);
        example2.withdraw(300);
        example.checkMy();
        example2.checkMy();

    }
    public static void printS(String str){
        System.out.print(str);
    }
}
