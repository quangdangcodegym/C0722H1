package com.codegym.comparable;

import java.awt.*;
import java.util.Comparator;

public class ButtonComparator implements Comparator<Button> {
    @Override
    public int compare(Button o1, Button o2) {
        if(o1.getSize().width>o2.getSize().getWidth()){
            return 1;
        }else if(o1.getSize().getWidth()==o2.getSize().getWidth()){
            return 0;
        }
        return -1;
    }
}
