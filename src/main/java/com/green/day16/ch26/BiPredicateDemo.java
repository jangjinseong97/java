package com.green.day16.ch26;

import java.util.function.BiPredicate;

// BiPredicate 인자 2개
public class BiPredicateDemo {
    public static void main(String[] args) {
        // 특정 문자열의 길이가 내가 정한 정수값 보다 크면 true 아니면 false
        BiPredicate<String ,Integer> conv = (str, len) -> str.length() > len;
        System.out.println(conv.test("Robot",3));
        System.out.println(conv.test("Box",3));

        String str1 = "Hello";
        String str2 = "Halo";

        BiPredicate<String, String> conv2 = (st1, st2) -> st1.length() == st2.length();
        // 위에서 변수선언이 된걸 파라미터로 사용할땐 컴파일 에러가 난다
        String st1 = "aa";
        String st2 = "bb";
        // 작성 한뒤 는 파라미터로 사용한 변수로 새로운 변수를 선언하여도 상관없다.
        if(conv2.test(str1,str2)){
            System.out.println("두 문자열의 길이는 같습니다.");
        } else {
            System.out.println("두 문자열의 길이는 다릅니다.");
        }
    }
}
