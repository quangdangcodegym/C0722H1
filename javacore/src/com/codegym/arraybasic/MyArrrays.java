package com.codegym.arraybasic;

public class MyArrrays {
    public  void findNameInArray(String[] arr, String name) {
        int count = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i].equalsIgnoreCase(name)){
                count++;
            }
        }
        System.out.printf("Lop co %d ten la %s", count, name);
    }
    public  void printArray(String [] arr){
        String str = "[";
        for(int i=0;i< arr.length;i++){
            str += arr[i];
            if(i!=arr.length-1){
                str += ",";
            }else{
                str += "]";
            }
        }
        System.out.println(str);
    }
    public  void reverseArray(String [] arr) {
        for(int i=0; i< arr.length/2;i++){
            String temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
    }

    public  String findMaxName(String [] students) {
        String str= students[0];
        for (int i=0;i< students.length;i++){
            if (students[i].trim().length()>str.trim().length()){
                str=students[i];
            }
        }
        return str;
    }

    public  int findMax(String [] students) {
        int maxChar = 0;
        int indexMax = 0;
        for (int i = 0; i < students.length; i++) {
            if(students[i].toCharArray().length>maxChar){
                maxChar = students[i].toCharArray().length;
                indexMax = i;
            }
        }
        System.out.println(students[indexMax]);
        return indexMax;
    }


}
