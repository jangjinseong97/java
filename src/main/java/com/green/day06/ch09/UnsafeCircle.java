package com.green.day06.ch09;

public class UnsafeCircle {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setRad(1.5);
        // setRad에 값을 주고(Circle의 r값에 1.5가 저장됨)
        System.out.println("원의 넓이(1): " + c.getArea());
        // 이 r을 활용하는 getArea 로 출력 return을 받아야되서 double
        c.setRad(2.5);
        System.out.println("원의 넓이(2): " + c.getArea());
        // 다시 2.5로 지정을 해줬으므로 다른 값이 나옴

        c.setRad(-3.3);
        System.out.println("원의 넓이(3): " + c.getArea());

        c.rad = -3.3;
        // setRad를 거치지 않고 바로 값을 지정해줬으므로 오류가 생길 가능성이 생겨버림
        System.out.println("원의 넓이(4): " + c.getArea());
        // 여기서는 계산식으로 인해 별 문제없이 출력된것
    }
}

class Circle {
    double rad = 0; //원의 반지름
    final double PI = 3.14;

    public void setRad(double r) {
        if(r < 0) {
            rad = 0;
            return;
            //음수값으로는 변경이 되지 않도록
        }
        rad = r;
    }

    public double getArea() { //원의 넓이값을 리턴
        return (rad * rad) * PI;
    }
}
