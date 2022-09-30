package com.codegym.debug_try_catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        ReadFile readFile = new ReadFile();
        try {
            readFile.readFile();
            return;
        } catch (Exception ex) {
            ex.printStackTrace();
        }finally {

        }

    }
}
