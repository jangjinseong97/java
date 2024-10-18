package com.green.day08.ch13;


public class ArrayIsInstance2 {
    public static void main(String[] args) {
        Box[] arr = new Box[5];
        // 5개의 타입을 선언하는것이므로 여기선 객체타입인 Box인것
        // Box 계열 객체주소값
        System.out.println(arr.length);

        Box b1 = new Box("안녕");
        // Box 객체주소값
        System.out.println(b1);
        System.out.println(b1.toString());

        arr[0] = b1;
        arr[1] = new Box("하세요");
        arr[2] = new Box("반갑습니다");
        // arr[3] = new String("ddd"); 에러가 나옴 가장위에 box로 지정해서?

        System.out.println("-----------");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

class Box{
    private String conts;

    Box(String conts){
        this.conts = conts;
    }
    // 생성자는 클래스명과 같아야됨 + 리턴타입이 없어야됨 이때 어디서 쓰이는가?
    // 여기선 기본생성자가 없다

    // 오버라이딩
    public String toString(){
        return conts;
    }

}
