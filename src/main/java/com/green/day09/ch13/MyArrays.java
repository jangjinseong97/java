package com.green.day09.ch13;

public class MyArrays {

    // arr를 들고와서 이를 for문에 집어넣고 반환
     static String toString(int[] arr){
//        for(int i=0;i<arr.length;i++){
//            System.out.printf("%d", arr[i]);
//            System.out.printf(", ");
//            if(i == (arr.length-1)){
//                break;
//            }
//            System.out.printf("]");
//        } // 해당 방법은 출력을 하는것이므로 void가 아닌 여기선 쓰기 어려운듯?
         StringBuilder sb = new StringBuilder("[");
         for(int i=0;i<arr.length;i++){
             sb.append(arr[i]);
             if (i==(arr.length-1)){
                 break;
             }
             sb.append(", ");
         }
         return sb.append("]").toString();
         // 여기서 .toString이 들어가야 되는 이유는?
         // sb.append 자체만은 문자열이 아닌 StringBuilder이므로
         // toString()을 씀으로 문자열로 만들어서 반환(처음에 String이였으므로)
         // 인듯?
    }
    public static String toString2(int[] arr){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            if (i != 0) {
                sb.append(", ");
            }
            // 이 if문으로 -1를 하는방법을 뺀것
            sb.append(arr[i]);
        }
        return "[" + sb + "]";
    }
    // for문 내부의 if문조차 사라지게 할 수 있다. for문마다 실행되므로 이를 제거
    public static String toString3(int[] arr){
         if(arr.length==0){
             return "[]";
         }
         StringBuilder sb = new StringBuilder("[");
         sb.append(arr[0]);
         for(int i=1;i<arr.length;i++){
            sb.append(", ");
            sb.append(arr[i]);
         }
         return sb + "]";
    }
    public static String toString4(int[] arr){
        StringBuilder sb = new StringBuilder("[");
        for(int i=0;i<arr.length;i++){
            sb.append(", ");
            sb.append(arr[i]);
        }
        sb.delete(1,3);
        return sb + "]";
        // .String()이 들어가야되지만 자동형변환
    }
    // 가장 좋은 방법인듯?
    public static int[] copyOf(int[] arr) {
        copyOf(arr,arr.length);
        // int n = arr.length 로 따로 재고 넣었었는데 바로 했어도 상관없었다.
        // temp를 반환받아 arr에 저장되었으므로 아래 return에 arr을 반환한것
        // 항상 깜박하면 안됨 위에서 나온 arr은 입력받은 어떤 타입의 변수를
        // 메소드 안의 변수로 작용될 arr 외부의 arr과 완전히 다른 arr임 즉 바뀌어도 상관x
        return arr;
        //return copyOf(arr,arr.length); 더 간편한 방법 리턴받을때 바로 호출했으면 됬다.
    }

    public static int[] copyOf(int[] arr,int n) {
        // 돌려받기 원하는게 int[] 이므로 항상 돌려 받기 원하는값 파악을 하고 리턴에 넣어야된다.
        int[] temp = new int[n];
        // 항상 배열을 만들떄 []이 들어가야됨 없으면 배열이 아님
        for (int i=0;i<n;i++)
            temp[i] = arr[i];
        return temp;
        // 배열을 반환
    }
}
