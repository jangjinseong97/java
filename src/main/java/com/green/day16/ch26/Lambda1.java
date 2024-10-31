package com.green.day16.ch26;

public class Lambda1 {
    public static void main(String[] args) {
        PrintableVer2 p = (s) -> System.out.println(s);
        // 파라미터에 s는 String 타입의 s가 된것
        p.print("하하");
        // s에 하하를 넣게 된것

        PrintableVer2 p2 = s -> System.out.println(s);
        // 파라미터가 1개일 경우 소괄호 생략

        Calc sumCalc = (n1, n2) -> n1 + n2;
//        Calc exSumCalc = (n1, n2) -> return n1 + n2;
        // 중괄호 생략시 return 도 생략 가능(필수임 return 작성시 컴파일에러)
        System.out.println(sumCalc.calc(5, 8));

        Calc minusCalc = (n1, n2) -> {return n1 - n2;};
        System.out.println(minusCalc.calc(10, 7));
    }
}

@FunctionalInterface
interface PrintableVer2{
    void print(String str);
    // 파라미터o 리턴x > 컨슈머
    // 파라미터x 리턴o > 서플라이
    // 파라미터o 리턴o > function
}

@FunctionalInterface
interface Calc{
    int calc(int n1, int n2);
}