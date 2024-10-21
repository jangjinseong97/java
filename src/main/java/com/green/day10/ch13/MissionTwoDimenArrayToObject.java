package com.green.day10.ch13;

public class MissionTwoDimenArrayToObject {
    public static void main(String[] args) {
        student[] arr = new student[3];
        arr[0] = new student("영수", 100, 90, 80);
        arr[1] = new student("상철", 90, 90, 80);
        arr[2] = new student("광수", 80, 70, 60);

        student ys = arr[0];
        System.out.println(ys.getAllScore());

        for(student stu : arr){
            // 참조변수 여기서 stu는 arr[0] arr[1] ~를 참조하므로 참조변수인가?
            // arr[0] 은 new student를 참조하므로 맞을듯
//            System.out.printf("%s - 국어: %d, 영어: %d, 수학: %d\n",
//                    stu.getName(),stu.getKor(),stu.getEng(),stu.getMath());
            System.out.println(stu); //오버라이딩하여
        }
        printSI(arr);
        printKS(arr);
        pTS(arr);
        // ~~.이 앞에 없으므로 class 따로 선언을 안햇으므로 static,
    }
    public static void printSI(student[] students){
        for(student stu:students){
            System.out.println(stu);
        }
    }
    public static void printKS(student[] a){
        int sum1 = 0;
        for(student stu : a){
            // sum1 += stu.getkor(); 대소문자 확인좀해라..
            sum1 += stu.getKor();
        }
        System.out.println(sum1);

        int tk = 0;
        for(student stu : a){
            tk += stu.getKor();
        }
        float etk = tk/3;
        System.out.printf("국어 - 합계점수 %d, 평균점수 %.1f\n",tk,etk);

    }
    public static void  pTS(student[] a){
        int sum = 0;
        for (student stu :a){
            sum += stu.getAllScore();
        }
        float ss = (float)sum / (a.length * student.SC);
        System.out.printf("합계점수: %d, 평균점수: %.1f\n",sum,ss);
    }
}
class student {
    public static final int SC = 3;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public student(String name, int kor, int eng, int math) {

        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getAllScore(){
        return kor+eng+math;
    }
    @Override
    public String toString(){
        int totalScore = getAllScore();// 이걸 사용하는것이 더 좋다(아니면 쓸때마다 계산하게 되므로)
        return String.format("%s - 국어: %d, 영어: %d, 수학: %d | 합계점수: %d, 평균점수 %.1f",
//                name, kor, eng, math, getAllScore(), ((float)getAllScore()/3));
                // 위의 코드를 써도 되지만 관리를 위해서는 아래와 같은 코드가 좋음(수정에 용의)
                name, kor, eng, math, getAllScore(), ((float)getAllScore()/SC));
    }
}
