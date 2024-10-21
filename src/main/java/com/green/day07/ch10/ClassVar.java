package com.green.day07.ch10;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt.instNum = 10;
        InstCnt ic1 = new InstCnt();
        InstCnt.instNum = 5;
        InstCnt ic2 = new InstCnt();
        InstCnt ic3 = new InstCnt();
    }
}

class InstCnt {
    static int instNum;
    int value;
    InstCnt() {
        instNum++;
        value++;
        System.out.println("인스턴스 생성: " + InstCnt.instNum);
        System.out.println("인스턴스 생성: " + instNum);
        // 두개 구분은 왜 해두거임?? 같은 클래스 안이라서 InstCnt. 를붙여도 안붙여도 상관없는걸 보여주기 위해 인듯

        System.out.println("value: " + value);
        // 다른 변수로 넣엇음에도 이미 instcnt에 저장되어 있던 5가 6> 6이 7로 되어 출력되는 모습 static에 의해
        // 하지만 value는 1 그대로(static을 instNum;에만 지정을 해줬기 때문)
        // static int value;를 넣으면 value의 값을 해당 어디서든지 공유하기 때문
        // 위의 InstCnt.instNum 과 같이 InstCnt.value 로 값을 클래스 밖에서도 지정하는것이 가능

    }
}
