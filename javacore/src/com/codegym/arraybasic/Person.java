package com.codegym.arraybasic;

public class Person {
    public String firstName;    // null
    public String lastName;     // null
    private int age;             // 0
    public String address;      // null

    public Person(String _firstName, String _lastName, int _age){
        this.firstName = _firstName;
        this.lastName = _lastName;
        this.age = _age;
    }
    public Person(){
        this.firstName = "A";
        this.lastName = "B";
    }
    public String getFullName(){
        return this.firstName + this.lastName + " country: " + Person.country;
    }

    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public static void name(){
        Person.prinName();
    }
    public static void prinName(){
        System.out.println("hello");
    }
    public static String country = "Viet Nam";

    public void changeInfo(Person person){
        person.lastName = "C7" + person.lastName;
    }

}
