package com.green.day02;

public class OverFlow {
    public static void main(String[] args) {
        // 저장공간을 넘는 데이터량을 저장하게 되면 오버플로우(양수로 벗어나면) 혹은 언더플로우(음수로 벗어나면)
        // 넘친 데이터만 남게됨

        // byte : -128 ~ 127 범위의 값만 저장가능
        byte var1 = 127;
        byte var2 = (byte)128; // = 128을 하면 오류가뜸 범위 밖이라?
        System.out.printf("var1 : %d\n var2 : %d\n", var1, var2);
        // var2 가 한바퀴 돌고 나오는 -128이 나오게됨
    }
}