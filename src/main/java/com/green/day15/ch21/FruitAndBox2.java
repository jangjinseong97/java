package com.green.day15.ch21;

public class FruitAndBox2 {
    public static void main(String[] args) {
        FruitBox appleBox = new FruitBox(new Apple());
        FruitBox orangeBox = new FruitBox(new Orange());
        Apple apple = (Apple)appleBox.getFruit();
        Orange orange = (Orange)orangeBox.getFruit();
        FruitBox orangeBox2 = new FruitBox("오렌지");
//        Orange orange2 = (Orange)orangeBox2.getFruit();
//      orangeBox2에는 오렌지 라는 String이 들어가 있어 런타임 에러

        System.out.println("-- ㄲㅌ --");
    }
}

class FruitBox {
    private Object fruit;
    FruitBox(Object a){
        this.fruit=a;
    }
    Object getFruit(){
        // get은 private 의 값을 얻고싶어 쓰는것이므로 그 fruit가 필요한거라 fruit의 타입으로 작성
        return fruit; //이미 저장한건 Apple과 Orange의 객체값이라 형변환 문제x
    }
}

