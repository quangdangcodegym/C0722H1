package com.codegym.stackheap;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person p1 = new Person(21, "Tien");
        System.out.println(p1);

        Person p2 = new Person(21, "Tienn");
        System.out.println(p2);

//        p1 = p2;
//        System.out.println(p1);


        Person [] arrPerson = {p1, p2};
        arrPerson[0] = null;
        for (Person p : arrPerson) {

            System.out.println(p);
        }
        System.out.println(p1);

//        List<Person> list = Arrays.asList(p1,p2);
//        Person t = list.get(0);
//        t.setAge(1);
//
//        printList(list);
    }
    public static void printList(List<Person> list) {
        list.forEach(person -> {
            System.out.println(person);
            System.out.println("Name: " + person.getName() +" Age: " + person.getAge());
        });
    }
}
