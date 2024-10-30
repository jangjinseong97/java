package com.green.day16.ch26;

import java.util.SortedMap;
import java.util.function.Predicate;

// p.674
/* predicate : 서술어, 슬부
    predicate 함수형 인터페이스, 인자가 하나(파라미터 하나), 타입은 제네릭 리턴 boolean
 */
public class PredicateDemo {
    public static void main(String[] args) {
        Predicate<Integer> preMore10 = n -> n > 10;
        System.out.println(preMore10.test(9));
        System.out.println(preMore10.test(10));
        System.out.println(preMore10.test(11));

        //남자,남,여자,여 이러한 값들만 true 나머지 false
        Predicate<String> preCheckGender = s ->"남".equals(s) || "남자".equals(s)
                || "여".equals(s) || "여자".equals(s);

        boolean result = switch ("남자"){
            case "남","남자","여","여자" ->true;
            default -> false;
        };

        Predicate<String> preCheckGender2 = s -> switch (s)
        {case "남","남자","여","여자" -> true; default -> false;};
        // 여기의 중괄호는 스위치문의 중괄호인것

        String gender = "자";
        if(preCheckGender.test(gender)){
            System.out.println(gender);
            System.out.println("성별을 입력");
        } else {
            System.out.println("성별을 확인");
        }
        examPredicate(preMore10, 9);
        examPredicate( n -> n > 10, 9);
    }

    public static void examPredicate(Predicate<Integer> p , int n){
        System.out.println(p.test(n));
    }
}

