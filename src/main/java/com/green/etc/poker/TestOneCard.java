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
        for(int i=0;i<8;i++) {
            playerA.receiveCard(deck.draw());

            playerB.receiveCard(deck.draw());
        }

        // playerA의 턴 진행
        while(true) {
            System.out.println("playerA의 턴");
            rule.turn(playerA, deck);

            if(playerA.size()==0){
                break;
            }else if(playerA.size()>20){
                System.out.println("playerA 카드 20장 초과 패배");
                break;
            }
            System.out.println("playerB의 턴");
            rule.turn(playerB, deck);

            if(playerB.size()==0){
                break;
            }else if(playerB.size()>20){
                System.out.println("playerB 카드 20장 초과 패배");
                break;
            }
        }

//        // 턴 종료 후 카드 상태 출력
//        playerA.showYourCards();
//        playerB.showYourCards();

    }

}
