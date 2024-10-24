package com.green.day13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListStudy {
    /*
    List = 인터페이스 >> 객체화가 불가능하다.
    인터페이스는 부모역할만 한다. >> List 상속받은
    class( LinkedList, ArrayList )가 있다.
    이 두 class는 결과는 같지만 처리 방법이 다르다.
    LinkedList는 Node방식으로 데이터를 다루고  >> 수정 위주의 작업이 많으면 유리
    ArrayList는 Array(배열)방식으로 데이터를 다룬다. >> 읽기 위주의 작업이 많으면 유리

    List 변수명 = new ArrayList();
    List 변수명 = new LinkedList();
    이렇게 작성이 가능
     */
    public static void main(String[] args) {
        List list = new ArrayList(); // 작성후 알트엔터를 누르면 import들이 자동으로
        list.add(10); // 0번방에 들어감
        list.add(20); // 1번방에 들어감

//        ArrayList list2 = list; List타입인 ArrayList 주소를 가진 list를 ArrayList 타입에넣으려고 시도했으므로 안됨
        ArrayList list2 = (ArrayList)list; // 그래서 형변환을 해줘야 되는것
        list2.add(30); // >> 주소값만 받은것이므로 같이 적용 ( new 선언 없이 shallow copy)
        list2.add("하하"); // 다른타입인데 값이 들어감

        Object[] arr2 = new Object[4];
        arr2[0] = 10;
        arr2[1] = "하하"; // 오브젝트 타입은 모든타입들이 들어감 >> List 또한 오브젝트 타입인 것
        // 이러한 이유로 다른타입이 들어가게 된것.
        System.out.println(list);
        System.out.println("---------");
//        int val0 = list.get(0); Object 타입이라 오류가 나오는 것
        int val0 = (int)list.get(0);
        String word1 = (String)list.get(3); // 따라서 형변환을 해서 받아야 됨
        String word2 = (String)list2.get(3);

        System.out.println(val0); // toString이 이미 오버라이딩 되어 있어서 주소값이 안찍히는것
        System.out.println(word1);
        System.out.println(word2);

    }
}
