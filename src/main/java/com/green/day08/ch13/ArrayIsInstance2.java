package com.green.day08.ch13;


public class ArrayIsInstance2 {
    public static void main(String[] args) {
        Box[] arr = new Box[5];
        System.out.println(arr.length);

        Box b1 = new Box("안녕");
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
    // 오버라이딩
    public String toString(){
        return conts;
    }

}
