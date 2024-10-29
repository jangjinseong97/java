package com.green.etc.poker;

public class TestOneCard {
//    public static void main(String[] args) {
//        OneCardDeck a = new OneCardDeck();
//        a.cardCheck();
//
//        OneCardRule rule = new OneCardRule(a);
//        Player aa =new Player();
//        Player ab =new Player();
//
//        aa.receiveCard(a.draw());
//        aa.receiveCard(a.draw());
//        ab.receiveCard(a.draw());
//        aa.showYourCards();
//        ab.showYourCards();
//        System.out.println();
//        rule.turn(aa,0,a);
//        aa.showYourCards();
//        ab.showYourCards();
//    }
    public static void main(String[] args) {
        OneCardDeck deck = new OneCardDeck();  // 덱 생성

        OneCardRule rule = new OneCardRule(deck);  // 게임 시작 시 첫 카드 추가
        Player playerA = new Player();
        Player playerB = new Player();

        // 각 플레이어에게 초기 카드 지급
        playerA.receiveCard(deck.draw());
        playerA.receiveCard(deck.draw());
        playerA.receiveCard(deck.draw());
        playerA.receiveCard(deck.draw());
        playerA.receiveCard(deck.draw());
        playerB.receiveCard(deck.draw());

        // playerA의 턴 진행
        rule.turn(playerA, deck);

        // 턴 종료 후 카드 상태 출력
        playerA.showYourCards();
        playerB.showYourCards();

    }

}
