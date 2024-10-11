package com.green.day04.ch06;

public class MethodGugudan {
    public static void main(String[] args) {
        gugudan(4);

        System.out.println("----------");
        gugudan(6);
        System.out.println("----------");

        gugudanFormTo(5,9); // 5~9단
        System.out.println("----------");
        gugudanFormTo(2,4);
        System.out.println("----------");
        gugudanFormTo2(2,4);
        System.out.println("--------");
        gugudamFormT3(3,7);
    }
    static void gugudan(int n){
        for(int i=1;i<10; i++) {
            System.out.printf("%d x %d = %d\t", n, i, (n * i));
        }
        System.out.println();
        // 내가 내주고 싶은 표시가 다를수 있으므로 여기보단
        // 저기위 gugudan 4와 6 사이에 넣어서 띄어쓰기를 해주는것이 좋다.
    }
    static void gugudanFormTo(int n1, int n2){
        for(int i=1;i<10;i++){
            for(int k=n1;k<=n2;k++){
                System.out.printf("%d x %d = %d\t", k, i, (k*i));
            }
            System.out.println();
        }
    }
    static void gugudanFormTo2(int n1, int n2){
        for(int i=n1;i<=n2;i++){
            for(int k=1;k<10;k++){
                System.out.printf("%d x %d = %d\t", i, k, (k*i));
            }
            System.out.println();
        }
    }

    static void gugudamFormT3(int n1, int n2){
        for(int d=n1; d<=n2;d++){
            gugudan(d);
        }
    }
    // 가장 좋은 예시가 위의 예시이다
}