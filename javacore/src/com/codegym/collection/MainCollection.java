package com.codegym.collection;

import com.codegym.myarraylist.MyList;

import java.util.*;

public class MainCollection {
    public static void main(String[] args) {

//        List<String> list1 = new ArrayList<>();
//        List<String> list2 = new List<String>();    // Khong the tao doi tuong tu 1 interface
//        AbstractList<String> list3 = new ArrayList<>();

//        // Arraylist cho phep trung lap
        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Loi");
//        list.add("Dung");
//        list.add("Cuong");
//        list.add("Duy");
//        list.add("Loi");
//        System.out.println(Arrays.toString(list.toArray()));


//        TreeSet<Integer> tSet = new TreeSet<>();
//        SortedSet<String> sSet = new TreeSet<>();
//        Set<Integer> set = new TreeSet<>();
//        set.add(3);
//        set.add(5);
//        set.add(7);
////        set.toArray() => returrn Object[]
//        System.out.println(Arrays.toString(set.toArray()));
//        set.add(5);
//        System.out.println(Arrays.toString(set.toArray()));

//        SortedSet<String> sSet = new TreeSet<>();
//        sSet.add("Hoang");
//        sSet.add("Hoan");
//        sSet.add("Loan");
//        sSet.add("Cuong");
//        sSet.add("Hoan");
//        System.out.println(Arrays.toString(sSet.toArray()));

//        Set<Person> sPerson = new TreeSet<>();
//        sPerson.add(new Person("Hoan", 20));
//        sPerson.add(new Person("Dung", 18));
//        sPerson.add(new Person("Luyn", 22));
//        sPerson.add(new Person("Hoan", 20));
//
//        System.out.println(Arrays.toString(sPerson.toArray()));

//        AbstractQueue<String> abstractList = new PriorityQueue<>();
//        abstractList.

//        SortedSet<String> sSet = new TreeSet<>();
//        sSet.add("Hoang");
//        sSet.add("Hoan");
//        sSet.add("Loan");
//        sSet.add("Cuong");
//        sSet.add("Hoan");
//
////        Iterator<String> iterator = sSet.iterator();
////        while (iterator.hasNext()) {
////            System.out.println(iterator.next());
////        }
//        String [] strings = new String[10];
//        ArrayList<String> strinArrays = new ArrayList<>();

        // size=0, [null, null, null, null, null, null, null, null, null, null]
        MyList<String> myList = new MyList<>();

        // size=1, ["Hoan", null, null, null, null, null, null, null, null, null]
        myList.add("Hoan");

        // size=2, ["Hoan", "Duy", null, null, null, null, null, null, null, null]
        myList.add("Duy");

        // size=10, ["Hoan", "Duy", "Quang", "Cuong", "Khoa", "Thu", "Luong", "Phuc", "Vinh", "Hai"]
        myList.add("Quang");
        myList.add("Cuong");
        myList.add("Khoa");
        myList.add("Thu");
        myList.add("Luong");
        myList.add("Phuc");
        myList.add("Vinh");
        myList.add("Hai");
        myList.printArray();

        myList.add("Luynh");
        myList.printArray();
        // size=10, ["Hoan", "Duy", "Quang", "Cuong", "Khoa", "Thu", "Luong", "Phuc", "Ving", "Hai", null, null, null.....null]
    }
}
