package com.codegym;


import com.codegym.equals.Money;
import com.codegym.equals.WrongVoucher;
import com.codegym.logger.Log;

import java.io.IOException;
import java.util.Comparator;
import java.util.logging.Level;


abstract class Person{
    abstract void eat();
}
public class Main {
    public static void main(String[] args) throws IOException {


	// write your code here
//        Money income = new Money(55, "USD");
//        Money expenses = new Money(55, "USD");
//        boolean balanced = income.equals(expenses); // FALSE
//
//        System.out.println(balanced);

        /*Log my_log = new Log("log.txt");
        my_log.logger.setLevel(Level.ALL);

        my_log.logger.info("Info message");
        my_log.logger.warning("warning message");
        my_log.logger.severe("Servere message");*/

    }
}
interface HinhHoc{}
interface Bay{}

interface Tron extends HinhHoc, Bay {

}