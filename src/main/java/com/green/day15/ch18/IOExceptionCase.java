package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.*;
import java.nio.file.Paths;

public class IOExceptionCase {
    public static void main(String[] args) {
        try {
            md1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("-------------");
    }
    public static void md1() throws IOException{
        md2();
    }
    public static void md2() throws IOException {
        Path path = Paths.get("D:/Simple.txt"); // 절대경로 ( full 경로)
        BufferedWriter writer = Files.newBufferedWriter(path);
        // newBufferedWriter
        // 1 메소드 2 static 3 리턴메소드 타입 BufferedWriter 4 파라미터 타입 Path 5. throws 메소드
        writer.write('A');
        writer.write("Hi~");
        writer.close();
    }
}
