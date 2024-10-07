package com.green.day01.ch02;

public class StudyVarialbeNaming {
    public static void main(String[] args) {

        // 변수 명명규칙
        // 1. 대소문자 구분, 길이 제한 없음
        int abc, abC ; // 둘은 대소문자 구분으로 인해 다른 변수

        // 2. 예약어(이미 파랑색으로 나오는 문자들) 사용 불가능
//        int short ; //오류 발생

        // 3. 숫자로 시작 불가능
//        int 1abc ; //오류 발생

        // 4. 특수기호는 달러( $ ), 언더바( _ ) 만 가능
        int $12, _13;
//        int c*d ; //오류 발생

        // 5. Camel Case 기법을 사용
        int myNameIsHong;
    }
}
