package com.green.day15.ch21;

public class FruitAndBox2Generic {
    public static void main(String[] args) {
        BoxGeneric<Apple> appleBox = new BoxGeneric<>(new Apple());
        // <>조차 주지않으면 들어가는타입이 Object로 만들어짐
        Apple apple = appleBox.getBox();

        BoxGeneric<Orange> orangeBox = new BoxGeneric<>(new Orange());
        Orange oreange = orangeBox.getBox();
    }
}
class BoxGeneric<T>{ // T는 객체화가 될때 타입을 정하게 되는것
    private T fruit;

    BoxGeneric(T fruit){
        this.fruit=fruit;
    }
    T getBox(){
        return this.fruit;
//        return fruit;
    }
}