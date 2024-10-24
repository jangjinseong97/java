package com.green.day13;

import com.green.day08.ch11.BuildString;

public class MyArrayList {
    private int [] arr ;

    public MyArrayList(){
        arr = new int[0];
    }

    public String toString(){
        StringBuilder a = new StringBuilder("[");
        for(int i=0;i<arr.length;i++){
            a.append(arr[i]);
            if(i<arr.length-1) {
                a.append(", ");
            } else{
                break;
            }
        }
        a.append("]");
        return a.toString();
    }

    public String toString2(){
        StringBuilder a = new StringBuilder("[");
        int length = 3*arr.length;
        for(int i=0;i<arr.length;i++){
            a.append(arr[i]);
            a.append(", ");
        }
        a.delete(length-1,length+1);
        a.append("]");
        return a.toString();
    } // delete 때문에 0칸일떄 에러 예외처리를 안해줘서

    public String toString3(){
        StringBuilder a = new StringBuilder("[");
        for(int i :arr){
            a.append(i);
            a.append(", ");
        }
        a.delete((3*arr.length)-1,(3*arr.length)+1);
        a.append("]");
        return a.toString();
    }

    public void add(int a){
        int[] tmp = new int[arr.length +1];
        for(int i=0;i<arr.length;i++){
            tmp[i]=arr[i];
        }
//        tmp[arr.length]=a; 이것도 가능 연산상 이게 유리
        arr = tmp; // 위는 arr.length 아래는 arr.length-1인 이유는
        // 위는 arr을 tmp로 덮어쓰기전이므로 아직 tmp에 비해 1칸이 작아서 아래는 덮어쓰고 나서라서
        arr[arr.length-1]=a;
    }
//    static int k = 0;
//    public void add1(int a){
//        int[] n = new int[++k];
//        for(int i=0;i<arr.length;i++){
//            n[i]=arr[i];
//        }
//        n[k-1]=a;
//        arr=n;
//    }
    public int size(){
        return arr.length;
    }
    public void clear(){
        arr = new int[0];
    }
    public void add(int a, int b){
        int [] arr1 = new int[arr.length+1];
        for(int i=0;i<arr.length;i++){
            if(i<a){
                arr1[i]=arr[i];
            } else if(i==a) {
                arr1[i]=b;
            } else {
                arr1[i]=arr[i-1];
            }
        }
        arr1[arr.length]=b;
        arr = arr1;
    }
    public int indexOf(int a) {
        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                return i;
            }
        }
        return -1;
    }


    // 아직 미완성
    public int lastIndexOf(int a){
        for(int i=arr.length;i<0;i--){
            if(a == arr[i]){
                return i;
            }
        }
        return -1;
    }
    // 아직 미완성


    public int remove(){
        int [] a = new int[arr.length-1];
//        int k=0;
        for(int i=0;i<arr.length-1;i++){
            a[i] = arr[i];
//            k++;
        }
       int n = arr[arr.length-1];
        arr=a;
        return n;
    }
}
