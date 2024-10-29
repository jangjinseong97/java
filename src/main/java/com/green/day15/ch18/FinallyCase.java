package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args) {

        try {
            Path path = Paths.get("D:/Simple.txt");
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write('A');
            writer.write("Finally~"); // 여기서 예외가 발생되었다면 아래의 close(); 가 실행안됨
            writer.close();
        } catch (IOException e) {
        }
    }
}

class FinallyCase2{
    public static void main(String[] args) {
//        BufferedWriter writer = null;
//        try {
//            Path path = Paths.get("D:/Simple.txt");
//            writer = Files.newBufferedWriter(path);
//            writer.write('A');
//            writer.write("Finally~"); // 여기서 예외가 발생되었다면 아래의 close(); 가 실행안됨
//            writer.close();
//        } catch (IOException e) {
//            try {
//                writer.close(); // 2번 쓰이는셈이므로 아에 외부에 try catch문으로 실행시키면 된다.
//                e.printStackTrace();
//            } catch (IOException ex) {
//            }
//        }
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt");
            writer = Files.newBufferedWriter(path);
            writer.write('A');
            writer.write("Finally~"); // 여기서 예외가 발생되었다면 아래의 close(); 가 실행안됨
            return;
        } catch(IOException e){

        }
        System.out.println("return");
        try{
            if(writer != null){
                writer.close();
                }
            } catch (IOException e){ // 뒤에 변수 넣어주는거 잊지 말기
        }
    }
}
class FinallyCase3{
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt");
            writer = Files.newBufferedWriter(path);
            writer.write('A');
            writer.write("Finally~");
            return;
        } catch(IOException e){
        } finally { //예외의 발생 유무와 상관없이 무조건 실행 중간에 try문이 취소 되더라도 무조건 실행
            //return continue 를 만나도 적용
            try{
                System.out.println("return");
                if(writer != null){
                writer.close();
                }
            } catch (IOException e){
            }
        }
    }
}