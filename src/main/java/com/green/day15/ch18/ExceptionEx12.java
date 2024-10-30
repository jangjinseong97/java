package com.green.day15.ch18;

public class ExceptionEx12 {
    public static void main(String[] args) {// 메인메소드에선 throw금지 에러터짐
        try {
            method01();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    static void method01() throws Exception{ //실행때 메소드에 오류가 생기던 말던 던짐
        method02();
    }
    static void method02()throws Exception{
        throw new Exception("하하"); // throws 메소드뿐만이 아닌 예외를 일부러 발생시키고 싶을때 사용가능
    }
}
