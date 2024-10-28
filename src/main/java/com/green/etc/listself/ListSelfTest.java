package com.green.etc.listself;

import java.lang.reflect.Array;
import java.util.List;

public class ListSelfTest {
    public static void main(String[] args) {
        ListSelf a = new ListSelf();
        a.add(10);
        System.out.println(a);
        a.add("ex");
        System.out.println(a);
        a.add(1);
        a.add(2,"ample");
        System.out.println(a);
        a.remove(1);
        a.add(2);
        a.add(1);
        System.out.println(a);
        System.out.println(a.size());
        System.out.println(a.index(0));
        System.out.println(a.lastIndex(1));
        a.sum();
        a.add("ex");
        a.add(7);
        System.out.println(a);
        a.intDelete();
        System.out.println(a);
        System.out.println("------------");
        a.clear();
        System.out.println(a.size());
    }

}
