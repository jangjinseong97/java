package com.green.day11.ch16;

//다형성
public class PolyStudy {
    /*
    다형성을 이해할 때 맴버필드도 이해해야되나 은닉화로 직접사용을 하지않아
    맴버메소드만 어떻게 동작하는지 이해하면 된다.
    1. 부모타입은 변수는 자식객체 주소값 저장 가능  a n = new c 라면 a와 c 는 상속관계 a가 부모 c가 자녀
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
        Animal ani1 = new Cat(); // Animal 타입에 Cat의 객체주소값 >> 실체 객체주소값이 중요한것(정보가 중요)
        Animal ani2 = new Dog(); // Animal 타입에 Dog의 객체주소값 >> 실체 객체주소값이 중요한것
        Animal ani3 = new BullDog();
        Animal ani4 = new Bird();
        Dog dog1 = new BullDog();
        Animal ani5 = dog1; // 주소값이 바뀌는것은 아님
        System.out.println("----끝----");

        // 2번 검증
//        BullDog bull = new Dog(); 컴파일 에러 발생
//        BullDog bull = (BullDog)ani2; // 런타임 에러발생
        // ani2에는 실제론 Dog가 들어가 있으므로 BullDog로 넣으려고 해도 안되는것

//        강제형변환은 됬지만 자식타입인 BullDog에 부모인 Dog를 담으려고 했기에
        BullDog Bull = (BullDog)dog1; // dog1에는 BullDog의 주소값이 있었으므로 문제x

     // 3번 검증
//        ani3.jump(); //ani3에는 BullDog객체 주소값이 저장되어있지만
        // Animal은 jump 메소드를 모르기 때문에 호출 불가능

        //그래서 자바는 애초에 자식타입이 부모객체 주소값이 담기지 않도록 설정
        //   자식은 메소드가 부모보다 많아지는것이 가능(상속받기에) 강제로 저장시 런타임에러
        // == 자식은 부모에가 상속받아서 무조건 부모와 같거나 더 많다(부분저긍로 상속을 안받는것이 불가능 무조건 전체를 받게됨)
        BullDog bull1 = (BullDog)ani3; // ani3에는 BullDog의 객체주소값이 저장되어 있었으므로 변환이 가능한것
        bull1.jump(); // Animal타입인 ani3 은 jump를 몰랐으니 ani3은 BullDog의 객체 주소가 있었으므로 형변환을 주어
        // BullDog로 타입을 바꾸고 나서 거기에 있는 jump를 사용하게 된것.
        ani3.crying();
        // jump와 다르게 되는것은 ani3는 부모티입인 Animal 자식객체인 BullDog에서
        // 처음 ani3을 보냈을때 타입쪽으로 보내어 crying이 있어야지 자식객체의 메소드로 가서 다시 확인하기 떄문
        // 위의 jump때는 부모 타입에서 jump가 없어서 확인하러 가지도 못한것
        bull1.crying();

        //InstanceOf : 형변환 가능여부(true false)
        // 타입과 동일한 객체이거나 자식객체이면 가능
        // 왼쪽항이 객체주소값 오른쪽항이 타입

        System.out.println(ani3 instanceof BullDog); // ani3에는 BullDog의 객체주소값이 있으므로 true
        System.out.println(ani3 instanceof Dog); // ani3에는 BullDog의 객체주소값이 있고 이게 Dog가 부모이므로 true
        System.out.println(ani4 instanceof Bird);
        System.out.println(ani4 instanceof Animal); // bird 주소값 / Animal타입

        System.out.println("--------------");
//        PolyStudy a = new PolyStudy();
        Cat cat2 = new Cat();
        Dog dog2 = new Dog();
        BullDog bull2 = new BullDog();
        Bird bird2 = new Bird();

//        a.animalCrying(cat2);
        animalCrying(dog2);
        animalCrying(bull2); // jump() 까지호출
        animalCrying(bird2);
    }
    static void animalCrying(Animal a){
        // 부모타입이라 객체주소를 다 받을 수 있던것 가장 윗쪽의 Animal ani1 = new Cat(); 를 보면 알 수 있는것.
        // 파라메터에 Animal을 사용했으므로 해당 메소드에서 Animal의 메소드를 사용 할 수 있었던것?
        a.crying();
        if(a instanceof BullDog) {
            BullDog b = (BullDog)a ;
            b.jump();
            // a.jump(); 만 해도 됬었다.
        }
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