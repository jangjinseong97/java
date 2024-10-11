package com.green.day04.ch05;

public class MissionForInFor5 {
    public static void main(String[] args) {
        int star = (int)(Math.random()*6.0)+3;
        int k = star;
        for(int i=0;i<star; i++){
            for(int n=k;n>1;n--){
                System.out.printf("_");
            }
            k--;
            for(int a=0;a<=i;a++){
                System.out.printf("*");
            }
            System.out.println();
        }
        int z;
        int c;
        for(z=0;z<star;z++){
            for(c=star-1;c>z;c--){
                System.out.printf("_");
            }
            for(c=0;c<=z;c++){
                System.out.printf("*");
            }
            System.out.println();
        }
        for(int s=star; s>0;s--){
            for(int d=1; d<=star; d++){
                System.out.print(d < s ? "_" : "*");
            }
            System.out.println();
        }
        // for문 두개로 하는법

        // 비교식의에 첫 for문의 변수를 사용

        /*

        for(int i=0;i<star; i++){
            for(int n=i;n<star-1;n++){
                System.out.printf("_");
            }
            for(int a=0;a<=i;a++){
                System.out.printf("*");
            }
            System.out.println();
        }

         */
        /*
        System.out.println(star);
        for(int i=0;i<star; i++){
            for(int a=1;a<star;a++){
            // for(int a=star;a>0;a--)
            //    if(a > i) > _가 찍히도록
            //     else  >> *이 찍히도록
            여기서 위의 for문과 아래의 for문 둘다 증가하는 식이라 if문 비교가 힘들었던것
            위나 아래가 반대로 감소식이 였다면 if문에 들어갈 조건이 나왔을 것
                // i가 0일때 2개_ a 012 star 3
                //  가 1일떄 1개_ a 012 star 3
                //  가 2일때 0개_ a 012 star 3
                // i는 항상 star보다 작음

                if(){
                    System.out.printf("*");
                } else {
                    System.out.printf("_");
                }
            }
            System.out.println();
        }
        System.out.println(star);
         */
    }
}
