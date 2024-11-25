package com.green.etc.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OneCardRule {
    // 시작시 각자 5장뽑음
    // 시작 후 각 턴마다 한장을 내고 1장을 뽑음 (3명으로 설정) 만약 모든 카드를 냈다면 승리
    // 사용된 카드 목록을 저장할 리스트
    private final List<OneCard> usedCards = new ArrayList<>();
    static int point =0;
    // 생성자: 게임 시작 시 덱에서 첫 번째 카드를 뽑아 usedCards에 저장
    public OneCardRule(OneCardDeck uc) {
        usedCards.add(uc.draw());  // 첫 번째 카드 저장
    }

    public void turn(Player pl,OneCardDeck uc) {
        pl.showYourCards();
        int len = usedCards.size()-1;
        System.out.println("깔려있는 카드: "+usedCards.get(len));
        Scanner sc = new Scanner(System.in);
        System.out.println("낼 카드 선택 없으면 아무카드 선택");
        int n=sc.nextInt()-1; // 내가 받고싶은값 스캐너로
        int k = pl.size();  // 턴 시작 시 카드 개수 저장
        OneCard oc = pl.getCard(n);  // 선택한 카드 가져오기
        if((usedCards.get(len).getJoker().equals("black")||(usedCards.get(len).getJoker().equals("color")))&&(point==0)){
            use(pl,n);
        }
        else if(oc.getJoker().equals("black")){
            point+=3;
            use(pl,n);
            // 깔린게 color일때만 black를 연속으로 낼 수있음
        }
        else if(oc.getJoker().equals("color")){
            point+=5;
            // 깔린게 black일때만 color를 연속으로 낼 수있음
            use(pl,n);
        }
        else if((oc.getPattern().equals(usedCards.get(len).getPattern())) || (oc.getDem().equals(usedCards.get(len).getDem())))
            { //usedCards의 마지막의 카드 패턴
            demNum(pl,uc,n);
//            } else if((oc.getDem().equals(usedCards.get(len).getDem()))) // 위에서 또한으로 합치면 됬었다.
//            { // 같은숫자일떄 여러개 낼수 있는 메소드

                // 생각해보니 use에 그냥 같은숫자일때 물어보는 메소드를 추가하면 됬음

//                for(int i=0;i<pl.size()-1;i++){
//                    if(pl.getCard(i).getDem().equals(usedCards.get(len).getDem())){
//                        System.out.println("더씀?");
//                        int a = sameNumber(pl);
//                        if(a >= 0 && pl.getCard(a).getDem().equals(usedCards.get(len).getDem())){
//                            use(pl,a);
//                        }
//                    }
//                }

            }else if(usedCards.get(len).getJoker().equals("black")||usedCards.get(len).getJoker().equals("color")) {
            // joker의 값을 얻어야되는데 dem의 값을 얻고있었
                if(oc.getDem().equals("A")){
                    point++;
                    demNum(pl,uc,n);
                } else if(oc.getDem().equals("4")){
                    point=0;
                    demNum(pl,uc,n);
                }
                 else if(point==0){
//                    dontUsed(pl,uc);
                    demNum(pl,uc,n);
                }else {

                    dontUsed(pl,uc);
                }
                 // 아니 이거왜 else if point ==0일땐 안됨??
                 // 이번엔 갑자기 된다.. 왜냐?
//            } else if(point!=0){
//                for(int i=0;i<point;i++){
//                    pl.receiveCard(uc.draw());
//                }
//                point = 0;
            }else{
            // pl에 uc에서 하나 드로우
                dontUsed(pl,uc);
            }
        gameOver(pl);
    }
    public void use(Player pl, int n){
        // pl의 사용카드가 j k q이면 1장더 드로우 하도록 switch문
        usedCards.add(pl.getCard(n));
        pl.useCard(n);
        System.out.println(point);
    }
    public void oneMore(Player pl, OneCardDeck uc,int n){
        OneCard a=pl.getCard(n);
        use(pl,n);
//        switch(a.getDem()){
//            case "J","Q","k":
//                oneMore(pl,uc,n);
//                break;
//        }
        if (pl.size() == 0) {
            System.out.printf("%s 승리!\n", pl);
            return;  // 재귀 종료
        }
        turn(pl,uc);
    }
    public int sameNumber(Player pl){
        pl.showYourCards();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        return n;
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
                // 따로 이것도 메소드에서 했으면 됬음
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

//    // 조건에 맞는 카드일 때만 사용하도록 설정
//    boolean cardUsed = shouldUseCard(oc);
//
//    // 카드가 사용된 경우만 처리
//    if (cardUsed) {
//        usedCards.add(oc);  // 사용된 카드 목록에 추가
//        pl.useCard(n);  // 카드 사용
//    } else {
//        // 카드가 사용되지 않은 경우 새 카드 뽑기
//        pl.add(uc.draw(), n);
//    }
//
//    // 게임 종료 조건 체크
//    if (pl.size() == 0) {
//        System.out.printf("%s 게임 끝\n", pl);
//    }
//
//    // 카드 개수 변화가 없으면 새 카드 받기
//    if (pl.size() == k) {
//        pl.receiveCard(uc.draw());
//    }
//}
//
//    // 문양 또는 숫자가 같은 경우 true를 반환하는 메서드
//    private boolean shouldUseCard(OneCard oc) {
//        // 마지막으로 사용된 카드의 패턴과 숫자 가져오기
//        String lastUsedPattern = usedCards.get(usedCards.size() - 1).getPattern();
//        String lastUsedDem = usedCards.get(usedCards.size() - 1).getDem();
//
//        // 문양이 같거나, 숫자가 같은 경우 true 반환
//        if (oc.getPattern().equals(lastUsedPattern)) {
//            return true;  // 문양이 같음
//        } else if (oc.getDem().equals(lastUsedDem)) {
//            return true;  // 숫자가 같음
//        }
//        return false;  // 조건을 만족하지 않음
//    }







//    public void turn(Player pl,int n,OneCardDeck uc){
//        int k = pl.size();
//        int nn=0;
//        OneCard oc = pl.getCard(n);
//        if(oc.getJoker().equals("black")){
//            pl.useCard(n);
//            attack+=5;
//            turn(pl,nn,uc);
//            return;
//        }
//        if(oc.getJoker().equals("color")){
//            pl.useCard(n);
//            attack+=7;
//            turn(pl,nn,uc);
//            return;
//        }
//        String lastUsedPattern = usedCards.get(usedCards.size()-1).getPattern();
//        String lastUsedDem = usedCards.get(usedCards.size()-1).getDem();
//
//        if(oc.getPattern().equals(lastUsedPattern)){
//            switch(oc.getDem()){
//                case "A":
//                    pl.useCard(n);
//                    attack +=3;
//                    break;
//                case "2":
//                    pl.useCard(n);
//                 attack +=2;
//                 break;
//                case"3":
//                    pl.useCard(n);
//                 attack++;
//                 break;
//                case"4":
//                    attacked=0;
//                    pl.useCard(n);
//                    break;
//                case"Q","j","k":
//                 // 카드 보여줌 스캐너 버릴카드 선택 nn에 저장
//                    pl.useCard(n);
//                    turn(pl,nn,uc); //
//                    break;
//                default:
//                    pl.useCard(n);
//                    turn(pl,nn,uc);
//            }
//        } else if(oc.getDem().equals(lastUsedDem)){
//            switch(oc.getDem()){
//                case "A":
//                    attack +=3;
//                    pl.useCard(n);
//                    break;
//                case "2":
//                    attack +=2;
//                    pl.useCard(n);
//                    break;
//                case "3":
//                    attack++;
//                    pl.useCard(n);
//                    break;
//                case"4":
//                    attacked=0;
//                    pl.useCard(n);
//                    break;
//                case"Q","j","k":
//                    // 카드 보여줌 스캐너 버릴카드 선택 nn에 저장
//                    pl.useCard(n);
//                    turn(pl,nn,uc); //
//                    break;
//                default:
//                    pl.useCard(n);
//                    turn(pl,nn,uc);
//            }
//        } else {
//            pl.add(uc.draw(), n);
//        }
//        if(pl.size()==0){
//            System.out.printf("%s 게임끝",pl);
//        }
//        if(pl.size()==k){
//            pl.receiveCard(uc.draw());
//        }
//
//    }

}
