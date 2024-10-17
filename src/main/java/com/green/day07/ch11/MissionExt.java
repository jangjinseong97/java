package com.green.day07.ch11;

public class MissionExt {
    public static void main(String[] args) {
        //점의 위치값으로 리터럴 사용 금지
        //fileNm에서 jpg문자열 만 뽑아내주세요.
        String fileNm = "nice_v.ery.Nice.jpg";

        //String ext = ???;
        int idx = fileNm.lastIndexOf(".") + 1;
        // lastIndexOf이므로 가장 마지막 점 기준 1칸 앞의 정수를 주므로
        System.out.println(idx);
        String ext = fileNm.substring(idx);
        // 위에서 구한 숫자로 그다음부터 출력을 이용해서

        String ext2 = fileNm.substring(fileNm.lastIndexOf(".") + 1);
        // 위의 2가지 공정을 한번에 해버린것

        System.out.println(ext); //jpg
        System.out.println(ext2);

    }
}
