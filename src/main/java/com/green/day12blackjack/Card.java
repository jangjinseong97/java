package com.green.day12blackjack;

public class Card {
    private final String pattern;  // 무늬
    // 생성자가 없으면 final을 사용 후 값 지정을 해주지 않으면 컴파일 에러 발생
    private final String denomination; // A, 2~10, J, Q, K

    Card(String pattern, String denomination){
        // 원문에 final이 있으면 파라메터에도 final을 주는것이 좋다
        this.pattern=pattern;
        this.denomination=denomination;
    }

    //private setter, 생성자로 2개로 설정
    // getter 로 값을 사용가능

    public String getPattern() {
        return pattern;
    }

    public String getDenomination() {
        return denomination;
    }
    @Override
    public String toString(){
        return String.format("%s(%s)",pattern,denomination);
    }
}
