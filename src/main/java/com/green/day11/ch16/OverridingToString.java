package com.green.day11.ch16;

public class OverridingToString {
    public static void main(String[] args) {
        Cake a = new Cake();
        System.out.println(a);
        Cheesecake b = new Cheesecake();
        System.out.println(b);
        Cake c = b;
        System.out.println(c); // 실행이되면 b나 c가 똑같음
    }
}
class Cake {
    // Cake 뒤에 extends Object 가 있고 그로 인해 toString이 오버라이딩 된것
    @Override
    // 오류 확인을 위해 오버라이딩을 할때 작성(실수방지용)
    public String toString(){
        return "My birthday cake";
    }

    final void blowCandle(){
        // final 을 앞에 붙이면 오버라이딩 불가능
        System.out.println("초를 분다.");
    }
}
// class 앞에 final 키워드가 있으면 상속금지
// 대표적으로 String 클래스는 상속이 불가능
final class Cheesecake extends Cake {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString(){
        return "My birthday cheese cake";
    }
//    void blowCandle(){
//
//        System.out.println("초를 분다.");
    // 부모의 blowCandle에 final이 있어서 오버라이딩이 에러가 뜸
}
//class ChesseC extends Cheesecake{
//
//}
  // 상속받을 수 없어 컴파일에러