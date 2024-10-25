package com.green.day14.ch17;
/*
    용어적으로
    인터페이스(Interface) : 이질적인 플랫폼간에 통신을 할 수 있는 역할을 해주는 것

    사람이 컴퓨터를 쓸때 키보드, 마우스 사용(이때 키보드 마우스 모니터를 인터페이스)
    게임에서 화면에 나오는 버튼 HP, MP 보이는 부분을 인터페이스

    자바에서
    인터페이스 : 추상 메소드와 static 맴버필드만 가질 수 있는 존재
    이때 인터페이스의 이름은 보통 형용사 (~~ 할 수 있는)
    추상 메소드의
 */

public class PrintableInterface {
    public static void main(String[] args) {
        Printable p1 = new PrintableImpl();
//        Printable p1 = new Printable();  추상클래스와 마찬가지로 객체화는 x
        System.out.println(p1.NUM); // static이 아닐떄 사용방법 새 객체선언 거기에서의 p1
        System.out.println(Printable.NUM); // static 이니까 선언없이도 바로 저기의 p1
    }
}

// interface를 만들면 생략하면 무조건 들어가는 키워드가 존재
//interface Printable{
//    public static final int num = 0;        // 맴버필드앞에는 public static final 이 무조건
//    public abstract void print(String doc); // 메소드 앞에는 public abstract 이 무조건 추가
//}

interface Printable{
    int NUM = 0; //final 때문에 자주 사용하진 않음
    void print(String doc); // 주로 메소드 때문에 사용함
}

// 인터페이스를 상속받았을땐 주로 implements
class PrintableImpl implements Printable{

    @Override
    public void print(String doc) {
        System.out.println(doc);
    }
}