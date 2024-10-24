package com.green.day12blackjack;

import com.green.day07.ch07.Car;

public class CardDeck {
    private final Card[] cards; // 뒤에 new Card[52];를 하여도 되지만 보통 생성자쪽에 한다.
    // 배열인 cards 의 주소값을 바꿀수 없다는뜻 배열안의 값은 바꿀수 있는것
        private final String [] patterns; // 여기 기준 아무값도 지정 안했으므로 null 값이 들어가 있는것
        // 객체화된 변수라서
        private String [] denomination = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public CardDeck(){
        // 여기 생성되는 지역 변수는 null이라도 지정을 해줘야됨

        cards = new Card[52];
        patterns = new String[]{"Spade", "Clover", "Diamond", "Heart"};
//        Card a = new Card("","");
//        for(int i=0;i<cards.length;i++){
//            cards[i] = a;
//        }
        // 52개의 방은 만들어 지겠지만 이는 주소값을 for문 밖에서 지정 해둔것으로 저장해주는 것이므로
        // 싹다 같은 주소값이 저장이 된다. 따라서 아래와 같이 for문 안에서 할 수 있도록 해주는게 맞다.
        // 생각보다 자주 나오는 실수임<<


        for(int i=0;i<cards.length;i++){
            cards[i] = new Card("A", "B");

        }
        // for for 앞에껀 4번 뒤에껀 13번 둘다 배열로 만들어서

//        for(int i = 0; i< patterns.length; i++){
//            for(int n = 0; n<denomination.length; n++){
//                cards[(i*13)+n] = new Card(patterns[i], denomination[n]);
//            }
//
//        }

//        int length = cards.length/ patterns.length ;
//        for(int i=0; i<patterns.length; i++){
//            for(int n=0; n<length; n++){
//                cards[(i*length)+n] = new Card(patterns[i], getDenomination(n+1));
//            } // cards[] 에서 연산을 계속 해버리니까 손해를봄
//        }

        int length1 = cards.length/ patterns.length;
        int k = 0;
        for(int i=0; i<patterns.length; i++){
            for(int n=1; n<=length1; n++){ // 여기 n값에 +1을 넣고  n<=로 범위도 수정
                cards[k++] = new Card(patterns[i], getDenomination(n));
//                 k++; 위에 card[k] 에 한번에 넣으면 됬다.
                // 어쳐피 52번 도는거 k를 넣어서 순서대로 넣을수 있도록 헀으면 됬음
            }
            // 또한 일일히 +1을 하는것 보단 시작점과 끝점에 1을 더하면 되는거였음
        }

//        Card[] suf = new Card[1]; // 배열의 갯수인데 0으로 지정햇으면 안됬다.
//        for(int i=0;i<cards.length;i++){
//            int n = (int)(Math.random()*52);
//            suf[0] = cards[i];
//            cards[i] = cards[n];
//            cards[n]=suf[0];
//        }

        for(int i=0;i<cards.length;i++){
            int n = (int)(Math.random()*cards.length);
            Card a = cards[i];
            cards[i] = cards[n];
            cards[n]= a;
        } // 어쳐피 Card의 공간 하나면 됬던거라 굳이 새로 만들 필요가 없었다.
        // 그냥 이처럼 바로 Card 를 객체로 가지는 a를 하나 만들고 그 a를 썻으면 된것


        shuffle(); // 이건 아래의 메소드로 작성후 해서

        // 생성자 안에 있어서 호출할떄 자동으로 출력되서 test에 값이 바로 나오는것

//        for(Card c : cards){
//            System.out.println(c);
//        }         shuffle(); 확인용

//            System.out.printf("%s(%s)",c.getPattern(),c.getDenomination());

            // Card에서 toString을 Override 했어야 된것.
            // c가 주소값이 나오는건 toString (생략되어있는)때문이였기에 >> c.toString 에서 .toString이 생략
            // 여기서 c는 Card의 주소값이므로 CardDeck이 아닌 Card에서 메소드를 작성해야되는것
    }
//    public String getDenomination(int n){
//
//        String [] nn = {"","A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",""};
//        return nn[n];
//    } 15 ~는 값이 없잖
    public String getDenomination(int n){

        String [] nn = denomination;
        if(n<14&&n>0){
            return nn[n-1];
        }
//        } else {
//            return "";
//        }
        return "";
    }

    public String getDenomination1(int n){
        switch (n){
            case(1):
                return "A";
            case(11):
                return "J";
            case(12):
                return "Q";
            case(13):
                return "k";
        }
        if(n<14&&n>0){
//            return String.format("%d",n);
            return String.valueOf(n);
        }
        return ""; // 참고로 " " 와 ""는 다름(스페이스바로 인해 길이부터 달라짐
    }

    public String getDenomination2(int n){
        if(n < 1 || n > 13){
            return "";
        }
        switch (n){
            case(1):
                return "A";
            case(11):
                return "J";
            case(12):
                return "Q";
            case(13):
                return "k";
            default:
                return String.valueOf(n);
        }
    }

    private void shuffle(){
        for(int i=0;i<cards.length;i++){
            int n = (int)(Math.random()*cards.length);
            Card a = cards[i];
            cards[i] = cards[n];
            cards[n]= a;
        }
    }
    private int selectedIdx = 0; // 가장 위에 있는것이 좋지만 지금은 보기 편하게
    // class 내부의 변수로 쓸수 있도록 private 또한
    public Card draw(){
        if(selectedIdx>=cards.length){
            return null;
        }
        Card a = cards[selectedIdx];
//        cards[selectedIdx] = null;
//        selectedIdx++;
        cards[selectedIdx++] = null; // 로 해도 됬던것 사용하고나서 ++라서
        return a;
    }
    public void checkCard(){
        for(Card c : cards){
            System.out.println(c);
        }
    }
}
