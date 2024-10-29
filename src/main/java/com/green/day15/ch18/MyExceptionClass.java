package com.green.day15.ch18;

import java.util.Scanner;

public class MyExceptionClass {
    public static void main(String[] args) {
        System.out.print("나이 입력: ");
        try {
            int age = readAge();
            System.out.printf("입력된 나이: %d\n", age);
        } catch (ReadAgeException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("---ㄲㅌ---");
    }
    public static int readAge() throws ReadAgeException{
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt();
        if(age < 0){
            scan.close();
            throw new ReadAgeException(); // throw를 만나면 메소드가 종료됨(해당되는곳으로 던지고 나서)
        }
        System.out.println(">> if 문 이후");
        scan.close();
        return age;
    }
}

class ReadAgeException extends Exception{
    ReadAgeException(){
        super("유효하지 않은 나이가 입력되었습니다.");
        // Exception 의 생성자 호출
    }
}
