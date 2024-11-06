package com.green.etc.exam;

public class Exam {
    public static void main(String[] args) {
        MakeMath a = new MakeMath(4,8);
        a.beside();
    }
}

class MakeMath{
    private int a;
    private int b;
    public void beside(){

        for(int n=a;n<=b;n++){
            System.out.println(n);
        }
    }
    MakeMath(int a, int b){
        this.a = a;
        this.b = b;
    }
}
