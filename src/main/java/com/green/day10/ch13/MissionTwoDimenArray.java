package com.green.day10.ch13;

public class MissionTwoDimenArray {
    public static void main(String[] args) {
        int[][] score = {
                //국어, 영어, 수학
                {100, 90, 80}, // 영수
                {90, 90, 80}, // 상철
                {80, 70, 60} // 광수
        };
        /*
        영수: 합계점수, 평균점수
        상철: 합계점수, 평균점수
        광수: 합계점수, 평균점수
        국어: 합계점수, 평균점수
        영어: 합계점수, 평균점수
        수학: 합계점수, 평균점수
         */
        for(int i=0;i<score.length;i++){
            int sum = 0;
            for(int n=0; n<score[0].length;n++){
                sum += score[n][i];
            }
            switch(i){
                case 0:
                    System.out.printf("국어: %d , %.1f\n",sum, (float)sum/3);
                    break;
                case 1:
                    System.out.printf("영어: %d , %d\n",sum, sum/3);
                    break;
                case 2:
                    System.out.printf("수학: %d , %d\n",sum, sum/3);
                    break;
            }
        }

        for(int i=0;i< score.length;i++){
            int sum = 0;
            for(int n=0; n<score[0].length;n++){
                sum +=score[i][n];
            }
            switch(i){
                case 0:
                    System.out.printf("영수: %d , %d\n",sum, sum/3);
                    break;
                case 1:
                    System.out.printf("상철: %d , %d\n",sum, sum/3);
                    break;
                case 2:
                    System.out.printf("광수: %d , %d\n",sum, sum/3);
                    break;
            }
        }
        int sum1 = 0, a=0;
        for(int k=0;k<score.length;k++){
            for(int n=0; n<score[0].length;n++){
                sum1 += score[n][k];
                a++;
            }
        }
        System.out.printf("%d, %.1f",sum1,((double)sum1/a));

        String[] names = {"a", "b", "c"};
        int[] ns = new int[names.length];
        String[] sbsr = {"국", "영", "수"};
        int[] ss = new int[sbsr.length];

        for(int i=0;i<score.length;i++){
            for(int n=0; n<score[0].length;n++){
                ns[i] += score[i][n]; // ns 의 0,1,2번에 score [0][0 1 2를 각각] 하지만 여기서 i는 고정되어 있어
                // 이 for문에 진입시 a의 값을 다 더해줌
                ss[n] += score[i][n]; // ss의 0,1,2번에 score [0][0 1 2를 각각] 여기서는 저장되는 자리인
                // n이 변동되어  국 영 수 가 바뀌면서 저장됨 즉 밖의 for문이 돌면서 합쳐지는것
            }
        }
        // 이후 for문으로 위에서 저장된 점수를 찍어주면됨
        // 절차지향적으로 해결한것
    }
}
