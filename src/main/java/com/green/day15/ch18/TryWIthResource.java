package com.green.day15.ch18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TryWIthResource {
    public static void main(String[] args) {
        Path path = Paths.get("D:/Simple.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path);
            Scanner scan = new Scanner(System.in);) {
            writer.write('A');
            writer.write("Finally~");
        } catch(IOException e){ // tru catch 리소스 finally 없이도 가능
        }
        /*
        AutoCloseable 인터페이스를 상속받은 객체들은 다 쓸수 있다.
         */

        //try catch 내부의 코드가 많을수록 속도가 느려짐
    }
}
