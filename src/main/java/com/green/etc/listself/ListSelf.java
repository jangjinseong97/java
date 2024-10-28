package com.green.etc.listself;

import java.lang.reflect.Array;

public class ListSelf {
    private Object[] list;

    public ListSelf(){
        list = new Object[0];
    }

    public String toString(){
        StringBuilder a = new StringBuilder("[");
        for(int i=0;i<list.length;i++){
            a.append(list[i]);
            if(i<list.length-1) {
                a.append(", ");
            } else{
                break;
            }
        }
        a.append("]");
        return a.toString();
    }

    public void add(Object ob){
        Object[] tmp = new Object[list.length+1];
        for(int i=0;i<list.length;i++){
            tmp[i] = list[i];
        }
        tmp[list.length] = ob;
        list = tmp;
    }

    public void add(int n, Object ob){
        Object[] tmp = new Object[list.length+1];
        for(int i=0;i<list.length;i++){
            if(i<n){
                tmp[i] = list[i];
            } else {
                tmp[i+1] = list[i];
            }
        }
        tmp[n] = ob;
        list = tmp;
    }
    public void remove(int n){
        Object[] tmp = new Object[list.length-1];
        for(int i=0;i<tmp.length;i++){
            if(i<n){
                tmp[i] = list[i];
            } else {
                tmp[i] = list[i+1];
            }
        }
        list = tmp;
    }
    public int size(){
        return list.length;
    }
    public int index(Object ob){
        for(int i=0;i<list.length;i++){
            if(list[i].equals(ob)){
                return i;
            }
        }
        return -1;
    }
    public int lastIndex(Object ob){
        for(int i=list.length-1;i>=0;i--){
            if(list[i].equals(ob)){
                return i;
            }
        }
        return -1;
    }

    public void clear(){
        list = new Object[0];
    }
    public void sum(){
        int sum = 0;
        for(int i=0;i<list.length;i++){
            if(Integer.class.isInstance(list[i])){
                sum += (int)list[i];
            }
        }
        System.out.println(sum);
    }
    public void intDelete(){
        Object [] tmp = list;
        int a= 0;
        for(int i=0;i<tmp.length;i++){
            if(Integer.class.isInstance(list[a])) {
                remove(a);
                a--;
            }
            a++;
        }
    }
}
