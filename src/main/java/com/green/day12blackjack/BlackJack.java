package com.green.day12blackjack;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        System.out.println("=====Blackjack=====");
        CardDeck cd = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        newGame(gamer,dealer,cd);


    }
    public static void newGame(Gamer gamer,Dealer dealer,CardDeck c1){
        Rule rule = new Rule();
        gamer.receiveCard(c1.draw());
        dealer.receiveCard(c1.draw());
        gamer.receiveCard(c1.draw());
        dealer.receiveCard(c1.draw());
        System.out.println("딜러가 받은 카드와 합");
        dealer.showYourCards();
        System.out.println(dealer.getPoint());

        rule.dealerRule(dealer,c1);

        System.out.println("------");
        System.out.println("추가로 딜러가 받은 합");
        dealer.showYourCards();
        System.out.println(dealer.getPoint());

        Scanner scan = new Scanner(System.in);

        while(true){
            if(gamer.getPoint()>21){
                System.out.println("gamer bust");
                break;
            }
            System.out.println("---------");
            gamer.showYourCards();
            System.out.println(gamer.getPoint());
            System.out.println("카드를 추가하시겠습니가?(취소: n)");
            String input = scan.nextLine();
            if(input.equals("n")){
                break;
            } else {
                gamer.receiveCard(c1.draw());
                System.out.println(gamer.getPoint());
            }
        }

        rule.getWinner(dealer,gamer);
        System.out.println("게임 종료");
    }
}
