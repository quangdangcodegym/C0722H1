package com.codegym.buffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class QBufferWriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("text.txt");
        //Kiểu dữ liệu char của Java là 2 bytes.
        BufferedWriter br = new BufferedWriter(writer,100);
        br.write("12345678901234567890");
        br.newLine();
        br.write("1234567890");
        br.newLine();
        br.write("1");
        br.newLine();
        br.flush();
        br.write("123");
        br.close();

        System.out.println("done!");
    }
}
