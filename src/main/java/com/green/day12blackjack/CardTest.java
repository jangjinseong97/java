package com.green.day12blackjack;

import com.green.day07.ch07.Car;

import java.util.List;
import java.util.Scanner;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck(); // 변수는 대문자 사용xxxxxxx

        System.out.println(cd.getDenomination1(12));
        System.out.println("-------------");
        Card c = cd.draw(); // cd는 카드덱의 객체주소값(변수) 거기에서 Card의 타입을 받길 원하므로
        Card c2 = cd.draw();
        System.out.println(c.toString() + " " + c2);
        // 따라서 draw라는 메소드가 CardDeck 클래스 안에 있어야 된다(혹은 상속받았어야됨).
        // 그 다음 그것을 Card로 리턴받아야되는것 이후 c에 그 Card의 주소값을 저장
        System.out.println("-----------");
        cd.checkCard();
    }
}
class CardTest2{
    public static void main(String[] args) {
        Gamer gamer = new Gamer();
        CardDeck cd = new CardDeck();
        Card c1 = cd.draw();
        gamer.receiveCard(c1); // 카드저장
        gamer.receiveCard(cd.draw()); // 카드저장
        gamer.receiveCard(cd.draw()); // 카드저장
        gamer.receiveCard(cd.draw()); // 카드저장
        gamer.receiveCard(cd.draw()); // 카드저장
        System.out.println("----------");
        gamer.showYourCards();
        System.out.println(gamer.getPoint());
        List<Card> list = gamer.openCards();
    }
}

class CardTest3{
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        dealer.receiveCard(cd.draw());
        while (true){
            if(dealer.getPoint()<=16){
                dealer.needMoreCard(cd);
        } else {
            break;
        }
        dealer.showYourCards();
        System.out.println(dealer.getPoint());
        }
    }
}

class CardTest4{
    public static void main(String[] args) {
        CardDeck cd1 = new CardDeck();
        CardDeck cd2 = new CardDeck();
        Rule b = new Rule();
        Dealer dealer = new Dealer();
        Gamer gamer = new Gamer();
        dealer.receiveCard(cd1.draw());
        b.dealerRule(dealer,cd1);
        dealer.showYourCards();
        System.out.println(dealer.getPoint());

        System.out.println("-----------");
        gamer.receiveCard(cd2.draw());
        Scanner sc = new Scanner(System.in);
        while(true){
            String a = sc.next();
            System.out.println("더 뽑으시겠습니까?");
            if(a.equals("y")){
                gamer.receiveCard(cd2.draw());
                gamer.showYourCards();
                System.out.println(gamer.getPoint());
            } else if(a.equals("n")){
                break;
            } else {
                System.out.println("잘못입력 다시 확인");
            }
        }
        b.getWinner(dealer,gamer);
    }
}