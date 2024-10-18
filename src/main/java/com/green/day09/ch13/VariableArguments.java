package com.green.day09.ch13;

import java.util.Arrays;

public class VariableArguments {
    // 가변 인수 (가변 인자)
    public static void main(String[] args) {
        sum(1,2);

        sum(10, 22, 43);

        sumVar(1);
        sumVar(1,2);
        sumVar(1,2,3);
        sumVar(1,3,4,5,2,6,7,100); // 각 ,사이의 값마다 배열로 전환되어 들어감 이게 values로 들어가는것
        // 즉 이걸로 [1,3,4,5,2,6,7,100] 가 생성되는것
    }

    // 아래 메소드에는 가변인자로 인해 몇개라도 숫자가 들어간다.
    static void sumVar(int... values){
        int i=0, sum=0;
        for(i=0;i< values.length ;i++){
        // 위에서 작성된 values를 이용하여 길이(크기) 확인 가능
            sum+= values[i];
            // 해당 순서의 배열값을 더하는것이므로
        }
        System.out.println(sum);
    }

    static void sum(int n1, int n2){
        System.out.println(n1 + n2);
        // 아래처럼 오버로딩을 했다면
        // sum(n1, n2, 0); 으로 해두는게 좋은 방법
    }

    static void sum(int n1, int n2, int n3){
        System.out.println(n1 + n2 + n3);
    }
}
