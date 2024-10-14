package com.green.day05.ch06;

public class Method2Param {
    static void hiEveryone(int age, double height){
        System.out.println("제 나이는" + age + "세 입니다.");
        System.out.println("저의 키는 " + height + "cm 입니다.");
    }

    public static void main(String[] args) {
        double myHeight = 175.9;
        hiEveryone(12,12.5);
        // 위에 작성한 hiEveryone 메소드르 불러오는것
        hiEveryone(12, myHeight);
        // 이런식으로 변수로도 불러오는것이 가능

        byEveryone();
        // byEveryone(); 아래에서 매개변수를 지정 안했으므로 공백으로 둬야지 오류가 생기지 않는다.
        // 확실한건 물어봐야할듯

    }
    static void byEveryone(){
        System.out.println("다음에 뵙겠습니다.");
    }
}
