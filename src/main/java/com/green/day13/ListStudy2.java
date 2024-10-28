package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy2 {
    public static void main(String[] args) {
        //Generic 제네릭
        // 사용하면 실행시 타입 결정
        // 사용하지 않으면 타입은 자동으로 Object 타입

        List<Integer> list = new ArrayList(); // 들어갈 수 있는 타입을 제한해줌
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<Integer>(); // 3개다 결과는 같음.
//        list.add(""); 위에서 Integer(정수) 로 타입을 결정(제한)했기 때문
        // 따라서 위의 list 는 정수만 들어갈 수 있는 ArrayList 객체가 된것
        list.add(10);
        list.add(20);
        list.add(30);

        int n1 = list.get(0); // ArrayList의 타입을 정수로 결정했기 떄문에 형변환 하지 않아도 되는것

        list.add(1,60); // 1번방자리에 60을 넣고 뒤의 나머지 숫자를을 뒤로 미루는것
        System.out.println(list);

        list.remove(2); // 해당 방, 그 방의 값 삭제
        System.out.println(list);
        System.out.println(list.size()); // 배열처럼 생겼지만 배열이 아니라서 length 사용불가능??
        list.add(0,30);
        System.out.println("---");
        System.out.println(list);
        System.out.println(list.lastIndexOf(30)); // 가장 먼저 나오는 같은값의 위치(오른쪽)
        System.out.println("---");
        System.out.println(list.indexOf(30)); // 가장 먼저 나오는 같은 값의 위치(왼쪽)
        System.out.println(list.indexOf(100)); // 없는값이면 -1

        list.clear(); // 방, 값 비우기
        System.out.println(list);
        System.out.println(list.size());
        //LinkedList도 동일함
    }
}
