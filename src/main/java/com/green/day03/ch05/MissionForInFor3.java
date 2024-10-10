package com.green.day03.ch05;

public class MissionForInFor3 {
    public static void main(String[] args) {
        int star = (int)((Math.random()) * 6.0) + 3;
        for(int i=star ;i>0 ;i--){
            for(int k=star; k>0; k--){
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("----");
        for(int i=1 ;i<=star ;i++){
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
            System.out.println();

        }
        // 항상 for문안이 true가 되야 실행이 된다는것을 생각하기 자꾸 항상 false인 상황을 만들때가 많음
        System.out.println(star);
        for(int i=1; i<=(star*star); i++){
            System.out.print("*");
            if(i % star == 0){
                System.out.println();
            }
        }
        // 위와 같이 for문 하나로도 해결 가능
        // star*star 바로 넣는것도 괜찮지만 변수 선언을 외부에서 한 뒤 끌어오는것이 더 안전
    }
}
