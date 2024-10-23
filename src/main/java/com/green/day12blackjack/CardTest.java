package com.green.day12blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck(); // 변수는 대문자 사용xxxxxxx

        System.out.println(cd.getDenomination1(12));

        Card c = cd.draw(); // cd는 카드덱의 객체주소값(변수) 거기에서 Card의 타입을 받길 원하므로
        Card c2 = cd.draw();
        // 따라서 draw라는 메소드가 CardDeck 클래스 안에 있어야 된다(혹은 상속받았어야됨).
        // 그 다음 그것을 Card로 리턴받아야되는것 이후 c에 그 Card의 주소값을 저장
        System.out.println("-----------");
        cd.checkCard();
    }
}
