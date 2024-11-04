package com.green.day16.ch26;
// p.653 익명클래스
/* 익명클래스는 interface 를 implements한 클래스를만들지 않고
    다이렉트로 interface 를 implements(구현) 클래스를 객체화 할때 사용가능
    코드작성을 많이 생략가능
    그 보다 더 생략가능한게 람다식
    람다식은 해당 interface의 추상메소드가 하나일때문 가능
    익명클래스일때는 여러개라도 상관없음
    @FunctionalInterface 애노테이션으로 보통 람다식 구분
    이 애노테이션이 있을때 2개의 추상메소드를 가지만 컴파일에러
 */
public class UseAnonymousInner {
    public static void main(String[] args) {

        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("익명클래스 print");
            }
        }; // 위의 익명클래스의 축약식
        Printable p2 = () -> { // 람다식
            // ()는 추상클래스의 파라미터를 따라감
            // -> 람다식의 시작부분
            System.out.println("람다 print");
        }; // 내용이 1줄일때는 중괄호도 생략가능


        p.print();
        p2.print();
    }
}
// 추상메소드만 잇어서 구현부가 없음 >> 객체화를 막아둠

// 추상메소드가 하나만 가지고 있는 interface만 람다식 사용가능
// 2개부턴 람다식에서 오류가 발생
@FunctionalInterface // 람다식을  쓰고싶은 인터페이스일떄
    // 한 인터페이스에 2개의 추상메소드이면 빨간줄이 그이게되어 구분하기 쉬워짐
interface Printable{
    void print();
}