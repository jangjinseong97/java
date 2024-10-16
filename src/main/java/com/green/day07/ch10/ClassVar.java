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
        // 두개 구분은 왜 해두거임?
        System.out.println("value: " + value);
        // 다른 변수로 넣엇음에도 이미 instcnt에 저장되어 있던 5가 6> 6이 7로 되어 출력되는 모습
        // 하지만 value는 1 그대로( InstCnt.instNum = 5;)으로 지정만 해줫기에
        // value 값도 바뀌는것을 보고 싶었다면 위에서 InstCnt.int = 숫자; 를해줫어야 됬다.

    }
}
