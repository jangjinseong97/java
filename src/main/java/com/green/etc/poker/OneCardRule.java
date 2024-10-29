package com.green.etc.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OneCardRule {
    // 시작시 각자 5장뽑음
    // 시작 후 각 턴마다 한장을 내고 1장을 뽑음 (3명으로 설정) 만약 모든 카드를 냈다면 승리
    // 사용된 카드 목록을 저장할 리스트
    private final List<OneCard> usedCards = new ArrayList<>();
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
        if(oc.getJoker().equals("black")){
            use(pl,n);
            // 깔린게 color일때만 black를 연속으로 낼 수있음
        }
        else if(oc.getJoker().equals("color")){
            use(pl,n);
            // 깔린게 black일때만 color를 연속으로 낼 수있음
        }
        else if((oc.getPattern().equals(usedCards.get(len).getPattern())))
            { //usedCards의 마지막의 카드 패턴
            switch (oc.getDem()){
                case "A", "2", "3":
                    use(pl,n);
                    case "J", "Q", "K":
                    oneMore(pl,uc,n);
                    break;
                default:
                    use(pl,n);
            }
            } else if((oc.getDem().equals(usedCards.get(len).getDem())))
            { // 같은숫자일떄 여러개 낼수 있는 메소드
                use(pl,n);
                for(int i=0;i<pl.size()-1;i++){
                    if(pl.getCard(i).equals(usedCards.get(len).getDem())){
                        System.out.println("더씀?");
                        int a = sameNumper(pl);
                        if(a != 0 && pl.getCard(a).equals(usedCards.get(len).getDem())){
                            use(pl,a);
                        }
                    }
                }

            }else if(usedCards.get(len).equals("black")||usedCards.get(len).equals("color")) {
                if(oc.getDem().equals("A")){
                    use(pl,n);
                }
            } else{
            // pl에 uc에서 하나 드로우
            pl.receiveCard(uc.draw());
        }
    }
    public void use(Player pl, int n){
        usedCards.add(pl.getCard(n));
        pl.useCard(n);
    }
    public void oneMore(Player pl, OneCardDeck uc,int n){

        use(pl,n);
        turn(pl,uc);
    }
    public int sameNumper(Player pl){
        pl.showYourCards();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt()-1;
        return 0;
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
