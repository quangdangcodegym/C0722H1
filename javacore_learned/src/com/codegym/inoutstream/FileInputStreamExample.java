package com.codegym.inoutstream;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.ByteBuffer;

public class FileInputStreamExample {
    public static void main(String args[]) throws IOException {

        FileInputStream fin = null;
        try {
            fin = new FileInputStream("testout.txt");
/*            int b1 = fin.read() & 0xFF;

            System.out.print((char) b1);

            int b2 = fin.read() & 0xFF;
            System.out.print((char) b2);

            int b3 = fin.read() & 0xFF;
            System.out.print((char) b3);

            int b4 = fin.read() & 0xFF;
            System.out.print((char) b4);

            byte [] bytesArr = {(byte)b1,(byte)b2,(byte)b3,(byte)b4};
            int intValue = fromByteArray(bytesArr);*/

            //   AAPAAP
            //{0,0,0,65(A),65(A),80(P),65(A),5(), 65(A),80(P) }
            // [0,0,0,65,65,80,65,5,65,80]
            /*int arr[] = new int[10];
            int numberByte = fin.available();
            for(int i=0;i<10;i++){
                arr[i] = fin.read();
            }
            printIntArray(arr);*/

//
            /*
            Offset là vị trí trên mảng byte: offset=2
            byte []arr  = new byte[6];
            int c = fin.read(arr, 2, 4);
            */
            byte []arr  = new byte[6];
            int c = fin.read(arr);



            int d = fin.read();     // Đọc 1 byte dữ liệu
            int d1 = fin.read();
            int d2 = fin.read();

            byte []arr1  = new byte[6];
            int e = fin.read(arr1, 0, 1);

            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fin.close();
        }
    }
    public static  int fromByteArray(byte[] bytes) {
        return ByteBuffer.wrap(bytes).getInt();
    }

    public static void printIntArray(int [] arr){
        String t = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                t = t + arr[i] + "]";
            }else{
                t = t + arr[i] + ",";
            }
        }
        System.out.println(t);
    }
}
