package com.green.day06.ch07;

// 일반 변수 primitive type
// 참조 변수 reference type 의 차이점을 설명하는 예제

public class PrimitiveVsReferenceTest {
    public static void main(String[] args) {
        int num = 10;
        changeNum(num);
        System.out.println("num: " + num);
        // 해당은 아래의 int changeNum에 넣엇지만 10이 나오는것
        NumberBox nb = new NumberBox();
        nb.num = 10;
        // nb 를 가장 아래의 NumberBox로 보내었기에 num을 int라는 변수로 지정된것 이를 nb에 주소값 저장
        changeNum(nb);
        System.out.println("nb.num: " + num);
        int n =1;
        changeNum(n);
    }
    /*
    main메소드에 있는 nb(main의 nb)와 changeNum메소드에 있는 nb(m-nb라고 부르겠음)는
    다른 공간이다. 다만 같은 값(주소값)을 가지고 있다(같은 NumberBox()로 지정을 해주었기 떄문)
     그로인해 같은 객체에 접근할 수 있다.
    m-nb를 통해 객체의 num값을 변경을 했다면 main-nb를 통해 접근했을 때 변경된 값을 얻게 된다.
    */
    public static void changeNum(NumberBox nb){
        nb = new NumberBox();
        System.out.println("어케됨");
        nb.num = 100;
        // 가장 아래의 NumberBox 의 변수를 끌고오는것 위에서는 그것을 nb에 저장 했기에
        // nb만이 여기로 보낼수 있는 포탈이 되는것(nb가 int 가 됬음에도 불구하고)

    }
    /*
   main메소드에 있는 num변수(main-num)와 changeNum메소드에 있는 num매개변수 (m-num)는
   다른 공간이다. main-num이 가지고 있는 값을 복사하여 m-num에 저장했다.
   m-num값을 변경한다고 하여 main-num값이 변경되는 것은 아니다. 왜? 다른 공간이기 때문
   */
    public static void changeNum(int num){
        num = 100;
        System.out.println(num);
    }
    // 해당 num = 100;은 단순 여기 안에서만 100인것이지 main에 영향을 주지 못함

}

class NumberBox {
    int num;
}
