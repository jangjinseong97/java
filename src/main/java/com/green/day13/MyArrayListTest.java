package com.green.day13;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        list.add(1,30);
        System.out.println(list);
        System.out.println("-------");
        System.out.println(list.indexOf(20));
        System.out.println(list.lastIndexOf(30));
        System.out.println("--------");
        list.clear();
        System.out.println(list.size());
    }
}
class MyArrayTest2{
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        int removeValue = list.remove();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(removeValue);
    }
}
