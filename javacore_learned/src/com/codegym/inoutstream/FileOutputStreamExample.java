package com.codegym.inoutstream;

import com.codegym.colorable.Rectangle;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample {
    public static  byte[] toByteArray(int value) {
        return  ByteBuffer.allocate(4).putInt(value).array();
    }
    public static void main(String args[]) throws IOException {
        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream("testout.txt");
/*            fout.write(65);
            fout.write(80);
            fout.write(85);
            byte [] bytes = {65, 80, 85};

            byte a = 65;
            fout.write(bytes);

            fout.write(65);
            int a = 130;
            String s = "vavav";
            fout.write(s.getBytes(StandardCharsets.UTF_8));
            fout.write(data);
            */



            int a = 65;     //Số nguyên 65 được lưu trữ 4byte: 0,0,0,65(A)
            byte b = 5;
            byte[] bytes = {65, 80};

            //NULLNULLNULLAAPAAP
            //{0,0,0,65(A),65(A),80(P),65(A),5(), 65(A),80(P) }
            byte[] byteIntegers = toByteArray(a);

            // Chuyển số 5 thành 4 byte nhị phân: { 0,0,0,65(A)}
            fout.write(byteIntegers); //NULLNULLNULLA is: 0,0,0,65(A)
            fout.write(65);         // 65 is: A     (65A)

            fout.write(80);         // 80 is: P      (80P)
            fout.write(a);             // 65 is: A      (65A)
            fout.write(b);             // 5  is:     5()

            fout.write(bytes);          // {65, 80}is:  APAP

            System.out.println("success...");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fout.close();
        }
    }
}
