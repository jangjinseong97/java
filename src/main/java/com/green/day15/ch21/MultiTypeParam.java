package com.green.day15.ch21;

public class MultiTypeParam {
    public static void main(String[] args) {
        DBox<String,Integer> box = new DBox<>();
        box.setter("Apple",25);

        System.out.println(box);
    }
}


class DBox<L, R>{
    private L left;
    private R right;

    void setter(L left, R right){
        this.left =left  ;
        this.right = right;
    }
    public String toString(){
        return String.format("%s & %s", left,right);
    }
}