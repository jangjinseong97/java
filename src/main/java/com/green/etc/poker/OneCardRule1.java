package com.green.etc.poker;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OneCardRule1 {
    private final List<OneCard> usedCards = new ArrayList<>();
    private OneCard lastCard;
    static int point =0;
    public OneCardRule1(OneCardDeck uc) {
        usedCards.add(uc.draw());
        lastCard = usedCards.get(0);
    }

    public void turn(Player pl,OneCardDeck uc) {
        if (pl.size() == 0 && (lastCard.getDem().equals("k")||lastCard.getDem().equals("Q")||
                lastCard.getDem().equals("J"))) {
            pl.receiveCard(uc.draw());
        }
        if (pl.size() == 0) {
            System.out.printf("%s 승리!\n", pl);
            return;
        }

        pl.showYourCards();
        System.out.println("깔려있는 카드: "+lastCard);
        Scanner sc = new Scanner(System.in);
        System.out.println("낼 카드 선택 없으면 아무카드 선택");
        int n=sc.nextInt()-1;
        int k = pl.size();
        OneCard oc = pl.getCard(n);
        if((lastCard.getJoker().equals("black")||(lastCard.getJoker().equals("color")))&&(point==0)){
            use(pl,n);
        }
        else if(oc.getJoker().equals("black")){
            point+=3;
            use(pl,n);
        }
        else if(oc.getJoker().equals("color")){
            point+=5;
            use(pl,n);
        }
        else if((oc.getPattern().equals(lastCard.getPattern())) || (oc.getDem().equals(lastCard.getDem())))
        {
            demNum(pl,uc,n);
        }else if(lastCard.getJoker().equals("black")||lastCard.getJoker().equals("color")) {
            if(oc.getDem().equals("A")){
                point++;
                use(pl, n);
            } else if(oc.getDem().equals("4")){
                point=0;
                use(pl, n);
            }
            else if(point==0){
                demNum(pl,uc,n);
            }else {

                dontUsed(pl,uc);
            }
        }else{
            dontUsed(pl,uc);
        }
        gameOver(pl);
    }
    public void use(Player pl, int n){
        usedCards.add(pl.getCard(n));
        int len = usedCards.size()-1;
        pl.useCard(n);
        lastCard = usedCards.get(len);
        if(lastCard.getDem().equals("7")){
            Scanner sc = new Scanner(System.in);
            String[] arr1 = new String[]{"sp","cl","ha","di"};
            System.out.println("1. sp / 2. cl / 3. ha / 4. di");
            System.out.println("위의 4개 중 바꾸고 싶은 패턴의 번호를 입력");
            int pt=sc.nextInt()-1;
            lastCard.setPattern(arr1[pt]);
        }
        System.out.println(point);
        sameNumber(pl);
    }
    public void oneMore(Player pl, OneCardDeck uc,int n){
        OneCard a=pl.getCard(n);
        use(pl,n);
        turn(pl,uc);
    }
    public void sameNumber(Player pl){
        for(int i=0;i<pl.size();i++) {
            if(lastCard.getDem().equals(pl.getCard(i))){
                pl.showYourCards();
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt() - 1;
                if (lastCard.getDem().equals(pl.getCard(n).getDem())) {
                    use(pl, n);
                }
                return;
            }
        }
    }
    public void demNum(Player pl, OneCardDeck uc, int n){
        OneCard oc = pl.getCard(n);
        switch (oc.getDem()){
            case "A", "2", "3":
                point ++;
                use(pl,n);
                break;
            case "J", "Q", "k":
                if(point==0){
                    oneMore(pl,uc,n);
                    break;
                } else{
                    dontUsed(pl,uc);
                    break;
                }
            case "4":
                point=0;
                use(pl,n);
                break;
            default:
                if(point==0) {
                    use(pl, n);
                } else{
                    dontUsed(pl,uc);
                }
        }
    }

    public void dontUsed(Player pl, OneCardDeck uc){
        for(int i=0;i<=point;i++) {
            pl.receiveCard(uc.draw());
        }
        point = 0;

    }
    public void gameOver(Player pl){
        if(pl.size()>=20){
            System.out.println("소유 카드 20장 초과 패배");
        }
    }
}
