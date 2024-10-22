package com.green.day07.ch11;

public class StringStudy {
    public static void main(String[] args) {
        String str1 = "Coffee";
        String str2 = "Bread";

        String str3 = str1.concat(str2);
        // str3 을 str1+str2(문자열) 하게 만듬
        System.out.println(str3);
        System.out.println("str3의 결과");

        String str4 = str1 + str2;
        // str4 을 str1+str2(문자열) 하게 만듬
        System.out.println(str4);
        System.out.println("str4의 결과");

        String str5 = str2.concat(str1);
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println(str5);

        System.out.println("----------------");
        String str6 = "abcdefghijklmn";
        System.out.println("str6.substring(3): "
                + str6.substring(5));
        //파일명에서 확장자 추출할 때 사용
        // 뒤에 적히는 숫자번 제외 이후부터 출력 6 7 ~을 출력

        System.out.println("str6.substring(4, 7): "
                + str6.substring(4, 7));

        //4, 5, 6자리의 문자열을 리턴

        String fileNm = "nice_v.ery.Nice.jpg";
        System.out.println(".의 위치값: " + fileNm.indexOf("."));
        //왼쪽에서 오른쪽 방향으로 가장 빨리 찾은 index값을 리턴
        // 6번쨰에 위치하여 6번이라고 반환

        System.out.println("마지막 .의 위치값: " + fileNm.lastIndexOf("."));
        // 16번째에 있지만 15번 이후에 있다는 뜻으로15가 반환되엇음


        System.out.println("---------------------------");

        String str7 = "LExi";
        String str8 = "Lexi";

        System.out.println(str7.equals(str8));
        System.out.println(str7.compareTo(str8));
        System.out.println(str8.compareTo(str7));
        // 왜 -32 32인지 모름 >> 아스키값 기준으로 첫번째 문자부터 비교하므로

        System.out.println(str7.compareTo("LExi"));
        //0이 나오면 같은 문자열이다.
        System.out.println(str7.equalsIgnoreCase(str8));
        //대소문자 구분없이 같은지 비교, 영어만 의미가 있음

        System.out.println("-----------------------------");

        int n = 10;
        String str9 = n + "";
        String str10 = String.valueOf(n); //모든 타입을 String으로 변경할 수 있다.

        System.out.println("------------------------------");
        String str11 = "abcdefgcd";
        String str11Result = str11.replace("cd", "CD");
        // 문자열 내 모든 cd를 CD로 교체함
        System.out.println("str11Result: " + str11Result);
    }
}
