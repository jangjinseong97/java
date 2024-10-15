package com.green.day06.ch07;

//import com.green.day06.ch09.Circle2; //디폴트 지시어는 다른 패키지에서는 접근 불가능하다.
// Circle2 에서는 생략된 default 가 있는것이므로 불러오는것이 불가능(다른 패키지라)

import com.green.day06.ch09.InfoHideCircle; //다른 패키지에 있는 클래스면 import를 하여 사용한다.
// InfoHideCircle 는 public 이라 import로 불러오는것이 가능


public class AccessLevelTest {
    public static void main(String[] args) {
        InfoHideCircle ihc = new InfoHideCircle();
        //InfoHideCircle은 public이기 때문에 다른 패키지에서 접근가능하다.

        String str = "String은 워낙 자주 사용하기 때문에 자동으로 import가 된다.";

        //Circle2 c = new Circle2();

    }
}
/*
    class 키워드 앞에 public을 붙일 수 있는 경우는
    java파일명과 class명이 일치할 때만 붙일 수 있다.
    나머지는 불가능
    1 class랑 1파일 만든다.
 */
// public class AccessLevel { 오류가 발생

class AccessLevel {
}
