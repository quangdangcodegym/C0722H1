package com.codegym.arraybasic;
public class ReferenceDataType {

    // Kiểu dữ liệu nguyên thủy: int, long, double
    // Long, Integer, Double:

    public static void main(String[] args) {
        //Wrapper Class
        int number = Integer.parseInt("50");
        System.out.println(number);
        Person p1 = new Person("Tan","Duy", 20 );



        com.codegym.arraybasic.Person p3 = p1;

        p1.changeInfo(p3);
        System.out.println(p3.getFullName());
        System.out.println(p1.getFullName());

    }
}
