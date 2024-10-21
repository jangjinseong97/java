package com.green.day10.ch14;

public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man1 = new BusinessMan("YOON","Hybrid ELD","Staff Eng");
        System.out.println(man1.getName()); // 맴버필드(BussinessMan class)에 저장이 되었나 확인용
        man1.tellYourSelf(); // BusinessMan 에는 없는 메소드임에도 호출이 되는 모습
        // 이는 Man class에서 BusinessMan이 상속(extends)받았기 때문
        System.out.println(man1.toString()); // 이 toString도 위와 같은 이유로 Object에서 상속받아 호출되는 것
        man1.jump();
        System.out.println("---");
        man1.whatIsDoing();

        //man1.super.jump(); 외부에서 this, super 사용 불가능(상속관계 내부에서만 가능)
    }
}

// extends 를 생략시 extends Object 가 자동으로 들어간다. 즉 모든 클래스의 최상위 부모는 Object
class Man{
    private String name;

    public Man(){

    }
    // 1 해결방법
    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void tellYourSelf(){
        System.out.printf("제 이름은 %s입니다.\n",name);
    }
    public void jump(){
        System.out.printf("%s가 점프!\n", name);
    }
}


// extends(확장) 상속(아래의 경우 class Man 내부의 정보들을 사용 할 수 있게 된다.)
class BusinessMan extends Man {
    private String company;
    private String position;

    public BusinessMan(String name, String company, String position){
        //super("");
        // 2 해결방법

        super(name); // 이때 이 super는 스코프 내 가장 윗쪽에 위치해야 된다.

        // super(); 작성하지 않아도 자동으로 들어가 있음 하지만 여기서 그냥 쓰면 컴파일 에러
        // 해결방법은
        // 1. 부모에 해당되는 Man에 기본생성자 생성
        // 2. 부모에 있는 생성자와 타입을 맞춰줌
        this.company=company;
        this.position=position;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }
    // 오버라이딩 한것 부모가 가진 메소드를 사용 하는것이 아니라 내가 재정의한 메소드를 사용하게 하는 기법
    public void jump(){
        System.out.printf("%s에 다니는 %s가 점프!\n", company,getName());
        // 여기서 name은 private였기에 상속받았음에도 바로 접근이 불가능
        // 그래서 public으로 상속받은 getName의 값을 얻는것
        // 이때 getName() 앞에 this. super. 둘다 붙여도 상관x (어쳐피 생략된것)
    }

    public void whatIsDoing(){
        super.jump(); // 부모가 가지고 있는 메소드를 호출하고 싶을떄 super. 사용
    }
}