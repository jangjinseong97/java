package com.green.day07.ch10;

public class ClassVarAccess {
    public static void main(String[] args) {
        AccessWay aw = new AccessWay();
        // 객체인 aw로 인해 AccessWay(); 가 한번 실행되어 +1
        aw.increaseCnt();
        // 이후 직접적으로 불러내어 또 +1
        aw.num++;
        // num이 static으로 설정되었기에 클래스에 종속되있다(파일 내부의 어떤 코드에도 사용가능) +1
        AccessWay.num++;
        // 위와 동일한 이유 +1
        System.out.printf("num: %d\n", AccessWay.num);
        // 클래스명.static 변수 or 메소드, 이렇게 사용하는 것이 맞다.
        System.out.printf("num: %d\n", aw.num);
        //가능은 하나 static때문에 객체화를 하지 않기 때문에 쓸일이 없다.
    }
}

class AccessWay {
    static int num = 0;
    AccessWay() { increaseCnt(); }
    void increaseCnt() { num++; }
}