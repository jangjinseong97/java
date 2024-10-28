package com.green.etc.poker;

public class OneCardDeck {
    private final OneCard[] cards ;
    private final String [] patterns;
    private final String [] joker;
    OneCardDeck(){
        cards= new OneCard[54];
        patterns = new String[]{"di", "sp", "ha", "cl"};
        joker = new String[]{"black", "color"};
        // 카드덱 생성 52까지 숫자+문양 53 54 조커
        int k=0;
        for(int i=0;i<patterns.length;i++){
            for(int n=1;n<=(cards.length- joker.length)/ patterns.length;n++){
                cards[k++]= new OneCard(patterns[i],denNew(n));
            }
        }
//        System.out.println(k); // k가 52

        for(int i=0;i< joker.length;i++){
            cards[k++]=new OneCard(joker[i]);
            // cards[ ] 이라서 방의 값을 줘야되서 k++을 했어야 됬는데 순서를 생각해서
            // 53번째 값을 준다고 ++k를 했었다.
        }
        mix();
    }

    public String denNew(int n){
        switch (n) {
            case 1 :
                return "A";
            case 11:
                return "J";
            case 12:
                return "Q";
            case 13:
                return "k";
            default:
                return String.format("%d",n);
        }
    }
    public void mix(){
        for(int i=0;i<cards.length;i++){
            int n = (int)(Math.random()*cards.length); // 53까지 쳐피 배열은 0~53
            OneCard a = cards[i];
            cards[i] = cards[n];
            cards[n] = a;
        }
    }
    int count=0;
    public OneCard draw(){
        OneCard a = cards[count];
        cards[count] = null;
        count++;
        return a;
    }

    public void cardCheck(){
        for(OneCard item: cards){
            System.out.println(item);
        }
    }
    public void cardCheck(Player p){
        System.out.println(p);
    }
}
