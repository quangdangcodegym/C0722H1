package com.codegym.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteampApi {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(0);
        list.add(5);

        BinaryOperator<Integer> b = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                int total = integer + integer2;
                System.out.println("integer: " + integer + " -- integer2: " + integer2 + " result: " + total);
                return integer + integer2;
            }
        };

        // User reduce
        Optional<Integer> total = list.stream().reduce(b);
        System.out.println(total.get());
        List<Integer> l = list.stream().map(integer -> {
           return integer*2;
        }).collect(Collectors.toList());

        Function<Integer, Integer> func = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer*2;
            }
        };
//        List<Integer> l = list.stream().map(func).collect(Collectors.toList());
        Stream<Integer> stream = list.stream().map(func);
        List<Integer> l1 = stream.collect(Collectors.toList());



        l.forEach(integer -> {
            System.out.println(integer);
        });

        Stream<Integer> streamFilter = list.stream().filter(integer -> {
            if(integer>0){
                return true;
            }else{
                return false;
            }
        });
        List<Integer> lFilter = streamFilter.collect(Collectors.toList());
        lFilter.forEach(integer -> {
            System.out.println(integer);
        });

//        public Optional<Object> findMax(Comparator<Object> comparator){
//            Optional<Object> max = Optional.empty();
//            max = Optional.of(elements[0]);
//            for (int i = 0; i < size; i++) {
//                if(comparator.compare(max.get(), elements[i])<0){
//                    max = Optional.of(elements[i]);
//                }
//            }
//            return max;
//        }
//
//        public void forEach(Consumer c){
//            for (int i = 0; i < size; i++) {
//                c.accept(elements[i]);
//            }
//        }
        Optional<Integer> streamMax = list.stream().max((o1, o2) -> {
            return o1-o2;
        });


        System.out.println("Max in list: " + streamMax.get());
    }
}
