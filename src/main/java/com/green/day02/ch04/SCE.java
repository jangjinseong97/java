package com.green.day02.ch04;

public class SCE {
    public static void main(String[] args) {
        int n1 = 0, n2 = 0;
        boolean result;
        result = ((n1 += 10) < 0 && (n2 += 10) > 0);
        System.out.printf("result는 %b 가 나오고 \n" +
                "n1은 %d, n2는 %d이(가) 된다\n", result, n1, n2);
        // n1 += 10에서 false 처리가 난 뒤로 실행이 끝났으므로 n2 += 10이 실행되지 않았기 때문
        // n1 += 10에서 false 처리가 난 뒤로 실행이 끝났으므로 n2 += 10이 실행되지 않았기 때문

        int n3 = 0, n4 = 0;
        result = ((n3 += 10) > 0) || ((n4 += 10) < 0);
        // 위와 동일한 이유로 n3 는 10 n4는 0이된다.
        System.out.printf("result: %b\n n3: %d\n n4: %d\n", result, n3, n4);
        int n5 = 0, n6 = 0;
        result = ((n5 += 10) > 0) | ((n6 += 10) < 0);
        System.out.println(result + "  " + n5 + "  " + n6);
        // | 과 & 도 되지만 이는 중간에 true나 false가 나와도 끝까지 실행을 한다.

    }
}
