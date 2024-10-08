package com.green.day02.ch04;

public class PrintFormat {
    public static void main(String[] args) {
        // 문자열 사이에 변수의 값을 주입하고 싶을 때 자주 사용
        // %s 문자형식 String ""
        // %c 문자열 char ''
        // %b 불린
        String name = "홍길동";
        int age = 22;
        float height = 175.2f;
        // 리터럴 실수는 기본적으로 double 타입이라 f, F를 붙어야 float 타입이 된다.
        // 리터럴 실수 뒤 d, D를 붙여도 상관없다 (원래도 double 타입이므로)
        char bloodType = 'O';
        boolean gender = true;
        System.out.printf("%s의 나이는 %d살 키는 %fcm 혈액형은 %s형입니다.\n" +
                "그는 남자입니까? %b\n", name, age, height, bloodType, gender);
        System.out.printf("%.2f\n", height);
        System.out.printf("키는 %010.2f ㅣ\n", height);
        System.out.printf("키는 %10.2f ㅣ\n", height);
        System.out.printf("키는 %-10.2f ㅣ\n", height);
        // %f로 실수를 출력할때 %.nf로 하면 소숫점 n번까지 출력된다.
        // %0n.mf 는 소숫점 m번까지 소숫점포함 n칸을 사용하며 빈 자리는 0으로 출력
        // %n.mf 는 소숫점 m번까지 소숫점포함 n칸을 사용하며 빈 자리는 공백으로 출력 -는 뒤로 출력
        int won = 230000000;
        System.out.printf("won : %d원\n", won);
        System.out.printf("won : %12d원\n", won);
        System.out.printf("won : %-12d원\n", won);
        System.out.printf("won : %012d원\n", won);
        System.out.printf("won : %,d원\n", won); // 이러한 기능중 쓸만한 기능
        // 실수와 거의 같은형식이며 추가로 %,d를 사용시 3자리수 마다 ,을 찍어준다.
        String result = String.format("%,d",won);
        System.out.println("result" + result);
        // 위의 String.format 을 자주 쓰기때문에 미리 printf에 익숙해지기
    }
}
