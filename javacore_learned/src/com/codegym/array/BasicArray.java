package com.codegym.array;

public class BasicArray {
    public static void main(String[] args) {
        // So sánh chuối
        // equal: so sanh bang, compareTo: so sánh với chuỗi khác
        // contain: có chứa chuỗi con không, isEmpty: kiểm tra chuổi rỗng
        // equalsIgnoreCase: so sánh bằng không phân biệt hoa thường
        String [] students = {"Hoan", "Cuong", "Loi", "Duy", "Loi"};
        String name = "Loi";


        int count = 0;
        for(int i=0;i< students.length;i++){
            if(students[i].equalsIgnoreCase(name)){
                count++;
            }
        }
        System.out.printf("Lop co %d ten la %s", count, name);
    }
}
