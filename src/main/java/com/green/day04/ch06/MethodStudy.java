package com.green.day04.ch06;

public class MethodStudy {
    /*
    public와 static은 나중에 설명

    아래의 메소드를 main 메소드라고 부른다.
    메소드를 만드는 행위는 '메소드를 정의했다' 라고 표현한다.
    만든 메소드를 사용하는 행위를 '메소드를 호출했다' 라고 한다

    4가지 메소드 구성요소
    void : 리턴타입 : 메소드 호출된 후 결과값
    main : 메소드명 : 호출할 때 사용
    (String[] args) : 파라미터, 매개변수 : 메소드에 보내는 데이터
    {} : 구현부 : 메소드가 호출됬을 때 실행되는 부분

    리턴타입 + 메소드명 + 파라미터 = 선언부

    메소드는 크게 2종류
    - void : 리턴하는 값이 없다. (결과값이 없다.) 실행커서가 호출했던 곳으로 그대로 돌아옴
     호출할때 추가로 다른것을 사용 불가능
    - 비 void : 리턴하는 값이 있다.(결과값이 있다.) 실행커서가 호출했던 곳으로 값이 바껴서 돌아올 수있음
     호출할때 추가로 다른것을 사용
         */
    public static void main(String[] args) {
        sum(4,6);
        // 아래에서 정의한 메소드를 호출하는것
        // 또한 숫자를 하나만 넣으면 아래에서 정의한 파라미터가 2개이기에 갯수가 부족해 컴파일에러

        sum(24,13); // 높은 확률로 void

        //개별적으로 작동
        MethodStudy.sum(2,3);
        // 정확하게 호출하는 방법 위의 두 호출은 같은파일에 있기 때문 다른파일이면 위와 같이 써야됨

        retrunSum(5,7);
        // 비 void에 보낸것이므로 값을 리턴받아 저장함
        int result = retrunSum(5,7);
        System.out.println(result);
        System.out.println(retrunSum(4,8)); // 해당식은 리턴을 받아 값이 나옴 (비 void)
        //System.out.println(sum(24,13)); 해당식은 리턴을 받지 않는것이라 컴파일에러 (void)
    }
    // void 메소드
    // sum 이라는 이름의 static 메소드를 정의(파라미터 2개 >> in1 n1, int n2)
    // n1 n2에 들어가는 데이터가 항상 변할 수 있으므로 매개 변수라고 부른다.
    static void sum(int n1, int n2){
        // 작성시 변수마다 타입을 다 적어줘야된다.
        System.out.printf("%d + %d = %d\n", n1, n2, (n1 + n2));
    }
    // 비 void 메소드 ( void 자리에 다른 레퍼런스 타입(int String 기타등등)이 들어간것)
    // 이때 return 이 필수로 들어가야된다.
    static int retrunSum(int n1, int n2){
        return n1 + n2;
    }
    // 항상 메소드의 위치는 class 아랫구간에 있어야 된다. 그외의 위치는 상관 없다
    // (메인메소드보다 위에 있거나 앞에 있어도 class 다음 구간인 이상 지장은 없다)
}
