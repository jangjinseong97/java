package com.green.day14.ch17;

public class MarkerInterface {
    public static void main(String[] args) {
//        Report0 re0 = new Report0("Sim");
//        Report1 re1 = new Report1();
//        Report2 re2 = new Report2();
//        Report3 re3 = new Report3();
        Printable2 re0 = new Report0("Sim");
        Printable2 re1 = new Report1();
        Printable2 re2 = new Report2();
        Printable2 re3 = new Report3();
        // 다형성을 이용하여

        Printer a = new Printer();
        a.printContents(re0); // Printable2 Upper
        a.printContents(re1); // Printable2 Lower >> if문으로 소문자로만 출력
        a.printContents(re2); // Printable2 Upper
        a.printContents(re3); // Printable2 Upper, Lower
        // 나머지는 if문으로 대문자로만 출력
    }
}

interface Printable2 {
    // class를 상속 못받으니 extends Object가 안된다.
    String getContents();
}

interface Upper {}
interface Lower {}

// , 를 사용하여 다중상속 가능
class Report0 implements Printable2, Upper {
    // 클래스 상속과 인터페이스 구현은 동시에 가능
    private String contents;
    @Override
    public String getContents(){
        return contents;
    }
    public Report0(String contents) {
        this.contents = contents;
    }
}

class Printer{
    public void printContents(Printable2 doc){
        if(doc instanceof Upper){
            // instanceof 형변환 확인뿐 아니라 객체가 특정 인터페이스를 구현했는지도 확인해줌
            // 비교대상이 class인지 interface인지 확인해보면 된다.
            System.out.println(doc.getContents().toUpperCase());
        } else if(doc instanceof Lower){
            System.out.println(doc.getContents().toLowerCase());
        } else {
            System.out.println(doc.getContents());
        }
    }
}

class Report1 implements Printable2,Lower{
    public String getContents(){
        return "Sim";
    }
}

class Report2 implements Printable2,Upper{
    public String getContents(){
        return "Sim";
    }
}

class Report3 implements Printable2,Upper,Lower{
    public String getContents(){
        return "Sim";
    }
}