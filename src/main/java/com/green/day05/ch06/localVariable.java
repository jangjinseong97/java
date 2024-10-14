package com.green.day05.ch06;

public class localVariable {
    static int aaa = 11;
    /*
     Scope(스코프) : 변수가 살아 있는 범위를 의미 여기를 벗어나면 해당변수는
     안에서 변수 지정을 했음에도 밖에서는 변수가 아니가 된다 { } 사이
     */
    public static void multiply(int n1){
        System.out.println(aaa);
        int num1 = 11;
    }
    public static void sum(int n1) {
        int num1 = 11;
        // 해당 num1은 위의 multiply와 아래의 main 메소드에 있지만 중괄호 { } 밖에 있으므로
        // sum 메소드 안에 따로 선언이 가능한것이다.
    }

    public static void main(String[] args) {
        boolean ste = true;
        int num1 = 11;
        System.out.println(num1);

        if (ste) {
            int num2 = 22;
            num1++;
            System.out.println(num1);
            System.out.println(num2);
        }
        // 중괄호 밖이므로 num2의 스코프는 사라진것 num1은 main 메소드 윗쪽에 선언해 두엇으므로
        // 남아있다. 또한 if문 안의 문구도 실행되어 저장
        // System.out.println(num2); 그러므로 해당 코드는 오류가 나옴
        System.out.println(num1);
        {
            int num3 = 33;
            num3++;
            System.out.println(num3);
        }
        // 위와같이 num3은 다른 중괄호 {} 안에 들어가 있으므로 그 중괄호를 나온시점에서 사라짐
        for(int i=0; i<10; i++){
        }
        // System.out.println(i); 똑같이 이번엔 i가 for문 중괄호 안에 지정되었지만
        // 그 밖에서 i를 찾았으므로 오류가 나옴

    }
}
