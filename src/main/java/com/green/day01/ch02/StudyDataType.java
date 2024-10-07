package com.green.day01.ch02;

public class StudyDataType {
    public static void main(String[] args) {
        /*
           자료형 : 정수형, 실수형, 불린형, 문자형 이들을 primitive type (기본 타입)

           작성시 시작이 소문자로 시작

           정수형 : byte(1), short(2), int(4), long(8)
           실수형 : float(4), double(8)
           불린형 : boolean(1)
           문자형 : char(2)
           위의 8개의 기본 타입을 제외한 타입은 reference type (참조 타입)이다.
           타입명 옆의 숫자는 크기(바이트 byte)를 의미
           4바이트일때가 계산이 가장빨라 주로 쓰고 크기가 커서 들어가지 않으면 long이나 double을 사용

           string은 문자형이 아닌 문자열이다.
         */
        byte var1 = 127;
        short var2 = var1; //자동으로 형변환을 해준다 반대로는 강제로 해줘야된다
        int var3 = var1 + var2;
        long var4 = var3 + var3;
//        int var5 = var4; 반대 방향이라 오류가 나옴
        int var5 = (int)var4; // 강제로 해주니 오류가 안나오는 모습
        float var6 = var4; // float는 4바이트지만 실제로는 더 큰 공간 취급이라 long이 자동 형변환된다.

    }
}
