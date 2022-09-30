package com.codegym.interview;

import java.util.TreeSet;

public class TestTreeSet implements Comparable {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        treeSet.add(new Student("Luong",7));
        treeSet.add(new Student("Quang",5));
        treeSet.add(new Student("Loc",6));



        System.out.println(treeSet);
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
