package com.green.day16.ch26;

// p.643
public class StaticNested {
    public static void main(String[] args) {
        Outer.Nested1 nst1 = new Outer.Nested1(); // class 내의 class 이므로 .을 붙여서 작성해야됨
        Outer.Nested1 nst3 = new Outer.Nested1();
        nst1.add(10);
        nst1.add(2);
        nst3.add(2);
        Outer.Nested2 nst2 = new Outer.Nested2();
        System.out.println(nst2.get());
    }
}

class Outer {
    private static int num; // static 변수라서 다른객체 선언을해도 공통된 값으로 가짐(변경시 같이 올라감)

    // static nested class
    static class Nested1{
        void add(int val){
            num+=val;
        }
    }
    static class Nested2{
        int get() { return num;}
    }
}