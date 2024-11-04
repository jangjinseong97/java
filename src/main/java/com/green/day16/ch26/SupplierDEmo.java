package com.green.day16.ch26;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

// Supplier는 파라미터 없이 리턴만 있음
public class SupplierDEmo {
    public static void main(String[] args) {
        Supplier<Integer> supRandom = () -> (int)(Math.random() *50.0);
//        Supplier<Integer> supRandom = () -> {return (int)(Math.random() *50.0);};
        // 중괄호를 생략해서 return도 생략됬던것
        System.out.println(supRandom.get());

        List<Integer> list = makeIntList(supRandom, 5);
        System.out.println(list);
        // 랜덤 정수값 0~49 중 5개를 가지고 있는 arraylist를 리턴
        Supplier<Integer> supRandom2 = () -> (int)(Math.random()*31)+20;
        List<Integer> list2 = makeIntList(supRandom2,8);
        System.out.println(list2);
    }
    public static List<Integer> makeIntList(Supplier<Integer> a, int b){
        ArrayList<Integer> k = new ArrayList<>(b);
        // 대충 몇개 나올지 알면 근사치를 주면 성능(처리속도가)이 더 좋아짐
//        ArrayList<Integer> k = new ArrayList<>();
        for(int i=0;i<b;i++){
//            int n=a.get();
//            k.add(n);
            k.add(a.get()); // 항상 변수 선언을 외부에서 하는편 안에서 할수있으면 안에서 하자
        }
        return k;
    }
}
