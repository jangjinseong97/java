package com.green.day06.ch09;

public class GetterSetterExam {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student라는 class를 호출하여 거기 s1을 지정
        s1.setName("홍길동"); // s1 객체    class Student 내 setName에 "홍길동"을 보냄
        System.out.println(s1.getName());

        Student s2 = new Student(); //s2객체
        s2.setName("신사임당");
        System.out.println(s2.getName());
    }
}

class Student {
    private String name;
    private int age;
    private float height;

    public void setName(String name) {
        this.name = name;

    //this는 나 자신의 주소값이 저장된 상수 (나 자신을 가리킨다)
        // 추가 설명이 있을듯? 없으면 찾아보기
    //name-setter
    }

    public String getName() {
        return name;
    //name-getter
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

}