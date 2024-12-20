package com.green.day12blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card 객체 주소값 여러개 저장가능 > 배열
    //ArrayList 사용 >>
    // 맴버필드선언 변수명 cards
//    private Card [] cards;
    private final List<Card> cards;
    protected int point;
    public Gamer() {
        cards = new ArrayList();

    }
    public void receiveCard(Card c){
        if(c==null){
        } else {
        // switch expression
//        int point = switch (c.getDenomination()){
        point += switch (c.getDenomination()){
            case "A" -> 1;
//            case "A" -> (point>11 ? 1:10); 이걸로 해결되는건가?
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(c.getDenomination()); // 문자열에 들어간 정수를 다시 int로(문자가 섞여있으면 안됨)
            };
        }
//        this.point+=point;
        cards.add(c);
    }
    public void showYourCards(){
        for(Card c : cards){
            System.out.printf("%s\t",c);
        }
        System.out.println("");
//        System.out.println(cards); //List의 toString으로 인해 [a, b, c] 가 나오게 된것.
    }
    public List<Card> openCards(){

        return cards; // cards를 반환 해주는건데 쓸일이 없어보이는데
    }
    public int getPoint(){
        return point;
    }
}

