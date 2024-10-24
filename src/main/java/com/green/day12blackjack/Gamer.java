package com.green.day12blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card 객체 주소값 여러개 저장가능 > 배열
    //ArrayList 사용 >>
    // 맴버필드선언 변수명 cards
//    private Card [] cards;
    private final List<Card> cards;

    public Gamer() {
        cards = new ArrayList();
    }
    public void receiveCard(Card c){
        cards.add(c);
    }
    public void showYourCards(){
        for(Card c : cards){
            System.out.println(c);
        }
//        System.out.println(cards); //List의 toString으로 인해 [a, b, c] 가 나오게 된것.
    }
}

