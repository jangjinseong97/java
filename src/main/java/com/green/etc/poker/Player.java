package com.green.etc.poker;

import com.green.day12blackjack.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private final List<OneCard> cards;
    private int a = 0;
    private final String name;
    public Player(String name){
        cards = new ArrayList();
        this.name=name;
//        cards.add(null); 이거 이용해서 0번 지정시 포기하는식으로
    }
    public void receiveCard(OneCard oc){
        a++;
        cards.add(oc);
    }

    public void showYourCards(){
        int i=0;
        for(OneCard c : cards){
            i++;
            System.out.printf("%d. %s\t",i,c);
            if(i%10==0){
                System.out.println();
            }
        }
        System.out.println("");
    }
    public void useCard(int n){
        cards.remove(n);
    }
    public int size(){
       return cards.size();
    }
    public void add(OneCard oc, int n){
        cards.add(n,oc);
    }
    public OneCard getCard(int n){
        OneCard uc = cards.get(n);
        return uc;
    }
    public String toString(){
        return name;
    }
}
