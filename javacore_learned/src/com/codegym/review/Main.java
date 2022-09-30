package com.codegym.review;

public class Main {
    public static void printPublicStatic() {
        System.out.println("Hello public static void");
    }
    static public void printStaticPublic() {
        System.out.println("Hello static public void");
    }
    final public static void main(String[] args) {
        printPublicStatic();
        printStaticPublic();
    }
}
