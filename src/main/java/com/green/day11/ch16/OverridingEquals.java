package com.green.day11.ch16;

import com.green.day07.ch10.StaticImport;

public class OverridingEquals {
    public static void main(String[] args) {
        NumBox n1 = new NumBox(10);
        NumBox n2 = new NumBox(10);

        System.out.println("n1: " + n1);
        // 아래 override로 인해 나오게 되는것
        // 해두지 않았을때 파일의 주소가 나오는것은 NumBox의 toString()으로 인해 나오게 되는것
        System.out.println("n2: " + n2);

        System.out.println("n1 == n2 " +(n1 == n2));
        // 주소값이 달라서 > n1으로 생성한 객체와 n2로 생성한 객체는 다른 객체이므로
        // 생성자를 2번 호출했는데 그때마다 객체가 만들어짐 > 같은곳에 만들어 질 수는 없으므로 두개는 달라지는것
        System.out.println("n1.equals(n2) " + (n1.equals(n2)));
        // 똑같이 상속받아서 NumBox의 변수지만 equals를 쓸수 있는것
    }
}

class NumBox {
    private int num;

    NumBox(int num){
        this.num=num;
    }
    @Override
    public String toString(){
        return String.valueOf(num);
        // 위로 알수 있는것 메소드 뒤에 ()가 들어갔기에, static(new 선언없이 만들었기에)
        // , 리턴타입(String), 파라미터(int)
    }
    @Override
    public boolean equals(Object object){
        return false;
    }
}
