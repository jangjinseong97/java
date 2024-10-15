package com.green.day06.ch07;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.deposit(1000);
        ba.deposit(2000);

        BankAccount ba2 = ba;
        ba2.checkMyBalance();
        System.out.println("ba2가 저장되어 있음");
        ba.checkMyBalance();
        System.out.println("ba가 저장되어 있음");

        ba2 = null; // null 은 공백의 상태를 의미 띄어쓰기조차 없는 공간인듯
        // null 은 참조하고있는 인스턴트를 끉는것 위의 경우는 ba2를 BankAccount 를 참조하게
        // 코딩을 했었는데 null로 이것을 해제한것

        // ba2.checkMyBalance(); null인 상태에서 메소드르 호출하여
        // NullPointException 이 발생(오류)

        // null의 의므는 객체를 가르키고 있지 않다.(주소값 없다) 라고 적혀있는데
        if(ba2 != null){
            ba2.checkMyBalance();
        }
        System.out.println("ba2 = null 로 공백상태로 만들었으므로 위의 if문이 false");

        // check(ba);
        // 이부분이 아래처럼 적혔더라면 static 이 없는 메소드로 작성되어야 됬다.
        PassingRef pf = new PassingRef(); // 클래스이름 변수 = new 클래스이름();
        pf.check(ba); // 변수.메소드명(변수)
    }
     void check(BankAccount ba){
        ba.checkMyBalance();
    }
}
