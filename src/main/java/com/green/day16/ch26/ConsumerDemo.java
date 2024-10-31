package com.green.day16.ch26;

import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> cons = (a) -> System.out.println(a<0 ? -a : a) ;
        // if를 써도 되긴하지만 {} 를 추가해줘야됨
                cons.accept(10); // 10
                cons.accept(-20); //
        Consumer<String> cons2 = s -> System.out.printf("%s는 %d글자 입니다.\n",s,s.length());

        cons2.accept("abc"); // abc는 3글자입니다
        cons2.accept("abca");
    }
}
