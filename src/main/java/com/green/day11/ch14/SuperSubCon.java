package com.green.day11.ch14;

public class SuperSubCon {
    public static void main(String[] args) {
        ClassC c = new ClassC();
        new ClassC(); // 선언만하는거라 이런식으로 해도 ㄱㅊ다.
        // super(); 가 항상 자식 생성자 가장 위에 있으므로 그로인해
        // ClassC 의 sout가 출력되기 전에 ClassB를 ClassB 의 sout가 출력되기 전에 ClassA가 호출되어
        // ClassA ClassB ClassC가 각각 출력이 되는것
    }
}

//ClassC는 B를 상속받음 B는 A를 상속
// 다중상속(2부모가 1자녀에게 상속) 은 충돌로 인해 자바에선 불가능(인터페이스에서는 가능)

class ClassA{
    // extends가 없어도 object가 상속해줌으로 super(); 가 있긴하다.
    public ClassA(){
        System.out.println("==== ClassA ====");

    }

}

class ClassB extends ClassA{
    public ClassB(){
        System.out.println("==== ClassB ====");
    }

}

class ClassC extends ClassB{
    public ClassC(){
        System.out.println("==== ClassC ====");
    }

}