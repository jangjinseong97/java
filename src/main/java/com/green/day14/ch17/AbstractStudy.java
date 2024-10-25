package com.green.day14.ch17;

public abstract class AbstractStudy {
    /*
    p.380

    class 키워드 앞에 abstract 키워드를 붙이면 추상클래스가 된다.
    추상클래스가 되면 객체화가 불가능 >> 부모역할만 한다.
    그래서 추상클래스를 상속받는 클래스가 있기 마련이다.

    class 앞에 abstract를 붙이는것은 선택이나 만약 추상 메소드를 가지게 된다면 선택이 아닌 필수가 된다.

    클래스간 공통적인 부분을 부모에 작성하고 상속받도록 하기 위해
    그리고 추상 메소드를 구현해야하는 강제성이 존재한다. > 자식에 무조건 오버라이딩 해줘야됨
    추상 메소드 구현: implements, 구현한다 라고 표현한다. (구현부를 만드는 행위)
     */

    //추상 메소드 정의(선언부만 있고 구현부가 없는 메소드를 추상 메소드라고 한다. 그리고 abstract 를 붙어야 한다.)
    public abstract void sum();
    // 이상태에서 위의 class 에 abstract 를 빼면 컴파일에러

    // 추상클래스도 구현부가 있는 메소드는 가질 수 있다.
    public void multiply(int n1, int n2){
        System.out.println(n1 * n2);
    }
}

class ImplementsStudy extends AbstractStudy{

    // 부모의 추상메소드를 무조건 구현해줘야 된다. 아님 컴파일에러
    @Override
    public void sum(){
        System.out.println(11);
    }
}

class AbstractStudyTEst {
    public static void main(String[] args) {
//        AbstractStudy as = new AbstractStudy() // abstract 로 인해 객체화가 안되는 모습
        AbstractStudy as = new ImplementsStudy(); // 하지만 타입 지정으로는 사용가능
        as.sum(); // 다형성을 사용하기 위해 타입지정으론 되는듯
    }
}
abstract class ImplementsStudy2 extends AbstractStudy{
    // 추상클래스를 받았음에도 자신도 추상클래스가 되어 미뤄줌
}