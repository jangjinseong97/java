package com.green.day12blackjack;

public class Rule {
    public void getWinner(Dealer dealer, Gamer gamer){
        //1  각 게이머들의 점수를 얻음
        //2. 이를 비교하여 출력
        int deal = dealer.getPoint();
        int game = gamer.getPoint();
        final int MAX = 21;

        if((deal>MAX && game>MAX)||deal==game){
            System.out.println("draw");
            System.out.println(dealer.getPoint());
            System.out.println(gamer.getPoint());
        } else if(deal>MAX && game<=MAX){
            System.out.println("winner is gamer");
            System.out.println(dealer.getPoint());
            System.out.println(gamer.getPoint());
        } else if(game>MAX && deal<=MAX){
            System.out.println("winner is dealer");
            System.out.println(dealer.getPoint());
            System.out.println(gamer.getPoint());
        } else if(deal>game){
            System.out.println("winner is dealer");
            System.out.println(dealer.getPoint());
            System.out.println(gamer.getPoint());
        } else {
            System.out.println("winner is gamer");
            System.out.println(dealer.getPoint());
            System.out.println(gamer.getPoint());
        }

//        if((deal>MAX && game>MAX)||deal==game){
//            System.out.println("draw");
//        } else if(deal>MAX || (game<=MAX && game>deal)) {
//            System.out.println("gamer");
//        } else {
//            System.out.println("dealer");
//        }X
        // 위의 else if문을 더 줄인것
    }
    public void dealerRule(Dealer dealer, CardDeck cd1){
        while (true){
            if(dealer.getPoint()<=16){
                dealer.needMoreCard(cd1);
            } else {
                break;
            }
        }
    }
}
