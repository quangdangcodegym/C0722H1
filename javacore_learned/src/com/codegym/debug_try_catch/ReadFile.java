package com.codegym.debug_try_catch;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFile {

    public void readFile() throws FileNotFoundException {
        //FileInputStream fileInputStream = new FileInputStream("kk");
        throw new FileNotFoundException("hello");
    }
}
