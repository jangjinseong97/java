package com.green.day01.ch01;

public class SystemOutPrintln {
    public static void main(String[] args) {
        // psvm (public static void main(String[] args)) 간축어
        System.out.println(7);
        System.out.println(3.15);
        System.out.println("3 + 5 = " + 8); // 정수가 문자열을 만나 자동형변환
        System.out.println(3.15 + "는 실수입니다."); // 실수가 문자열을 만나 자동변환
        System.out.println("3 + 5" + "의 연산 결과는 8입니다.");
        // 문자열과 더하기가 만나면 다른항은 무조건 문자열로 자동형변환(타입 상관없이)
        // 연산의 우선순위는 소괄호로 결정
        System.out.println(3 + 5);
        // 3+5 연산을 한 뒤 나온 값인 8이 println 메소드에 보내지는것
    }
}
