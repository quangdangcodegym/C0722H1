package com.codegym.equals;

import com.codegym.streamapi.Person;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public int b = 5;
    public Integer c = 5;
    public static List<Person> initPersons() {
        Person p1 = new Person(1, 20, "Dang Van Quang");

        Person p2 = new Person(2, 30, "Truong Van Phon");
        Person p3 = new Person(3, 20, "Tran van Cu");
        Person p4 = new Person(5, 30, "Thuan Ho");
        List<Person> list = Arrays.asList(p1,p2,p3,p4);
        return list;
    }
    public static void main(String[] args) {
        Person p1 = new Person(1, 20, "Dang Van Quang");
        System.out.println(p1.hashCode());
        Person p2 = new Person(1, 20, "Dang Van Quang");
        System.out.println(p2.hashCode());

        

        /*//Hàm equals mặc định sẽ so sánh bằng địa chỉ p1 và p2 nên để 2 p1,p2 bằng nhau cần overide lại
        // phương thức equals và hashcode

        // Phương thức toString trả về chuỗi địa chỉ của 2 đối tượng p1, p2
        System.out.println("ToString obj p1 and p2");
        System.out.println(p1.toString());
        System.out.println(p2.toString());

        // không phải là 1 chuổi cố định có thể thay đổi tại vì ô nhớ mỗi thời điểm là khác nhau
        // com.codegym.streamapi.Person@49e4cb85 ### com.codegym.streamapi.Person@2133c8f8
        System.out.println("Address memory obj p1 and p2");
        System.out.println(p1);
        System.out.println(p2);

        // Mã hashcode được băm dựa vào chuỗi toString của đối tượng
        System.out.println("Hashcode obj p1 and p2");
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());


        System.out.println("Hashcode string");
        String name = "Quang";
        String name1 = name;
        System.out.println(name.hashCode());
        System.out.println(name1.hashCode());

        int a = 5;
        //System.out.println(a.hashCode()); // Error: java: int cannot be dereferenced

        Main main = new Main();
        //System.out.println(main.b.hashCode()); // Erro: java: int cannot be dereferenced

        System.out.println(main.c.hashCode()); // Erro: java: int cannot be dereferenced

        Double d = 5.0d;
        System.out.println(d.hashCode());
        Integer e = 5;
        System.out.println(e.hashCode());


        System.out.println("com.codegym.streamapi.Person@49e4cb85".hashCode()); // -1056233990
        System.out.println("com.codegym.streamapi.Person@49e4cb85".hashCode()); // -1056233990

        String n1 = "com.codegym.streamapi.Person@49e4cb85";
        String n2 = "com.codegym.streamapi.Person@49e4cb85";
        System.out.println(n1.hashCode()); // -1056233990
        System.out.println(n2.hashCode()); // -1056233990*/

    }
}
