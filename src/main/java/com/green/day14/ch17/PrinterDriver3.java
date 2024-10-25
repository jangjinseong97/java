package com.green.day14.ch17;

public class PrinterDriver3 {
    public static void main(String[] args) {
//        ColorPrintable cp = (ColorPrintable) new Prn204Drv();
        // 위치상 Color 가 자녀타입 Prn204Drv 가 부모
        // Prn204Drv 는 Printable에게 상속받음
        // Printable은 ColorPrintable보다 부모티입
        // 그냥 Prn204Drv는 Color한테서 구현(상속)받은적 없어서가 맞는듯
        // 인터페이스일땐 구현 extends 일땐 상속
    }
}
/*  class      class     상속 extends
    interface  interface 상속 extends
    class      interface 상속 받을떄 implements 여기의 반대의 경우는 불가능(interface class 상속 x)

    implements
 */


interface ColorPrintable extends Printable{
    // interface 에서의 extends 는 코드를 그대로 들고오는식
    void printCMYK(String doc);
    // CMYK : 인쇄를 위한 색상코드
}
//Prn909Drv 의 객체의 주소값은
//Printable, ColorPrintable, Prn9090Drv 를 타입으로 다 주소값을 담을 수 있는것.(상속의 상속)
//Prn9090Drv 타입으로 호출가능한 메소드는 print printCMYK
//ColorPrintable 도 동일하게 printCMYK print(상속받아서)
//Printable 은 print 한개
// 위가 다형성 >> 가능한 타입은 가장 높은걸로(가장 부모쪽) 해주는게 좋음
class Prn909Drv implements ColorPrintable{

    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }
}