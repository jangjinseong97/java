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
    protected static int count;

    SuperCLS(){
        count++;
    }
}
class SubCLS extends SuperCLS{
    void showCount(){
        System.out.println("count: " + count);
    }
}