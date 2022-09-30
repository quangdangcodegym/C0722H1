package com.codegym.staticblock;

public class Student {
    public static String name = "";
    static {
        name = "codegym";
    }

    public static String getName() {
        System.out.println("getName");

        name = "codegym1";
        return name;
    }
    public static String getStudentName() {
        System.out.println("getStudentName");
        return name;
    }
}
