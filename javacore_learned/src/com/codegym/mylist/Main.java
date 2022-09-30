package com.codegym.mylist;

import java.awt.*;
import java.awt.image.ImageProducer;
import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo 1 biến listProduct có kiểu danh sách Product
//        MyList<Product> listProduct = new MyList<>();
//        listProduct.add(new Product("Iphone 13", 5000.0, 2));
//        listProduct.add(new Product("Iphone 17", 3000.0, 1));
//        listProduct.add(new Product("Iphone 13", 4000.0, 5));
//        listProduct.add(new Product("Iphone 13", 6000.0, 2));
//
//        listProduct.printList();

        // Tạo 1 class triển khai interface Comparator
        // Tạo 1 đối tượng MyComparatorImplAmount
//        Comparator<Product> myComparator = new MyComparatorImplAmount();
//
//        // Sử dụng lớp nặc danh, anonymous class
        // Tạo
//        listProduct.sortInterchangeASC(new Comparator<Product>() {
//            @Override
//            public int compare(Product o1, Product o2) {
//                if(o1.getName().compareTo(o2.getName())>0){
//                    return 1;
//                }else {
//                    if(o1.getName().compareTo(o2.getName())==0){
//                        if(o1.getPrice()> o2.getPrice()){
//                            return 1;
//                        }else {
//                            if(o1.getPrice() < o2.getPrice()){
//                                return -1;
//                            }
//                        }
//                        return 0;
//                    }
//                    return -1;
//                }
//            }
//        });



//        listProduct.sortInterchangeASCComparable();
//
//        listProduct.printList();


        // Sự khác nhau giữa comparable và comparator
//        Button btn1 = new Button("Hoang");
//        Button btn2 = new Button("Hoan");
//        MyList<Button> listButton = new MyList<>();
//        listButton.add(btn1);
//        listButton.add(btn2);

//        Map<Integer, String> mapSimple = new HashMap<>();
//        mapSimple.put(1, "Hoan");
//        mapSimple.put(2, "Luyn");
//        mapSimple.put(3, "Dung");
//        mapSimple.put(4, "Duy");
//        mapSimple.put(1, "Quang");



//
//        System.out.println(mapSimple.keySet());
//        System.out.printf(mapSimple.get(1));

//        Product p1 = new Product("Iphone 11", 11000.0, 2);  // 123
//        Product p2 = new Product("Iphone 11", 11000.0, 2);  // 456
////
////
////        System.out.println("Hashcode p1" + p1.hashCode());
////        System.out.println("Hashcode p2" + p2.hashCode());
////        if(p1.equals(p2)){
////            System.out.printf("2 thang bang nhau");
////        }
////
//        Map<Product, Integer> mapC7 = new HashMap<>();
//        mapC7.put(p1, 2);
//        mapC7.put(p2, 4);
////
//        Product p3 = new Product("Iphone 11", 11000.0, 2);
//        Integer p = mapC7.get(p3);
//        System.out.println(p);



        ArrayList<Product> listProduct = new ArrayList<>();
        listProduct.add(new Product("Iphone 13", 5000.0, 2));
        listProduct.add(new Product("Iphone 17", 3000.0, 1));
        listProduct.add(new Product("Iphone 13", 4000.0, 5));
        listProduct.add(new Product("Iphone 13", 6000.0, 2));

//        Consumer<Product> c = new MyComsumerImpl();
        listProduct.forEach(new Consumer<Product>() {
            @Override
            public void accept(Product product) {
                System.out.println("C: " + product);
            }
        });







    }
}
