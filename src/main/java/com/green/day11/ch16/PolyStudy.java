package com.green.day11.ch16;

//다형성
public class PolyStudy {
    /*
    다형성을 이해할 때 맴버필드도 이해해야되나 은닉화로 직접사용을 하지않아
    맴버메소드만 어떻게 동작하는지 이해하면 된다.
    1. 부모타입은 변수는 자식객체 주소값 저장 가능
    2. 1번의 반대는 안된다. 자식타입객체는 부모타객체 주소값을 저장 불가능
    3. 타입은 호출할 수 있냐없냐(아는 메소드만 호출 가능, 모르는것은 불가능)를 구분하고,
     호출이 된다면 객체 기준(우리가 원래 알던대로 동작)
     안다 모른다 구분은 해당 메소드를 가지고 있냐 없냐로 구분(상속받은 메소드도 아는메소드)

   레퍼런스 변수끼리의 형변환이 가능하지만 이는 상속관계에서만 가능
   또한 형변환은 되지만 위의 2번으로 인해 런타임 에러 발생가능
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.crying(); // 고양이가 운다~
        System.out.println("--------------");

        // 1번의 검증
        Animal ani1 = new Cat();
        Animal ani2 = new Dog();
        Animal ani3 = new BullDog();
        Animal ani4 = new Bird();
        Dog dog1 = new BullDog();
        System.out.println("----끝----");

        // 2번 검증
//        BullDog bull = new Dog(); 컴파일 에러 발생
//        BullDog bull = (BullDog)ani2; // 런타임 에러발생
//        강제형변환은 됬지만 자식타입인 BullDog에 부모인 Dog를 담으려고 했기에
        BullDog Bull = (BullDog)dog1; // dog1에는 BullDog의 주소값이 있었으므로 문제x

     // 3번 검증
//        ani3.jump(); //ani3에는 BullDog객체 주소값이 저장되어있지만
        // Animal은 jump 메소드를 모르기 때문에 호출 불가능

        //그래서 자바는 애초에 자식타입이 부모객체 주소값이 담기지 않도록 설정
        //   자식은 메소드가 부모보다 많아지는것이 가능(상속받기에) 강제로 저장시 런타임에러
        BullDog bull1 = (BullDog)ani3; // 같은타입이였으므로 강제형변환으로
        bull1.jump();
        ani3.crying();
        bull1.crying();

        //InstanceOf : 형변환 가능여부(true false)
        // 타입과 동일한 객체이거나 자식객체이면 가능
        // 왼쪽항이 객체주소값 오른쪽항이 타입

        System.out.println(ani3 instanceof BullDog);
        System.out.println(ani3 instanceof Dog);
        System.out.println(ani4 instanceof Bird);

    }
}

class Animal{
    void crying(){
        System.out.println("동물이 운다~");
    }
}

class Cat extends Animal{
    @Override
    void crying(){
        System.out.println("야옹~");
    }
}

class Dog extends Animal{
    @Override
    void crying(){
        System.out.println("왈왈");
    }
}

class BullDog extends Dog{
    @Override
    void crying(){
        System.out.println("멍멍");
    }
    void jump(){
        System.out.println("점프");
    }
}
class Bird extends Animal{
    @Override
    void crying(){
        System.out.println("짹쨱");
    }
}