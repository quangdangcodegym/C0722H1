package com.codegym.mysql;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {



        ProductDAO productDAO = new ProductDAO();
        try {
            FileWriter myWriter = new FileWriter("sql.txt");
            for(int i=0;i<100000000;i++){
                Product p = new Product(i);
                productDAO.insertUser(p);
            }
            myWriter.close();
        } catch (IOException | SQLException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }finally {

        }
    }
}
