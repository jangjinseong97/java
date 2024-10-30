package com.green.day16.ch26;

public class MemberInner {
    public static void main(String[] args) {
        Outer2 o1 = new Outer2();
        Outer2 o2 = new Outer2();

        Outer2.Member o1m1 = o1.new Member();
        Outer2.Member o2m2 = o2.new Member();

        o1m1.add(10);
        o2m2.add(30);
        System.out.println(o1m1.get());
        System.out.println(o1.parentGet());
        System.out.println("----------------");

        System.out.println(o2m2.get());
        System.out.println(o2.parentGet());
        System.out.println("----------------");
    }
}

class Outer2 {
    private int num = 0;

    class Member{ // static class 였으면 위의 num을 사용 불가능
        // 반대로 static int num 이라면 static 클래스가 아니라도 사용가능
        void add(int val){
            num += val;
        }
        int get(){
            return num;
        }
    }

    int parentGet(){
        return num;
    }
}