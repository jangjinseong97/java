package com.green.day10.ch14;

public class SuperSubStatic {
    public static void main(String[] args) {
        SuperCLS s1 = new SuperCLS();
        SuperCLS s2 = new SuperCLS();
        SubCLS a = new SubCLS();
//        SubCLS a2 = new SubCLS(); SubCLS를 호출하면서 SuperCls 가 호출되므로 이떄 1이 증가하는것
        a.showCount();
        a.showCount(); // void showConunt() 를 불어오는것이므로 바로 sout로 가는것

    }
}

class SuperCLS {
    // 위 클래스가 public이 들어가지 못하는 이유는 최대 1파일에 1public class 이므로 추가로 파일명이랑 달라서
    protected static int count;
    // static 한공간을 공유해서 쓰는것
    SuperCLS(){
        count++;
    }
}
class SubCLS extends SuperCLS{
    void showCount(){
        System.out.println("count: " + count);
    }
}