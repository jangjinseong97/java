package com.green.day15.ch21;

// Generic이 없던 시절의 코드
public class FruitAndBox {
    public static void main(String[] args) {
        Apple a = new Apple();
        AppleBox aa = new AppleBox(a);
        AppleBox aa1 = new AppleBox(new Apple()); // 다른 방법, 타입이슈로 형변호나 필수

        Orange b = new Orange();
        OrangeBox bb = new OrangeBox(b);
    }
}

class Apple{
    public String toString(){
        return "사과";
    }
}

class Orange{
    public String toString(){
        return "오렌지";
    }
}

class AppleBox{
    private Apple ap;
    AppleBox(Apple ap){
        this.ap = ap;
    }
    public Apple getAp(){ // getter는 맴버필드의 값을 따라감
        return ap;
    }
}

class OrangeBox{
    private Orange orange;
    OrangeBox(Orange orange){
        this.orange = orange;
    }
    public Orange getOrange(){ // getter는 맴버필드의 값을 따라감
        return orange;
    }
}