package com.green.day16.ch23;

import java.util.*; // import java.util.*; 왜 이런식으로?

public class HashMapCollection {
    public static void main(String[] args) {
        Map<String ,String> map = new HashMap<>(); // Map 는 interface 클래스
        map.put("홍길동","시계");
        map.put("권혜지","자바책");
        map.put("이정민","빈 캔");
        map.put("홍길동","두번째 시계"); // 있던 key값에 또 넣으면 기존에 있던 값이 사라짐
        // 앞에 넣은 값으로 뒤의 값을 반환
        // 앞을 key 뒤를 value
        System.out.println(map.get("홍길동"));
        System.out.println(map.get("abc")); // 없는 값이면 null
        System.out.println(map.keySet()); // key 값만 출력
    }
}
