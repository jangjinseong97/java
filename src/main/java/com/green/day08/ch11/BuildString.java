package com.green.day08.ch11;

//p.264 ~ 269
public class BuildString {
    // 문자열 수정할때 String에 직접적으로 수정을 가하면 메모리를 많이 먹어서 사용하는것
    public static void main(String[] args) {
        //문자열 "123"이 저장된 인스턴스 생성
        StringBuilder sb = new StringBuilder("123");
        // 기본 생성자가 있어서 ()에 빈칸으로 해놔도 된다.

        sb.append(45678);
        System.out.println(sb);

        System.out.println(sb.toString());
        // 위처럼 자동으로 오버라이딩이 되어 있어 뒤가 생략된 상태로 출력되는것

        // 앞에 추가? 기존에 붙는것은 맞음

        sb.delete(0, 2);
        System.out.println(sb);
        // 0~2이지만 12 2개만 삭제됨 왜?
        // 0번(가장첫 인덱스번호가 0부터 시작)에서 끝번-1까지를 지우는것

        // 상기 문자열을 인덱스


        //미니 미션
        //모든 문자열을 지우는 방법 (치사하게 하지 말고)
        sb.delete(0, sb.length());
        //System.out.println(sb.lastIndexOf(""));
        //sb.delete(0, sb.lastIndexOf("")); //되기는 하나 length()메소드보다 불리하다.
        System.out.println("sb: " + sb);

        sb.append(345678);
        System.out.println("sb: " + sb);

        sb.replace(0, 3, "AB");
        // 문자열 지정이 아닌 순번지정으로도 가능
        // 0 1 2번자리를 AB로 교체
        String str = sb.toString(); //StringBuilder에서 String타입으로 변경 가능하다.

        System.out.println("sb: " + sb);
        System.out.println("str: " + str);

        StringBuilder sb2 = sb.reverse().replace(0, 2, "KK");
        // 기존 문자열의 순서를 뒤집고 거기에서 kk로 바꾼것
        System.out.println("sb.reverse().replace: " + sb);
        // 아래의 두번을 사용하는대신 한번에 하는것
        // 이를 체이닝 기법, 각각 메소드에서 return this; 를 함

        sb.reverse();
        // 기존문자열 뒤집기
        System.out.println("sb.reverse(): " + sb);

        sb.replace(0, 2, "KK");

        System.out.println("sb: " + sb);
        System.out.println("sb == sb2: " + (sb == sb2));

        StringBuilder sb3 = new StringBuilder("123");
        sb3.append(45678).delete(0,2).replace(0,3,"KK");
        // 체이닝 기법의 예시 .을 이용해 계속작성해나감
        // 123 >> 12345678 >> 345678>> kk678


    }
}