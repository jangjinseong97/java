package com.green.day05.ch06;

public class InfRecul {
    public static void main(String[] args) {
        showHi(3);
    }
    public static void showHi(int cnt) {
        System.out.println("Hi ~~ ");
        if(cnt == 1){
            return;
        }
        showHi(cnt -1);
        // showHi(cnt--); 는 cnt에서 이미 반환이 된 이후 --를 해주는것이라 무한 루프가 되어버림
        // showHi(--cnt); 는 --한뒤 cnt를 반환하므로 cnt가 하나씩 줄어듬
        // ++도 마찬가지이므로 이런식으로 다른곳에서 끌어올시 ++ --는 앞에 붙여줘야됨.
    }
}
