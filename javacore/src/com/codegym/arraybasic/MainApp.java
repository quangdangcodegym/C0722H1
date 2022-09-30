package com.codegym.arraybasic;

import com.codegym.staticpackage.*;

import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Student s = new Student();


        // p: tên biến, Person: kiểu dữ liệu Person
        // new Person(); khởi tạo 1 đối tượng Person
//        int a = 5;
//        Person p2 = null;
//        p2.getFullName();


//        Person p1 = new Person("Hoan", "Thanh", 20);
//        p1.getAge();
//        p1.setAge(30);
//        System.out.println(p1.getAge());


//        MyArrrays arrayUtils = new MyArrrays();
//        String[] list = {"Hoan", "Loi", "Duy"};
//        arrayUtils.printArray(list);
//
//        Arrays.toString(list);
        Person p = new Person("Tan", "Dung", 18);
        System.out.println(p.getFullName());
        Person p1 = new Person("Tan", "Dung", 18);
        Person p2 = new Person("Tan", "Dung", 18);

        Scanner scanner = new Scanner(System.in);

    }

}
