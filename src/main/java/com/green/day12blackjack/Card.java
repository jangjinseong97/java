package com.green.day12blackjack;

public class Card {
    private final String pattern;  // 무늬
    // 생성자가 없으면 final을 사용 후 값 지정을 해주지 않으면 컴파일 에러 발생
    private final String denomination; // A, 2~10, J, Q, K
    // 맴버필드가 2개라 객체화시 2개의 String 값을 가질 수 있다.
    // 위의 2개의 내부 변수가 맴버필드

    Card(String pattern, String denomination){
        // 원문에 final이 있으면 파라메터에도 final을 주는것이 좋다
        this.pattern=pattern;
        this.denomination=denomination;
    } // 굳이 setter 안쓴이유 immutable (불변성)을 위해


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
    } // 따로 작성하지 않으면 주소값이 나오는 이유는 Object 의 메소드 때문

}
