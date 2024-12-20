package com.green.day07.ch07;

public class Car {
    private String color;
    private String gearType; //auto, manual
    private int door;

    //정의할 때 생성자와 메소드 다른 점 2가지
    //1. 이름은 클래스명과 같다
    //2. 리턴타입(반환형) 작성하면 안된다.

    /*
        this 사용법은 2가지가 있다.
        1. this.  : 멤버필드, 멤버메소드 사용, this. 생략가능할 때가 있다.
        2. this() : 생성자에서 다른 생성자 호출시 사용 가능
     */
    public Car() {
        this("white", "auto", 4);
        //this.introduce();
        //introduce();
        // 3개다 같은것
        // a문구
    }

    public Car(String gearType, int door) {
        this("white", gearType, door);
        // b문구
    }

    public Car(String colo, String gearType, int door) {
        color = colo; //매개변수명이 맴버필드명과 달랐다면 this.을 생략할 수 있었다.
        this.gearType = gearType;
        this.door = door;
        // c문구
    }

    public void introduce() {
        //this("dd", "ddd", 12);
        // introduce메소드가 호출이 된다는 말은 이미 객체생성이 끝난 이후다
        // 생성자는 객체 생성시에만 호출할 수 있기 때문에 객체생성 이후에는 호출 불가다.
        System.out.printf("%s 컬러의 %s 기어를 가진 %d개의 문짝이 있는 자동차\n"
                , color, gearType, door);
    }
}

class CarTest {
    public static void main(String[] args) {
        //main메소드의 내용을 수정하지 않고
        //생성자를 이용하여
        //"white 컬러의 auto 기어를 가진 4개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요.
        Car c1 = new Car();
        c1.introduce();

        Car c2 = new Car();
        c2.introduce();
        // c1 와 c2는 a와 연결
        Car c3 = new Car("red", "manual", 5);
        c3.introduce();
        //"red 컬러의 manual 기어를 가진 5개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요.

        Car c4 = new Car("auto", 6);
        c4.introduce();
        // 기본이 white가 되어 있었으므로 굳이 넣지않아도 되는것
        //"white 컬러의 auto 기어를 가진 6개의 문짝이 있는 자동차"가 표시될 수 있게 해주세요.
        // c3는 c c4는 b와 연결
    }
}
