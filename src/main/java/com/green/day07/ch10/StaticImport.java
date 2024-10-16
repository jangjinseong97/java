package com.green.day07.ch10;

import static java.lang.Math.*;  //*은 all의 의미가 있다.
//Math 클래스 아래에 있는 static 멤버필드(static의 것이니 정적변수)
// , 멤버메소드( 다른 예제에서의 영어.() 이 설정 해둔것들 ) 전부 import하라는 의미
// 참고로 이때 static을 부여하지 않은 인스턴트 변수들은 들고올 수 없음


public class StaticImport {
    public static void main(String[] args) {
        /*
        원래는 아래처럼 작성을 해야하지만
        System.out.println( Math.E );
        System.out.println( Math.random() );

        static import 선언을 하면
         */
        System.out.println( E );
        System.out.println( random() );
    }
}