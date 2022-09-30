package com.codegym.streamapi;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static String name;

    public static List<Person> initPersons() {
        Person p1 = new Person(1, 20, "Dang Van Quang");
        Person p2 = new Person(2, 30, "Truong Van Phon");
        Person p3 = new Person(3, 20, "Tran van Cu");
        Person p4 = new Person(5, 30, "Thuan Ho");
        List<Person> list = Arrays.asList(p1,p2,p3,p4);
        return list;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = scanner.nextLine();

        if(enter.equals("")){
            System.out.print("Enter");
        }
//        char chars = enter.charAt(0);
//
//
//        char ch = '\n';
//        int asciiCode = ch;
//        int asciiValue = (int)ch;
//        System.out.println("ASCII value of "+ch+" is: " + asciiCode);
//        System.out.println("ASCII value of "+ch+" is: " + asciiValue);
//        System.out.println("----------------------------");
//        System.out.println("Chương trình nay được đăng tại Freetuts.net");


    }
}
